package fashiontraditional.com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fashiontraditional.com.model.enumType.Status;

@Entity(name = "ORDER")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5303677008070826139L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	@Column(name = "NAME_PERSON_RECEICE")
	private String namePersonReceice;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	@Column(name = "DATE_ORDER")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOrder;
	@Column(name = "DATE_RECEICE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReceice;
	@Column(name = "ADDRESS_RECEICE")
	private String addressReceice;
	@Column(name = "STATUS")
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private User user;
	@Column(name = "TOTAL_MONEY")
	private double totalMoney;

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNamePersonReceice() {
		return namePersonReceice;
	}

	public void setNamePersonReceice(String namePersonReceice) {
		this.namePersonReceice = namePersonReceice;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateReceice() {
		return dateReceice;
	}

	public void setDateReceice(Date dateReceice) {
		this.dateReceice = dateReceice;
	}

	public String getAddressReceice() {
		return addressReceice;
	}

	public void setAddressReceice(String addressReceice) {
		this.addressReceice = addressReceice;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
