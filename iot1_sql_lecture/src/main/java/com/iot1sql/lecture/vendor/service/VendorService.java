package com.iot1sql.lecture.vendor.service;

import java.util.List;

import com.iot1sql.lecture.vendor.dto.VendorInfo;

public interface VendorService {
	public VendorInfo getVendorInfo(VendorInfo vi);

	public List<VendorInfo> getVendorInfoList(VendorInfo vi);
	
	public List<VendorInfo> getVendorInfoCombo();
}
