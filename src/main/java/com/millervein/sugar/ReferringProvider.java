package com.millervein.sugar;

import java.util.Arrays;

public class ReferringProvider {
	String sugarId;
	Integer athenaId;
	Integer npiNumber;
	String firstName;
	String middleInitial;
	String lastName;
	String fullName;
	String providerType;
	String specialty;
	String ansiSpecialtyCode;
	String note;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getAnsiSpecialtyCode() {
		return ansiSpecialtyCode;
	}

	public void setAnsiSpecialtyCode(String ansiSpecialtyCode) {
		this.ansiSpecialtyCode = ansiSpecialtyCode;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
				+ ", fullName=" + fullName + ", providerType=" + providerType + ", specialty=" + specialty
				+ ", ansiSpecialtyCode=" + ansiSpecialtyCode + ", note=" + note + ", hospitalAffiliations="
				+ Arrays.toString(hospitalAffiliations) + "]";
	}

}
