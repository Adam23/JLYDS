package com.csg.jlyds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_customers")
public class Customer {
	@Id
	@SequenceGenerator(name="seggen" , sequenceName = "seq_customer")
	@GeneratedValue(generator = "seggen" , strategy= GenerationType.AUTO)
	@Column(name = "customer_id")
	private Integer customerId;
	@Column(name = "customer_name")
    private String customerName;
	@Column(name = "customer_contact")
    private String customerContact;
	@Column(name = "customer_phone")
    private String customerPhone;
	@Column(name = "create_date")
    private String createDate;
    private Boolean isvalid;
    @Column(name = "invalid_reason")
    private String invalidReason;
    @Column(name = "customer_address")
    private String customerAddress;
    
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Boolean getIsvalid() {
		return isvalid;
	}
	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
	}
	public String getInvalidReason() {
		return invalidReason;
	}
	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

}
