package fashiontraditional.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "ADDRESS")
public class Address implements Serializable {

	private static final long serialVersionUID = 2776111966925687043L;
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private long id;
	@Column(name = "HOME_NUMBER")
	private String homeNumber;
	@Column(name = "STREET")
	private String street;
	@Column(name = "DISTRICT")
	private String district;
	@Column(name = "CITY")
	private String city;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(homeNumber);
		result.append(", ");
		result.append(street);
		result.append(", ");
		result.append(district);
		result.append(", ");
		result.append(city);
		return result.toString();
	}

}
