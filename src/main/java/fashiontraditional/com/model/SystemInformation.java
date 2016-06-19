package fashiontraditional.com.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class SystemInformation {

	private long id;
	private Date currentDate;
	private int nuPeopleAccess;
	private int nuUserAccess;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public int getNuPeopleAccess() {
		return nuPeopleAccess;
	}

	public void setNuPeopleAccess(int nuPeopleAccess) {
		this.nuPeopleAccess = nuPeopleAccess;
	}

	public int getNuUserAccess() {
		return nuUserAccess;
	}

	public void setNuUserAccess(int nuUserAccess) {
		this.nuUserAccess = nuUserAccess;
	}

}
