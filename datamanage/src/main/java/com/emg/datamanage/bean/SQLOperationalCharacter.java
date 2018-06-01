package com.emg.datamanage.bean;

public enum SQLOperationalCharacter {
	EQUALTO(3, "EqualTo", "等于"),
	NOTEQUALTO(4, "NotEqualTo", "不等于"),
	ISNULL(1, "IsNull", "为空"),
	ISNOTNULL(2, "IsNotNull", "不为空"),
	GREATERTHAN(5, "GreaterThan", "大于"),
	GREATERTHANOREQUALTO(6, "GreaterThanOrEqualTo", "大于等于"),
	LESSTHAN(7, "LessThan", "小于"),
	LESSTHANOREQUALTO(8, "LessThanOrEqualTo", "小于等于"),
	IN(9, "In", "在列表中"),
	NOTIN(10, "NotIn", "不再列表中"),
	BETWEEN(11, "Between", "介于"),
	NOTBETWEEN(12, "NotBetween", "不介于"),
	LIKE(13, "Like", "类似与"),
	NOTLIKE(14, "NotLike", "不类似与");
	
	private Integer index;
	
	private String character;
	
	private String description;
	

	SQLOperationalCharacter(Integer index, String character, String description){
		this.setIndex(index);
		this.setCharacter(character);
		this.setDescription(description);
	}

	SQLOperationalCharacter(String character){
		this.setCharacter(character);
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}
	
}
