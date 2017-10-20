package com.iot1sql.lecture.vendor.dao;

import java.util.List;

import com.iot1sql.lecture.goods.dto.GoodsInfo;
import com.iot1sql.lecture.vendor.dto.VendorInfo;

public interface VendorDAO {
	public VendorInfo selectVendorInfo(VendorInfo gi);

	public List<VendorInfo> selectVendorInfoList(VendorInfo gi);
	public List<VendorInfo> selectVendorInfoCombo();
	
}
