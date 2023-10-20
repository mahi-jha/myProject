package com.thinkconstractive.restdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thinkconstractive.restdemo.model.CloudVendor;
import com.thinkconstractive.restdemo.repository.CloudVendorRepsitory;
import com.thinkconstractive.restdemo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	
	
	CloudVendorRepsitory cloudVendorRepsitory;

	public CloudVendorServiceImpl(CloudVendorRepsitory cloudVendorRepsitory) {
		
		this.cloudVendorRepsitory = cloudVendorRepsitory;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		
		cloudVendorRepsitory.save(cloudVendor);	
		return "success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepsitory.save(cloudVendor);
		return "success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepsitory.deleteById(cloudVendorId);
		return "deleted";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		return cloudVendorRepsitory.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor>getAllCloudVendors() {
		
		return cloudVendorRepsitory.findAll();
	}
	
	

}
