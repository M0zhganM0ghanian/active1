package helper;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import types.Order;
import types.Path;

public class PathMaker {

	public PathMaker() {
		// TODO Auto-generated constructor stub
	}
	
	private static int getReadyDriver(){
		return 0;
	}
	
	private static float costCalculator(List<Order> o){
		return (float) 1.0;
	}
	
	private static Path makeNewPath(List<Order> order, int driverId, String status, float cost){
		
		//for each order change the status and update the path id and driver id,
		for(Order o : order){
			UpdateOrders.changeOrderStatus(o, "added to path");
			o.setStatus("added to path");
			UpdateOrders.changeOrderDriverInfo(o, driverId);
			o.setDriverId(driverId);
			//UpdateOrders.changeOrderPathInfo(o, pathId);
		}
		 Path path = new Path();
		 path.setCost(cost);
		 path.setDriverId(driverId);
		 path.setNumOfOrders(order.size());
		 path.setSection(order.get(0).getSection());
		 path.setStatus(status);
		 
		 java.util.Date date = new Date();
		 Timestamp param = new java.sql.Timestamp(date.getTime());
		 
		 path.setDateTime(param);
		 return path;
		
	}
	
	private static void insertToPathTable(Path path){
		//get path info and insert them to the table
	}
	
	//print the orders in the path, it is different from path.toString, cause that one does not show orders
	private static void printPath(Path path, List<Order> orders){
		System.out.println("The path number is: " + path.getId());
		for(Order o : orders){
			System.out.println("Order is:  " + o.getId());
		}
	}
	
	public static void pathOrganizer(List<Order> orders){
		int driverId = getReadyDriver();
		float cost = costCalculator(orders);
		Path p = new Path();
		p = makeNewPath(orders, driverId, "...", cost);
		insertToPathTable(p);
		printPath(p, orders);
		//getReadyDriver
		//costCalculator
		//makeNewPath
		//insertToPathTable
		//printPath
	}

}
