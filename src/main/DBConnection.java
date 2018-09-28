package main;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import types.Customer;
import types.Order;

public class DBConnection {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnection() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivery1", "root", "");
			st = con.createStatement();
			
		}catch(Exception e){
			System.out.println("EErr: " + e);
		}
	}
	
	public void getData(){
		try{
			String query = "SELECT * FROM customers";
			rs = st.executeQuery(query);
			System.out.println("result");
			while(rs.next()){
				String name = rs.getString("name");
				System.out.println(name);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public List<Order> fetchReadyOrders(){
		List<Order> readyOrders = new ArrayList<Order>();
		try{
			String query = "SELECT * FROM orders WHERE earliest_time <= DATE_ADD(NOW(),INTERVAL 1 Hour);";
			rs = st.executeQuery(query);
			while(rs.next()){
				Order o = new Order(rs.getInt("id"), rs.getInt("customer_id"), rs.getDate("date"), 
						rs.getTime("earliest_time"), rs.getTime("latest_time"), rs.getString("status"),
						rs.getString("address"), rs.getInt("section"));
				
				readyOrders.add(o);
				String id = rs.getString("id");
				System.out.println(o.getId() + " => " + id);
				
//				Calendar cal = Calendar.getInstance();
//				cal.setTime(o.getLatestTime());
//
//				int hour = cal.get(Calendar.HOUR_OF_DAY);
//				int minute = cal.get(Calendar.MINUTE);
//				System.out.println("hour: " + hour + "minute: " + minute);

			}
		}catch(Exception e){
			System.out.println(" eroor in DBConnection");
			System.out.println(e);
		}
		System.out.println(" END OF db");
		return readyOrders;
	}

}
