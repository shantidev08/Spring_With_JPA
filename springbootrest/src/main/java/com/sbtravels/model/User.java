package com.sbtravels.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private Long USER_ID;
	private String NAME;
	private String ADDRESS;
	private String PHONE_NUMBER;
	private String EMAIL_ID;
	private String GOV_ID;
	private int gender; //0 -  Female 1- Male
	@Transient
	private List<Address> addressList;
	public Long getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(Long uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	public String getEMAIL_ID() {
		return EMAIL_ID;
	}
	public void setEMAIL_ID(String eMAIL_ID) {
		EMAIL_ID = eMAIL_ID;
	}
	public String getGOV_ID() {
		return GOV_ID;
	}
	public void setGOV_ID(String gOV_ID) {
		GOV_ID = gOV_ID;
	}
	
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
