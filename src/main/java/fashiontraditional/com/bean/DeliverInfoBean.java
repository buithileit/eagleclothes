package fashiontraditional.com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import fashiontraditional.com.model.Order;
import fashiontraditional.com.model.OrderDetail;
import fashiontraditional.com.model.Product;

@Entity
public class DeliverInfoBean implements Serializable {

	@Id
	private Long id;
	private String nameReceice;
	private String addressReceice;
	private String phoneRecece;
	private String dateReceice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameReceice() {
		return nameReceice;
	}

	public void setNameReceice(String nameReceice) {
		this.nameReceice = nameReceice;
	}

	public String getAddressReceice() {
		return addressReceice;
	}

	public void setAddressReceice(String addressReceice) {
		this.addressReceice = addressReceice;
	}

	public String getPhoneRecece() {
		return phoneRecece;
	}

	public void setPhoneRecece(String phoneRecece) {
		this.phoneRecece = phoneRecece;
	}

	public String getDateReceice() {
		return dateReceice;
	}

	public void setDateReceice(String dateReceice) {
		this.dateReceice = dateReceice;
	}

}
