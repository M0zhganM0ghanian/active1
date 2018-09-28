package types;

public class Customer extends Person{

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	//private Info info;
	private Account account;
	private double rate;
	/**
	 * @return the info
	 */
//	public Info getInfo() {
//		return info;
//	}
	/**
	 * @param info the info to set
	 */
//	public void setInfo(Info info) {
//		this.info = info;
//	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
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
	
	private void addToCart(Product p){
		
	}
	
	private Order deleteItem(Product p, Order o){
		return o;
	}
	
	private String chooseAddress(){
		return "";
	}
	
	private void confirmOrder(Order o){
		
	}
	
	private void confirmReceiveOrder(Order o){
		
	}
	
	private void cancelOrder(Order o){
		
	}
	

}
