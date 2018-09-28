package types;

import java.util.List;

public abstract class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}

	private Person info;
	private String paymentType;
	private List<Order> Orders; // or better collection
	private List<Product> cart;
	/**
	 * @return the info
	 */
	public Person getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(Person info) {
		this.info = info;
	}
	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return Orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Order> orders) {
		Orders = orders;
	}
	/**
	 * @return the cart
	 */
	public List<Product> getCart() {
		return cart;
	}
	/**
	 * @param cart the cart to set
	 */
	public void setCart(List<Product> cart) {
		this.cart = cart;
	}
	
	// some info for employee accounts
	
	
}
