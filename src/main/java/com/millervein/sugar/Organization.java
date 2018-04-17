package com.millervein.sugar;

import java.util.Arrays;

public class Organization {
	String sugarId;
	Integer athenaId;
	String name;
	String[] hospitalAffiliations;
	String specialty;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHospitalAffiliations() {
		return hospitalAffiliations;
	}

	public void setHospitalAffiliations(String[] hospitalAffiliations) {
		this.hospitalAffiliations = hospitalAffiliations;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "Organization [sugarId=" + sugarId + ", athenaId=" + athenaId + ", name=" + name
				+ ", hospitalAffiliations=" + Arrays.toString(hospitalAffiliations) + ", specialty=" + specialty + "]";
	}

}
