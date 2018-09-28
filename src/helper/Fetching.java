package helper;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import types.Order;

public class Fetching {

	
	//Most of the these methods are defined in DBConnection class in main package
	public Fetching() {
		// TODO Auto-generated constructor stub
	}
	
	public Time nextEarliestTime(){

	    Calendar cal = Calendar.getInstance(); // creates calendar
	    cal.setTime(new Date()); // sets calendar time/date
	    cal.add(Calendar.HOUR_OF_DAY, 1); // adds one hour
	    System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	    System.out.println(cal.get(Calendar.MINUTE));

	    return (Time) cal.getTime();
	}
	
	private List<Order> fetchReadyOrders(){
		
		return null;
		
	}
	
//	private void changeOrderStatus(String status, Order o){
//		
//	}

}
