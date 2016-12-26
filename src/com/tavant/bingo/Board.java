package com.tavant.bingo;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Row> rows;

	public Board(List<Row> rows) {
		super();
		this.rows = rows;
	}

	public List<Row> getRows() {
		return rows;
	}

	public List<Column> getColumns() throws Exception {
		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < rows.size(); i++) {
			List<Integer> columnValues = new ArrayList<Integer>();
			for (int j = 0; j < rows.size(); j++) {
				columnValues.add(rows.get(j).getValues().get(i));
			}
			Column column = new Column(columnValues);
			columns.add(column);
		}
		return columns;
	}
}
