package com.insure.model;

public class InsureCustomer {
	
	private String customerId;
	private String customerName;
	private String customerAge;
	private String customerEmail;
	private String customerAddress;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(String customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "InsureCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge="
				+ customerAge + ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress + "]";
	}
	
	

	
}
