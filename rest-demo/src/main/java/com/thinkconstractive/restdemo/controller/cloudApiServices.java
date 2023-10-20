package com.thinkconstractive.restdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstractive.restdemo.model.CloudVendor;
import com.thinkconstractive.restdemo.service.CloudVendorService;

@RestController
@RequestMapping("/CloudVendor")

public class cloudApiServices {
	
	//CloudVendor cloudVendor;
	
	CloudVendorService cloudVendorService;
	
    public cloudApiServices(CloudVendorService cloudVendorService) {
		
		this.cloudVendorService = cloudVendorService;
	}
    
    
    //read for spacific vendorid
	@GetMapping("{vendorId}")
	public CloudVendor cloudVendorDetailsService(@PathVariable("vendorId") String vendorId)
	{
		
		return cloudVendorService.getCloudVendor(vendorId);
				
				
				//new CloudVendor("c1",  "vendor1",  "address","xxxxx");
	}
	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails()
	{
		return cloudVendorService.getAllCloudVendors();
	}
	
	
	
    @PostMapping
    public String cloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
    	
    	cloudVendorService.createCloudVendor(cloudVendor);
    	
    	return "Cloud Vendor created successfully";
    } 
	
    
    @PutMapping
    public String cloudUpdateVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
    	
    	cloudVendorService.updateCloudVendor(cloudVendor);
    	
    	return "Cloud Vendor updated successfully";
    } 
    
    @DeleteMapping("{vendorId}")
    public String cloudDeleteVendorDetails(@PathVariable("vendorId") String vendorId)
    {
    	
    	cloudVendorService.deleteCloudVendor(vendorId);
    	
    	return "Cloud Vendor deleted successfully";
    } 


}
