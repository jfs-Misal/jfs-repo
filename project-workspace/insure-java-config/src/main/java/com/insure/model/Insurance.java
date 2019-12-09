package com.insure.model;

public class Insurance {

	private String insuranceId;
	private String insuranceName;
	private int insuranceAmount;
	private String insuranceExpiry;
	private String insuranceType;

	public String getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public int getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(int insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public String getInsuranceExpiry() {
		return insuranceExpiry;
	}

	public void setInsuranceExpiry(String insuranceExpiry) {
		this.insuranceExpiry = insuranceExpiry;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insuranceAmount="
				+ insuranceAmount + ", insuranceExpiry=" + insuranceExpiry + ", insuranceType=" + insuranceType + "]";
	}

}
