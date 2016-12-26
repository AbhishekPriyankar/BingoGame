package com.tavant.bingo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Column {

	private List<Integer> columnValues;

	public Column(List<Integer> columnValues) throws Exception {
		super();
		Set set = new HashSet(columnValues);
		if (set.size() != columnValues.size())
			throw new Exception("Duplicate values present in input - " + columnValues.toString());
		this.columnValues = columnValues;
	}

	public List<Integer> getColumnValues() {
		return columnValues;
	}
}
