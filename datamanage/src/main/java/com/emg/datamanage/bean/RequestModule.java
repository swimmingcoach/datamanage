package com.emg.datamanage.bean;

import java.util.Map;

public class RequestModule {
	
	private SQLSet set;
	
	private SQLWhere where;
	
	private String orderBy;
	
	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	private Map<String, Object> reqParams;
	
	private String source;

	public SQLWhere getWhere() {
		return where;
	}

	public void setWhere(SQLWhere where) {
		this.where = where;
	}

	public RequestModule() {
		super();
	}

	public Map<String, Object> getReqParams() {
		return reqParams;
	}

	public void setReqParams(Map<String, Object> reqParams) {
		this.reqParams = reqParams;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public SQLSet getSet() {
		return set;
	}

	public void setSet(SQLSet set) {
		this.set = set;
	}

}
