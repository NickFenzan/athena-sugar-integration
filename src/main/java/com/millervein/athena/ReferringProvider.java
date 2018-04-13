package com.millervein.athena;

public class ReferringProvider {
	// referringproviderid
	Integer id;
	String entityType;
	Integer npiNumber;
	String firstName;
	String middleInitial;
	String lastName;
	String name;
	String providerType;
	String specialty;
	String ansiSpecialtyCode;
	String note;
	String address;
	String address2;
	String city;
	String state;
	String zip;
	String phone;
	String fax;
	String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
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

	@Override
	public String toString() {
		return "ReferringProvider [id=" + id + ", entityType=" + entityType + ", npiNumber=" + npiNumber
				+ ", firstName=" + firstName + ", middleInitial=" + middleInitial + ", lastName=" + lastName + ", name="
				+ name + ", providerType=" + providerType + ", specialty=" + specialty + ", ansiSpecialtyCode="
				+ ansiSpecialtyCode + ", note=" + note + ", address=" + address + ", address2=" + address2 + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", fax=" + fax + ", email=" + email
				+ "]";
	}

}
