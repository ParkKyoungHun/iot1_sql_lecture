package com.iot1sql.lecture.goods.dao;

import java.util.List;

import com.iot1sql.lecture.goods.dto.GoodsInfo;

public interface GoodsDAO {
	public GoodsInfo selectGoodsInfo(GoodsInfo gi);
	
	public List<GoodsInfo> selectGoodsInfoList(GoodsInfo gi);

	public int insertGoodsInfo(GoodsInfo gi);

	public int updateGoodsInfo(GoodsInfo gi);

	public int deleteGoodsInfo(GoodsInfo gi);
}
