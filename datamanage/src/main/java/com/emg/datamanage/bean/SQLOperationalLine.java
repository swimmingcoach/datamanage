package com.emg.datamanage.bean;

public class SQLOperationalLine {
	private String columnName;
	
	private SQLOperationalCharacter optCharater;
	
	private String value;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public SQLOperationalCharacter getOptCharater() {
		return optCharater;
	}

	public void setOptCharater(SQLOperationalCharacter optCharater) {
		this.optCharater = optCharater;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
