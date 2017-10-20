package com.iot1sql.lecture.db.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.iot1sql.lecture.db.dto.Column;
import com.iot1sql.lecture.db.dto.DataBase;
import com.iot1sql.lecture.db.dto.DbInfo;
import com.iot1sql.lecture.db.dto.Table;

public interface DbDAO {
	public List<DbInfo> selectDbInfoList(DbInfo di) ;
	public DbInfo selectDbInfo(DbInfo di);
	public boolean isConnecteDB(DbInfo di) throws Exception;
	public List<DataBase> selectDatabaseList() throws Exception;
	public List<Table> selectTableList(DataBase di) throws Exception;
	public List<Column> selectTableInfo(Table table) throws Exception ;
	public Map<String,Object> runSql(Map<String, String> pm)throws Exception ;
}
