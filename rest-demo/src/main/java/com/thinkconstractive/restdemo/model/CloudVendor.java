package com.thinkconstractive.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {
	
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNoumber;
	
	
	
	public CloudVendor() {
		
	}



	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNoumber) {
		
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNoumber = vendorPhoneNoumber;
	}



	public String getVendorId() {
		return vendorId;
	}



	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}



	public String getVendorName() {
		return vendorName;
	}



	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	public String getVendorAddress() {
		return vendorAddress;
	}



	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}



	public String getVendorPhoneNoumber() {
		return vendorPhoneNoumber;
	}



	public void setVendorPhoneNoumber(String vendorPhoneNoumber) {
		this.vendorPhoneNoumber = vendorPhoneNoumber;
	}
	
	
	
	

}
