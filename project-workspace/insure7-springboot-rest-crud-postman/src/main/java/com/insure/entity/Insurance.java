package com.insure.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Insurance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer insuranceId;
	private String insuranceName;
	private Integer insuranceAmount;
	private String insuranceExpiry;
	private String insuranceType;

	public Integer getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public Integer getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Integer insuranceAmount) {
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
