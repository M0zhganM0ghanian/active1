package types;
public abstract class Product {

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private String category;
	private double price;
	private double weight;
	//private .... expireDate;
	private long maxAmount;
	private long count;
	private double rate;
	private Store selectedStore;
	
	//list of stores ---> private ArrayList<Store> stores;
		//list of review ---> private ArayList<String> reviews;
	
	/**
	 * @return the selectedStore
	 */
	public Store getSelectedStore() {
		return selectedStore;
	}
	/**
	 * @param selectedStore the selectedStore to set
	 */
	public void setSelectedStore(Store selectedStore) {
		this.selectedStore = selectedStore;
	}
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
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the maxAmount
	 */
	public long getMaxAmount() {
		return maxAmount;
	}
	/**
	 * @param maxAmount the maxAmount to set
	 */
	public void setMaxAmount(long maxAmount) {
		this.maxAmount = maxAmount;
	}
	/**
	 * @return the count
	 */
	public long getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(long count) {
		this.count = count;
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


}