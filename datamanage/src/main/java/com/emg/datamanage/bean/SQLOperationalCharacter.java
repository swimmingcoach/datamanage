package com.emg.datamanage.bean;

public enum SQLOperationalCharacter {
	EQUALTO(3, "EqualTo", "����"),
	NOTEQUALTO(4, "NotEqualTo", "������"),
	ISNULL(1, "IsNull", "Ϊ��"),
	ISNOTNULL(2, "IsNotNull", "��Ϊ��"),
	GREATERTHAN(5, "GreaterThan", "����"),
	GREATERTHANOREQUALTO(6, "GreaterThanOrEqualTo", "���ڵ���"),
	LESSTHAN(7, "LessThan", "С��"),
	LESSTHANOREQUALTO(8, "LessThanOrEqualTo", "С�ڵ���"),
	IN(9, "In", "���б���"),
	NOTIN(10, "NotIn", "�����б���"),
	BETWEEN(11, "Between", "����"),
	NOTBETWEEN(12, "NotBetween", "������"),
	LIKE(13, "Like", "������"),
	NOTLIKE(14, "NotLike", "��������");
	
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
