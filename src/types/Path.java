package types;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Path {

	public Path() {
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private int driverId;
	private int NumOfOrders;
	private float cost;
	private Time timeCreated;
	private Date dateCreated;
	private int section;
	private String status;
	private Timestamp dateTime;
	

	public Path(int id, int numOfOrders, Time timeCreated, Date dateCreated, int section) {
		//super();
		this.id = id;
		this.NumOfOrders = numOfOrders;
		this.timeCreated = timeCreated;
		this.dateCreated = dateCreated;
		this.section = section;
	}

	/**
	 * @return the dateTime
	 */
	public Timestamp getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
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
	 * @return the numOfOrders
	 */
	public int getNumOfOrders() {
		return NumOfOrders;
	}

	/**
	 * @param numOfOrders the numOfOrders to set
	 */
	public void setNumOfOrders(int numOfOrders) {
		NumOfOrders = numOfOrders;
	}

	/**
	 * @return the cost
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * @return the timeCreated
	 */
	public Time getTimeCreated() {
		return timeCreated;
	}

	/**
	 * @param timeCreated the timeCreated to set
	 */
	public void setTimeCreated(Time timeCreated) {
		this.timeCreated = timeCreated;
	}

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Path [id=" + id + ", driverId=" + driverId + ", NumOfOrders=" + NumOfOrders + ", cost=" + cost + ", timeCreated=" + timeCreated + ", dateCreated=" + dateCreated
				+ ", section=" + section + ", status=" + status + "]";
	}
	
	
	
	

}
