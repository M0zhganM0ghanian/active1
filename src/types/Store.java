package types;

import java.util.ArrayList;

public abstract class Store {

	public Store() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	// either of the 3 followings can be used to locate a store
	private String area;
	private String pstalCod;
	private int areaCode;
	private double distanceToCenter;
	
	// not sure if arrayList is a good data type for it or not ---> make sure!
	private ArrayList<Product> products;
	private ArrayList<Employee> employees;
	
	private double percentDiscount;
	private long soldItem;
	private double totalSoldAmount;
	
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}




	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}




	/**
	 * @return the pstalCod
	 */
	public String getPstalCod() {
		return pstalCod;
	}




	/**
	 * @param pstalCod the pstalCod to set
	 */
	public void setPstalCod(String pstalCod) {
		this.pstalCod = pstalCod;
	}




	/**
	 * @return the areaCode
	 */
	public int getAreaCode() {
		return areaCode;
	}




	/**
	 * @param areaCode the areaCode to set
	 */
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}




	/**
	 * @return the distanceToCenter
	 */
	public double getDistanceToCenter() {
		return distanceToCenter;
	}




	/**
	 * @param distanceToCenter the distanceToCenter to set
	 */
	public void setDistanceToCenter(double distanceToCenter) {
		this.distanceToCenter = distanceToCenter;
	}




	/**
	 * @return the products
	 */
	public ArrayList<Product> getProducts() {
		return products;
	}




	/**
	 * @param products the products to set
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}




	/**
	 * @return the employees
	 */
	public ArrayList<Employee> getEmployees() {
		return employees;
	}




	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}




	/**
	 * @return the percentDiscount
	 */
	public double getPercentDiscount() {
		return percentDiscount;
	}




	/**
	 * @param percentDiscount the percentDiscount to set
	 */
	public void setPercentDiscount(double percentDiscount) {
		this.percentDiscount = percentDiscount;
	}




	/**
	 * @return the soldItem
	 */
	public long getSoldItem() {
		return soldItem;
	}




	/**
	 * @param soldItem the soldItem to set
	 */
	public void setSoldItem(long soldItem) {
		this.soldItem = soldItem;
	}




	/**
	 * @return the totalSoldAmount
	 */
	public double getTotalSoldAmount() {
		return totalSoldAmount;
	}




	/**
	 * @param totalSoldAmount the totalSoldAmount to set
	 */
	public void setTotalSoldAmount(double totalSoldAmount) {
		this.totalSoldAmount = totalSoldAmount;
	}




	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}




	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	private double rate;
	
}
