package com.emg.datamanage.bean;

import java.util.ArrayList;
import java.util.List;

public class SQLSet {
	private List<SQLOperationalLine> operationalLines = new ArrayList<SQLOperationalLine>();

	public List<SQLOperationalLine> getOperationalLines() {
		return operationalLines;
	}

	public void setOperationalLines(List<SQLOperationalLine> operationalLines) {
		this.operationalLines = operationalLines;
	}

	public void addOperationalLine(SQLOperationalLine operationalLine) {
		this.operationalLines.add(operationalLine);
	}
	
	public Boolean isEmpty() {
		return this.operationalLines.size() <= 0;
	}

}
