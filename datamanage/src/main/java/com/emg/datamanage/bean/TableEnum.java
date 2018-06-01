package com.emg.datamanage.bean;

public enum TableEnum {
	MAXID("maxid", 0),
	TB_ERROR("tb_error", 1),
	TB_ERROR_RELATED("tb_error_related", 2),
	TB_ERROR_STATISTICS("tb_error_statistics", 3),
	TB_MASK_ITEMINFO("tb_mask_iteminfo", 4),
	TB_OKERROR_ITEMINFO("tb_okerror_iteminfo", 5),
	TB_OKERRORSETS("tb_okerrorsets", 6),
	TB_OKERRORSETS_RELATEDITEM("tb_okerrorsets_relateditem", 7);
	
	private String type;
	
	private int index;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	TableEnum(String type, int index){
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
