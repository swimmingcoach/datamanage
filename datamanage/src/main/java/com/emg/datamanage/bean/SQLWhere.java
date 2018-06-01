package com.emg.datamanage.bean;

import java.util.ArrayList;
import java.util.List;

public class SQLWhere {
	private List<SQLWhereOr> whereOrs = new ArrayList<SQLWhereOr>();

	public List<SQLWhereOr> getWhereOrs() {
		return whereOrs;
	}

	public void setWhereOrs(List<SQLWhereOr> whereOrs) {
		this.whereOrs = whereOrs;
	}

	public void addWhereOr(SQLWhereOr whereOr) {
		this.whereOrs.add(whereOr);
	}
	
	public Boolean isEmpty() {
		return this.whereOrs.size() <= 0;
	}

}
