package com.emg.datamanage.bean;

import java.util.ArrayList;
import java.util.List;

public class SQLWhereOr {
	private List<SQLOperationalLine> operationalLines = new ArrayList<SQLOperationalLine>();

	public List<SQLOperationalLine> getOperationalLines() {
		return operationalLines;
	}

	public void setOperationalLines(List<SQLOperationalLine> operationalLines) {
		this.operationalLines = operationalLines;
	}

	public void addSQLOperationalLine(SQLOperationalLine operationalLine) {
		this.operationalLines.add(operationalLine);
	}

}
