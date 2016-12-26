package com.tavant.bingo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Row {

	private List<Integer> values;

	public Row(List<Integer> values) throws Exception {
		super();
		Set set = new HashSet(values);
		if (set.size() != values.size())
			throw new Exception("Duplicate values present in input - " + values.toString());
		this.values = values;
	}

	public List<Integer> getValues() {
		return values;
	}
}
