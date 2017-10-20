package com.iot1sql.lecture.db.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot1sql.lecture.db.dao.DbDAO;
import com.iot1sql.lecture.db.dto.Column;
import com.iot1sql.lecture.db.dto.DataBase;
import com.iot1sql.lecture.db.dto.DbInfo;
import com.iot1sql.lecture.db.dto.Table;

@Service
public class DbServiceImpl implements DbService{

	@Autowired
	DbDAO dDao;
	
	@Override
	public List<DbInfo> getDbInfoList(DbInfo di) {
		return dDao.selectDbInfoList(di);
	}
	
	public boolean isConnecteDB(DbInfo pDi) throws Exception{
		DbInfo di = dDao.selectDbInfo(pDi);
		return dDao.isConnecteDB(di);
	}
	
	public List<DataBase> getDataBaseList() throws Exception{
		return dDao.selectDatabaseList();
	}

	@Override
	public List<Table> getTableList(DataBase di) throws Exception {
		// TODO Auto-generated method stub
		return dDao.selectTableList(di);
	}

	@Override
	public List<Column> getTableInfo(Table table) throws Exception {
		// TODO Auto-generated method stub
		return dDao.selectTableInfo(table);
	}

	@Override
	public Map<String, Object> runSql(Map<String, String> pm) throws Exception {
		return dDao.runSql(pm);
	}
}
