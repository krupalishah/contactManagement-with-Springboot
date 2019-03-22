package com.example.MyWebApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contacts {
	@Id
	private int contactId;
	private String name;
	private String phoneNumber;
	private String website;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "Contacts [contactId=" + contactId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", website="
				+ website + "]";
	}
}
