package com.emg.datamanage.bean;

public enum OperateType {
	INSERT("insert", 0),
	COUNT("count", 1),
	DELETE("delete", 2),
	SELECT("select", 3),
	UPDATE("update", 4);
	
	private String type;
	
	private int index;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	OperateType(String type, int index){
		this.setType(type);
		this.setIndex(index);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
