package com.millervein.athena;

public class ReferringProvider {
	String city;
	String email;
	String note;
	String ansispecialtycode;
	String middleinitial;
	String fax;
	String address;
	Integer npinumber;
	String providertype;
	String name;
	String specialty;
	Integer referringproviderid;
	String zip;
	String lastname;
	String firstname;
	String ansinamecode;
	String state;
	EntityType entitytype;
	String address2;
	String phone;
	String namesuffix;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getAnsispecialtycode() {
		return ansispecialtycode;
	}

	public void setAnsispecialtycode(String ansispecialtycode) {
		this.ansispecialtycode = ansispecialtycode;
	}

	public String getMiddleinitial() {
		return middleinitial;
	}

	public void setMiddleinitial(String middleinitial) {
		this.middleinitial = middleinitial;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getNpinumber() {
		return npinumber;
	}

	public void setNpinumber(Integer npinumber) {
		this.npinumber = npinumber;
	}

	public String getProvidertype() {
		return providertype;
	}

	public void setProvidertype(String providertype) {
		this.providertype = providertype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Integer getReferringproviderid() {
		return referringproviderid;
	}

	public void setReferringproviderid(Integer referringproviderid) {
		this.referringproviderid = referringproviderid;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAnsinamecode() {
		return ansinamecode;
	}

	public void setAnsinamecode(String ansinamecode) {
		this.ansinamecode = ansinamecode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public EntityType getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(EntityType entitytype) {
		this.entitytype = entitytype;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNamesuffix() {
		return namesuffix;
	}

	public void setNamesuffix(String namesuffix) {
		this.namesuffix = namesuffix;
	}

	@Override
	public String toString() {
		return "ReferringProvider [city=" + city + ", email=" + email + ", note=" + note + ", ansispecialtycode="
				+ ansispecialtycode + ", middleinitial=" + middleinitial + ", fax=" + fax + ", address=" + address
				+ ", npinumber=" + npinumber + ", providertype=" + providertype + ", name=" + name + ", specialty="
				+ specialty + ", referringproviderid=" + referringproviderid + ", zip=" + zip + ", lastname=" + lastname
				+ ", firstname=" + firstname + ", ansinamecode=" + ansinamecode + ", state=" + state + ", entitytype="
				+ entitytype + ", address2=" + address2 + ", phone=" + phone + ", namesuffix=" + namesuffix + "]";
	}

}
