package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

import helper.Fetching;
import helper.Filling;
import helper.OrderOrganizer;
import operation.NullOrderException;
import operation.intDefaultValueException;
import types.Order;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws NullOrderException, intDefaultValueException {
 	    
		System.out.println("HI");
		System.out.println("1");
		List<Order> fetchedOrders = new ArrayList<Order>();
		System.out.println("2");
		Queue<Order> orderContainer = new LinkedList<Order>();
		System.out.println("+++ size of orderContainer: " + orderContainer.size());

		System.out.println("3");
		ConcurrentHashMap<Integer, Queue<Order>> sectionsContainer = new ConcurrentHashMap<Integer, Queue<Order>>();
		System.out.println("4");
		for(int i = 1 ; i < 9 ; i++){
			sectionsContainer.put(i, orderContainer);
		}
		
		System.out.println("5");
		
		
		HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>> priority = new HashMap<Integer, ConcurrentHashMap<Integer, Queue<Order>>>();
		System.out.println("6");
/////////// previous for loop
//		for(int i = 1 ; i < 73 ; i++){
//			priority.put(i, sectionsContainer);
//		}
		System.out.println("7");
		/////////////////
		for(int i = 1 ; i < 73 ; i++){
			ConcurrentHashMap<Integer, Queue<Order>> sectionsContainer1 = new ConcurrentHashMap<Integer, Queue<Order>>();
			for(int ii = 1 ; ii < 9 ; ii++){
				Queue<Order> orderContainer1 = new LinkedList<Order>();
				//System.out.println("+++ size of orderContainer1: " + orderContainer1.size());

				sectionsContainer1.put(ii, orderContainer1);
			}
			priority.put(i, sectionsContainer1);
		}
		
		////////////////
		
		//HashMap<Integer, ConcurrentHashMap<Integer, Integer>> sections2 = new HashMap<Integer, ConcurrentHashMap<Integer, Integer>>();
		int[] priorityContainer = new int[73];
		System.out.println("8");
		ConcurrentHashMap<Integer, int[]> sections = new ConcurrentHashMap<Integer, int[]>();
		System.out.println("9");
/////////// previous for loop
//		for(int i = 1 ; i < 9 ; i++){
//			sections.put(i, priorityContainer);
//		}
		
		////////////
		for(int i = 1 ; i < 9 ; i++){
			int[] priorityContainer1 = new int[73];
			sections.put(i, priorityContainer1);
		}
		
		///////////
		System.out.println("10");
		DBConnection connect1 = new DBConnection();
		System.out.println("11");
		
		//Filling filling = new Filling();
		System.out.println("12");
		
		OrderOrganizer getOrders = new OrderOrganizer();
		System.out.println("13");
		
		//connect1.getData();
		fetchedOrders = connect1.fetchReadyOrders();
		System.out.println("14");
		
		int i = fetchedOrders.size();
		
		for(int j = 0; j<i; j++){
			System.out.println("order id from fetchedOrders is:  " + fetchedOrders.get(j).getId());

			//filling.fillTables(fetchedOrders.get(j), priority, sections);
			Filling.fillTables(fetchedOrders.get(j), priority, sections);

			
		}
		
//		fetchedOrders.parallelStream().forEach(o -> {
//			filling.fillTables(o, priority, sections);
//		});
		
		System.out.println("15");
		// make getFinalOrdersToPath static, so it can be called without declaring new object
		getOrders.getFinalOrdersToPath(10, priority, sections);
		System.out.println("-16----16");
//		Filling filling = new Filling();
//		System.out.println(filling.calculatePriority());
	}

}
