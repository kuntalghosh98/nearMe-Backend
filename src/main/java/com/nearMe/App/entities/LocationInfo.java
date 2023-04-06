package com.nearMe.App.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locationInfo")
public class LocationInfo {
	
	@Id
	@Column(name="location")
	private String location;
	
	@Column(name="vendorId")
	private int vendorId;
	
	@Column(name="vendorName")
	private String vendorName;
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	

}
