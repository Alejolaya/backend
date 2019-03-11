package com.youtube.demo.util;

import java.util.List;

public class QueryResult {
	
	private int totalRecords;
	private List<Object> list;
	public int getTotalResult() {
		return totalRecords;
	}
	public void setTotalResult(int totalResult) {
		this.totalRecords = totalResult;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	

}
