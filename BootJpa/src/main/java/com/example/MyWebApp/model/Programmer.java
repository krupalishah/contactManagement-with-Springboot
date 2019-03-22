package com.example.MyWebApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Programmer 
{
	@Id
	private int pId;
	private String pName;
	private String tech;
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Programmer [pId=" + pId + ", pName=" + pName + ", tech=" + tech + "]";
	}
	
}
