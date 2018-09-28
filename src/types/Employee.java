package types;

import java.util.List;

public abstract class Employee extends Person{

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	//private Info empinfo;
	private int codeArea;
	private int shift;
	//private time/duration shift;
	
	private double salary;
	private double totalHoursPerDay;
	private int numOfDoneOrderPerDay;
	private double avrHoursPerDay;
	private double avrHoursPerWeek;
	
	private Order currentOrder;
	private boolean isFree;
	private int estimatedFreeTimeInMin;
	private List<Order> submittedOrders; // or use better data type;
	
	
	
	private String status; // on work, on vacation, off day, late day, on time.... (use enum or better way)



	/**
	 * @return the empinfo
	 */
//	public Info getEmpinfo() {
//		return empinfo;
//	}



	/**
	 * @param empinfo the empinfo to set
	 */
//	public void setEmpinfo(Info empinfo) {
//		this.empinfo = empinfo;
//	}



	/**
	 * @return the codeArea
	 */
	public int getCodeArea() {
		return codeArea;
	}



	/**
	 * @param codeArea the codeArea to set
	 */
	public void setCodeArea(int codeArea) {
		this.codeArea = codeArea;
	}



	/**
	 * @return the shift
	 */
	public int getShift() {
		return shift;
	}



	/**
	 * @param shift the shift to set
	 */
	public void setShift(int shift) {
		this.shift = shift;
	}



	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}



	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}



	/**
	 * @return the totalHoursPerDay
	 */
	public double getTotalHoursPerDay() {
		return totalHoursPerDay;
	}



	/**
	 * @param totalHoursPerDay the totalHoursPerDay to set
	 */
	public void setTotalHoursPerDay(double totalHoursPerDay) {
		this.totalHoursPerDay = totalHoursPerDay;
	}



	/**
	 * @return the numOfDoneOrderPerDay
	 */
	public int getNumOfDoneOrderPerDay() {
		return numOfDoneOrderPerDay;
	}



	/**
	 * @param numOfDoneOrderPerDay the numOfDoneOrderPerDay to set
	 */
	public void setNumOfDoneOrderPerDay(int numOfDoneOrderPerDay) {
		this.numOfDoneOrderPerDay = numOfDoneOrderPerDay;
	}



	/**
	 * @return the avrHoursPerDay
	 */
	public double getAvrHoursPerDay() {
		return avrHoursPerDay;
	}



	/**
	 * @param avrHoursPerDay the avrHoursPerDay to set
	 */
	public void setAvrHoursPerDay(double avrHoursPerDay) {
		this.avrHoursPerDay = avrHoursPerDay;
	}



	/**
	 * @return the avrHoursPerWeek
	 */
	public double getAvrHoursPerWeek() {
		return avrHoursPerWeek;
	}



	/**
	 * @param avrHoursPerWeek the avrHoursPerWeek to set
	 */
	public void setAvrHoursPerWeek(double avrHoursPerWeek) {
		this.avrHoursPerWeek = avrHoursPerWeek;
	}



	/**
	 * @return the currentOrder
	 */
	public Order getCurrentOrder() {
		return currentOrder;
	}



	/**
	 * @param currentOrder the currentOrder to set
	 */
	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}



	/**
	 * @return the isFree
	 */
	public boolean isFree() {
		return isFree;
	}



	/**
	 * @param isFree the isFree to set
	 */
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}



	/**
	 * @return the estimatedFreeTimeInMin
	 */
	public int getEstimatedFreeTimeInMin() {
		return estimatedFreeTimeInMin;
	}



	/**
	 * @param estimatedFreeTimeInMin the estimatedFreeTimeInMin to set
	 */
	public void setEstimatedFreeTimeInMin(int estimatedFreeTimeInMin) {
		this.estimatedFreeTimeInMin = estimatedFreeTimeInMin;
	}



	/**
	 * @return the submittedOrders
	 */
	public List<Order> getSubmittedOrders() {
		return submittedOrders;
	}



	/**
	 * @param submittedOrders the submittedOrders to set
	 */
	public void setSubmittedOrders(List<Order> submittedOrders) {
		this.submittedOrders = submittedOrders;
	}



	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}



	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	//some of them might be implement here, think about it later
	protected abstract void tekeOrder(Order o);
	protected abstract CurrentTime begginOrder(Order o);
	protected abstract void submitOrder(Order o);
	//search more on the best type of get instance of current time!
	protected abstract double countHours(CurrentTime t);
	protected abstract double totalHoursPerDay(double lastSubmit);
	protected abstract double avrHoursPerDay(double totalHours, int numOfOrder);
	protected abstract double avrHoursPerItemPerDay(double totalHours, int numOfItem);
	
	private double calculateSalary(double payRate, double totalTime){
		
		return payRate * totalTime;
	}
	
	
	
	

}
