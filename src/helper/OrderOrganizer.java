package helper;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

import operation.intDefaultValueException;
import types.Order;

public class OrderOrganizer {

	public OrderOrganizer() {
		// TODO Auto-generated constructor stub
	}
	
	private int nextPriority(){
		
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		return (hour - 6) * 4 + minute / 15 + 1;
	}
	
	private Stream<Integer> getSectionsFromHighestPriority(int nextPriority, HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority) throws intDefaultValueException{
		
		if(nextPriority == 0){
			throw new intDefaultValueException("*****No nextPriority has been sent to getSectionsFromHighestPriority*******");
		}
		
		System.out.print("next priority is :  " + nextPriority + "   hh.....");
		int nextPriorityFinder = nextPriority;
//		while(priority.get(nextPriorityFinder) == null &&  nextPriorityFinder <= 72){
//			nextPriorityFinder += 1;
//		}
		while(priorityIsEmpty(nextPriorityFinder, priority) &&  nextPriorityFinder <= 72){
			nextPriorityFinder += 1;
			//System.out.print(" next found priority is :  " + nextPriorityFinder + "   .....");

		}
		if(nextPriorityFinder > 72){
			throw new IndexOutOfBoundsException("******TRY TO REACH INDEX OUT OF BOND IN AN Empy Priority table*******");
		}
		int i = nextPriorityFinder;
		Stream<Integer> res = null;

//		System.out.print(" next found priority is :  " + nextPriorityFinder + "   .....");
//		System.out.print(" next found priority contains  :  " + priority.get(nextPriorityFinder).keySet().parallelStream().filter(a ->checkQueueSize(i, priority, a)).count());

		return  priority.get(nextPriorityFinder).keySet().parallelStream().filter(a ->checkQueueSize(i, priority, a));
		
	}
	private boolean checkQueueSize(int nextPriority, HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority, int sectionNum) {
		if(nextPriority == 0 || sectionNum == 0 ){
			try {
				throw new intDefaultValueException("*****No nextPriority/sectionNum has been sent to checkQueueSize*******");
			} catch (intDefaultValueException e) {
				// TODO Auto-generated catch block
				System.out.println("either nextpriority or sectionNum are 0. ");
				e.printStackTrace();
			}
		}
		boolean res = false;
		try{
			System.out.print("  queue size in filter : " + priority.get(nextPriority).get(sectionNum).size());
			res = priority.get(nextPriority).get(sectionNum).size() > 0 ;
		}catch(IndexOutOfBoundsException e){
			System.out.println("The specified index does not exist. " +
					"Please correct the error.");
		}
		//System.out.print("  queue size in filter : " + priority.get(nextPriority).get(sectionNum).size());
		//return priority.get(nextPriority).get(sectionNum).size() > 0 ;
		return res;
	}
	
	private boolean priorityIsEmpty(int nextPriority, HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority){
		
		if(nextPriority == 0){
			try {
				throw new intDefaultValueException("*****No nextPriority has been sent to priorityIsEmpty*******");
			} catch (intDefaultValueException e) {
				// TODO Auto-generated catch block
				System.out.println(" nextpriority is 0. ");
				e.printStackTrace();
			}
		}
		
		try{
			for(int i = 1; i < 9 ; i++){
				if(priority.get(nextPriority).get(i).size() > 0) 
					return false;
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("The specified index does not exist. " +
					"Please correct the error.");
		}
		
		//System.out.print("  queue size in filter : " + priority.get(nextPriority).get(sectionNum).size());

		System.out.println(" priority is empty and got stock here");
		return true;
	}
	
	private boolean checkMin(int sectionNum, ConcurrentHashMap<Integer, int[]> sections){
		
		try{
			if(sections.get(sectionNum)[0] > 0){
				return true;
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("The specified index does not exist. " +
					"Please correct the error.");
		}
		return false;
		
	}
	
	private ArrayList<Integer> getPrioritiesFromSection(int sectionNum, ConcurrentHashMap<Integer, int[]> sections, int maxOrders, int nextPriority){
		if(nextPriority == 0 || sectionNum == 0 ){
			try {
				throw new intDefaultValueException("*****No nextPriority/sectionNum has been sent to checkQueueSize*******");
			} catch (intDefaultValueException e) {
				// TODO Auto-generated catch block
				System.out.println("either nextpriority or sectionNum are 0. ");
				e.printStackTrace();
			}
		}
		
		ArrayList<Integer> priorityListFromSection = new ArrayList<Integer>();
		int i = nextPriority;
		int j = maxOrders;
		try{
			while(i < 73 && j > 0){
				if(sections.get(sectionNum)[i] > 0){
					j -= sections.get(sectionNum)[i];
					priorityListFromSection.add(i);
				}
				i++;
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("The specified index does not exist. " +
					"Please correct the error.");
		}

			
		return priorityListFromSection;
	}
	
	private void deleteFromSections(int sectionNum, ConcurrentHashMap<Integer, int[]> sections, int priorityNum, int numOfDeductedOrders){
		
		if(priorityNum == 0 || sectionNum == 0 ){
			try {
				throw new intDefaultValueException("*****No priorityNum/sectionNum has been sent to deleteFromSections*******");
			} catch (intDefaultValueException e) {
				// TODO Auto-generated catch block
				System.out.println("either priorityNum or sectionNum are 0. ");
				e.printStackTrace();
			}
		}
		try{
			sections.get(sectionNum)[priorityNum] -= numOfDeductedOrders;
			sections.get(sectionNum)[0] -= numOfDeductedOrders;
		}catch(IndexOutOfBoundsException e){
			System.out.println("The specified index does not exist. " +
					"Please correct the error.");
		}

	}
	
	//no need to check for exception
	private boolean checkInvalidPriority(int nextPriority, int sectionNum, ConcurrentHashMap<Integer, int[]> sections){
		
		if(nextPriority == 0 || sectionNum == 0 ){
			try {
				throw new intDefaultValueException("*****No nextPriority/sectionNum has been sent to checkInvalidPriority*******");
			} catch (intDefaultValueException e) {
				// TODO Auto-generated catch block
				System.out.println("either nextPriority or sectionNum are 0. ");
				e.printStackTrace();
			}
		}
		
		int i = nextPriority;
		while(i > 0){
			if(sections.get(sectionNum)[i] > 0){
				return false;
			}
			i--;
		}
		return true;
	}
	
	//throws exception for remove
	private ArrayList<Order> deleteFromPriorityAndSection(ArrayList<Integer> priorityListFromSection, ConcurrentHashMap<Integer, int[]> sections,
			HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority, int sectionNum, int maxOrders){
		if(sectionNum == 0 ){
			try {
				throw new intDefaultValueException("*****sectionNum has been sent to deleteFromPriorityAndSection*******");
			} catch (intDefaultValueException e) {
				// TODO Auto-generated catch block
				System.out.println("sectionNum is 0. ");
				e.printStackTrace();
			}
		}
		
		int i = maxOrders;
		int numOfDeductedOrders;
		ArrayList<Order> finalOrdersToPath = new ArrayList<Order>();
		//max number of loop is the same as maxOrders
		try{
			for (int p : priorityListFromSection){
				numOfDeductedOrders = 0;
				while(priority.get(p).get(sectionNum).peek() != null && i > 0){
					finalOrdersToPath.add(priority.get(p).get(sectionNum).remove());
					i-- ;
					numOfDeductedOrders++ ;
				}
				deleteFromSections(sectionNum, sections, p, numOfDeductedOrders);
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("The specified index does not exist. " +
					"Please correct the error.");
		}catch(NullPointerException e){
			System.out.println("Null priorityListFromSection has been sent to deleteFromPriorityAndSection. ");
		}catch(Exception e){
			System.out.println(e.getMessage());
//			System.out.println("The specified index does not exist. " +
//					"Please correct the error.");
		}

		return finalOrdersToPath;
		
	}
	
	public ArrayList<ArrayList<Order>> getFinalOrdersToPath(int maxOrders, HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority, 
			 ConcurrentHashMap<Integer, int[]> sections){
		int nextPriority = nextPriority();
		
		ArrayList<ArrayList<Order>> result = new ArrayList<ArrayList<Order>>();

		//Stream<Integer> sectionsFromHighestPriority = null;
//		while(nextPriority  null){
//			
//		}
		try{
			Stream<Integer> sectionsFromHighestPriority = getSectionsFromHighestPriority(nextPriority, priority);
		//ArrayList<Integer> prioritiesFromSection = new ArrayList<Integer>();
		 
			//ArrayList<ArrayList<Order>> result = new ArrayList<ArrayList<Order>>();

			sectionsFromHighestPriority.parallel().filter(sectionNum -> checkMin(sectionNum, sections)).forEach((sectionNum) -> {
				ArrayList<Integer> prioritiesFromSection = getPrioritiesFromSection(sectionNum, sections, maxOrders, nextPriority);
				result.add(deleteFromPriorityAndSection(prioritiesFromSection, sections,  priority, sectionNum, maxOrders));
		    });
			int ss = result.size();
			System.out.println(" result size is : " + result.size());
			int s;
			for(int j = 0; j< ss; j++){
				s = result.get(j).size();
				System.out.println("path for new section:  ");
				for(int i = 0; i< s ; i++ ){
					System.out.println(result.get(j).get(i).getId());
				}
			}
			
			System.out.println(result.toString());
			System.out.println("  end of path ");

			//return result;

		}catch(intDefaultValueException e){
			System.out.println("my trace is::::");
			//e.printStackTrace();
			System.out.println("end of my trace ::::");
			//System.out.println(e.printStackTrace(s));
		
		}catch(IndexOutOfBoundsException e){
			System.out.println("The specified index does not exist. " +
					"Please correct the error.");
		}catch(NullPointerException e){
			System.out.println("Null value has been sent to getFinalOrdersToPath. ");
		}catch(Exception e){
			System.out.println(e.getMessage());
//			System.out.println("The specified index does not exist. " +
//					"Please correct the error.");
		}
//		ArrayList<ArrayList<Order>> result = new ArrayList<ArrayList<Order>>();
//
//		sectionsFromHighestPriority.parallel().filter(sectionNum -> checkMin(sectionNum, sections)).forEach((sectionNum) -> {
//			ArrayList<Integer> prioritiesFromSection = getPrioritiesFromSection(sectionNum, sections, maxOrders, nextPriority);
//			result.add(deleteFromPriorityAndSection(prioritiesFromSection, sections,  priority, sectionNum, maxOrders));	
//			
//	    });
//		int ss = result.size();
//		System.out.println(" result size is : " + result.size());
//		int s;
//		for(int j = 0; j< ss; j++){
//			s = result.get(j).size();
//			System.out.println("path for new section:  ");
//			for(int i = 0; i< s ; i++ ){
//				System.out.println(result.get(j).get(i).getId());
//			}
//		}
		
//		int s = result.get(0).size();
//		for(int i = 0; i< s ; i++ ){
//			System.out.println(result.get(0).get(i).getId());
//		}
//		System.out.println("path size " + result.size());

//		System.out.println(result.toString());
//		System.out.println("  end of path ");
//
		return result;
	}
	
	
	

}
