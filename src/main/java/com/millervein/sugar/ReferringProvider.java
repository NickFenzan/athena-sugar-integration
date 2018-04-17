package com.millervein.sugar;

import java.util.Arrays;

public class ReferringProvider {
	String sugarId;
	Integer athenaId;
	Integer npiNumber;
	String firstName;
	String middleInitial;
	String lastName;
	String suffix;
	String providerType;
	String specialty;
	String phone;
	String fax;
	String email;
	String[] hospitalAffiliations;
	public String getSugarId() {
		return sugarId;
	}
	public void setSugarId(String sugarId) {
		this.sugarId = sugarId;
	}
	public Integer getAthenaId() {
		return athenaId;
	}
	public void setAthenaId(Integer athenaId) {
		this.athenaId = athenaId;
	}
	public Integer getNpiNumber() {
		return npiNumber;
	}
	public void setNpiNumber(Integer npiNumber) {
		this.npiNumber = npiNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getProviderType() {
		return providerType;
	}
	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getHospitalAffiliations() {
		return hospitalAffiliations;
	}
	public void setHospitalAffiliations(String[] hospitalAffiliations) {
		this.hospitalAffiliations = hospitalAffiliations;
	}
	@Override
	public String toString() {
		return "ReferringProvider [sugarId=" + sugarId + ", athenaId=" + athenaId + ", npiNumber=" + npiNumber
				+ ", firstName=" + firstName + ", middleInitial=" + middleInitial + ", lastName=" + lastName
				+ ", suffix=" + suffix + ", providerType=" + providerType + ", specialty=" + specialty + ", phone="
				+ phone + ", fax=" + fax + ", email=" + email + ", hospitalAffiliations="
				+ Arrays.toString(hospitalAffiliations) + "]";
	}


}
