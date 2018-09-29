package types;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import operation.EmptyStringException;
import operation.intDefaultValueException;


public class Order {

	public Order(){}
	public Order(int id, int customerID, Date date, Time earliestTime, Time latestTime,
			String status, String address, int section) throws NullPointerException , intDefaultValueException, EmptyStringException{
    	if(date == null || earliestTime == null || latestTime == null
    			|| status == null || address == null){
    		throw new NullPointerException();
    	} 
    	
    	if(id == 0 || customerID == 0 || section == 0){
    		throw new intDefaultValueException(" null value for int");
    	}
    	
    	if(status.replaceAll("\\s", "").length()  == 0 || address.replaceAll("\\s", "").length() == 0){
    		throw new EmptyStringException("Empty default for String inputs");
    	} 
    	
		this.id = id;
		this.customerID = customerID;
		this.date = date;
		this.earliestTime = earliestTime;
		this.latestTime = latestTime;
		this.status = status;
		this.address = address;
		this.section = section;
	}
//	private static final double FIXED_RATE = 10.00;
//	private static final double RATE_PER_ITEM = 3.00;
//	private static final int MAX_NUOM_OF_ITEM = 150;
	
	private int customerID;
	private int id;
	private Date date;
	private int section;
	private Time earliestTime;
	private Time latestTime;
	//private Employee driverId1;
	private int driverId;
	private String status; // packing items, collectingFromStores, shipping ----> maybe use enum;
	private String address;
	
//	private Time deliveredTime;
//	private int numOfItems;
//	private List<Product> products;
//	private int pathId;
//	private int storeId;
//	private Time timeSubmitted;
//	private Time deliveredTime;
//	private double totalPrice;
//	private double totalRevenue;
//	private double revenuePerStore;
//	private double revenueCustomerSide;
//	private double avrCost;
//	private double totalProfit;
	
	
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the section
	 */
	public int getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(int section) {
		this.section = section;
	}
	/**
	 * @return the earliestTime
	 */
	public Time getEarliestTime() {
		return earliestTime;
	}
	/**
	 * @param earliestTime the earliestTime to set
	 */
	public void setEarliestTime(Time earliestTime) {
		this.earliestTime = earliestTime;
	}
	/**
	 * @return the latestTime
	 */
	public Time getLatestTime() {
		return latestTime;
	}
	/**
	 * @param latestTime the latestTime to set
	 */
	public void setLatestTime(Time latestTime) {
		this.latestTime = latestTime;
	}
	/**
	 * @return the driverId
	 */
	public int getDriverId() {
		return driverId;
	}
	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
