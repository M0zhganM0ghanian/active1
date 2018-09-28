package types;

import java.util.Date;

public abstract class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private String address;
	private String email;
	private String phoneNumber;
	private Date dateOfRegistration;
	private String paymentType;
	private boolean isEmployee;
	private boolean isCustomer;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the dateOfRegistration
	 */
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	/**
	 * @param dateOfRegistration the dateOfRegistration to set
	 */
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
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
	 * @return the isEmployee
	 */
	public boolean isEmployee() {
		return isEmployee;
	}
	/**
	 * @param isEmployee the isEmployee to set
	 */
	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	/**
	 * @return the isCustomer
	 */
	public boolean isCustomer() {
		return isCustomer;
	}
	/**
	 * @param isCustomer the isCustomer to set
	 */
	public void setCustomer(boolean isCustomer) {
		this.isCustomer = isCustomer;
	}
	
	

}
