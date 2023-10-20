package com.thinkconstractive.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkconstractive.restdemo.model.CloudVendor;

public interface CloudVendorRepsitory extends JpaRepository<CloudVendor, String>{

}
