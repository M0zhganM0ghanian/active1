package helper;

import java.sql.Time;
import java.util.Calendar;
import java.util.HashMap;
//import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

import operation.NullOrderException;
import operation.intDefaultValueException;
import types.Order;

public class Filling {

//	public Filling() {
//		// TODO Auto-generated constructor stub
//	}

	
	public static int calculatePriority(Time latestTime) throws NullPointerException{
	//public int calculatePriority(){
		if(latestTime == null){
			throw new NullPointerException();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(latestTime);

		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
//		System.out.println("Hour : " + hour);
//		System.out.println("Minute : " + minute);
		
		return (hour - 6) * 4 + minute / 15 + 1;
	}
	
	public static int insertToPriority(int priorityNum, Order o, HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority) throws NullOrderException, intDefaultValueException{
		//int priorityNum = calculatePriority(o.getLatestTime());
		if(o == null){
			throw new NullOrderException("*****No order has been sent to fill in priority table*******");
		}
		if(priorityNum == 0){
			throw new intDefaultValueException("*****No priorityNum has been sent to fill in priority table*******");
		}
		int sectionNum = o.getSection();
		System.out.println("+++ before insert to priority, concurrenthashmap sectioncontainer size is: " + priority.get(priorityNum).size());

//		System.out.println("+++ before insert to priority, Queue size is: " + priority.get(priorityNum).get(sectionNum).size());
//
//		System.out.println("+++ before insert to priority, Queue size is: " + priority.get(priorityNum).get(sectionNum).size());

		System.out.println("+++ before insert to priority, Queue size is: " + priority.get(priorityNum).get(sectionNum).size());
		
		System.out.println("+++ before insert to priority, Queue is: " + priority.get(priorityNum).get(sectionNum).toString());

		System.out.println("+++ before insert to priority, prioritynum: " + priorityNum + "  sectionnum:  " + sectionNum);

		//Queue<Order> orderContainer = new LinkedList<Order>();
		priority.get(priorityNum).get(sectionNum).add(o);
		//ConcurrentHashMap<Integer, Queue<Order>> sectionsContainer = new ConcurrentHashMap<Integer, Queue<Order>>();
		System.out.println("+++ after insert to priority, Queue size is: " + priority.get(priorityNum).get(sectionNum).size());
		System.out.println("+++ after insert to priority, prioritynum: " + priorityNum + "  sectionnum:  " + sectionNum);

		//orderContainer.add(o);
		//sectionsContainer.put(sectionNum, orderContainer);
		//priority.put(priorityNum, sectionsContainer);
		
		//return priorityNum;
		return sectionNum;

	}
	
	//private void insertToSection(int sectionNum, int priorityNum,  HashMap<Integer, ConcurrentHashMap<Integer, Integer>> sections){
	public static void insertToSection(int sectionNum, int priorityNum,  ConcurrentHashMap<Integer, int[]> sections) throws intDefaultValueException{
			
	//with previous section design
//		if(sections.get(sectionNum).get(priorityNum) != null){
//			sections.get(sectionNum).put(priorityNum, sections.get(sectionNum).get(priorityNum) + 1);
//		}else{
//			sections.get(sectionNum).put(priorityNum, 1);
//		}
		
		if(priorityNum == 0 || sectionNum == 0){
			throw new intDefaultValueException("*****No priorityNum/sectionNum has been sent to fill in section table*******");
		}
		System.out.println("e");
		System.out.println("sectionNum  " + sectionNum);
		System.out.println("priorityNum  " + priorityNum);
		System.out.println("sections size " + sections.size());
		System.out.println("sections priorityNum size " + sections.get(sectionNum).length);


///////////////////////////////// here is the problem /////////////////////////
		sections.get(sectionNum)[priorityNum] += 1;
		System.out.println("f");

		sections.get(sectionNum)[0] += 1;
		System.out.println("g");

	}
	
//	public void fillTables(Order o, HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority, 
//			HashMap<Integer, ConcurrentHashMap<Integer, Integer>> sections){
	public static void fillTables(Order o, HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority, 
				ConcurrentHashMap<Integer, int[]> sections) throws NullOrderException, intDefaultValueException{	
		System.out.println("a");

		int priorityNum = calculatePriority(o.getLatestTime());
		System.out.println("order id is: " + o.getId() + "   order priority is:  " + priorityNum);
		System.out.println("b");

		int sectionNum = insertToPriority(priorityNum, o, priority);
		System.out.println("c");

		insertToSection(sectionNum, priorityNum, sections);
		System.out.println("d");

	}
}
