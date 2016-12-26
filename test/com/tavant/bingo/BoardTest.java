package com.tavant.bingo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testGetRows() throws Exception {
		Board board = getBoard();
		assertEquals(5, board.getRows().size());
	}

	@Test
	public void testGetColumnsOfBoard() throws Exception {
		Board board = getBoard();
		List<Column> columns = board.getColumns();
		assertEquals(Arrays.asList(1,6,11,16,21), columns.get(0).getColumnValues());
	}

	private Board getBoard() throws Exception {
		List<Integer> values1 = new ArrayList<Integer>();
		values1.addAll(Arrays.asList(1,2,3,4,5));
		Row row1 = new Row(values1);
		List<Integer> values2 = new ArrayList<Integer>();
		values2.addAll(Arrays.asList(6,7,8,9,10));
		Row row2 = new Row(values2);
		List<Integer> values3 = new ArrayList<Integer>();
		values3.addAll(Arrays.asList(11,12,13,14,15));
		Row row3 = new Row(values3);
		List<Integer> values4 = new ArrayList<Integer>();
		values4.addAll(Arrays.asList(16,17,18,19,20));
		Row row4 = new Row(values4);
		List<Integer> values5 = new ArrayList<Integer>();
		values5.addAll(Arrays.asList(21,22,23,24,25));
		Row row5 = new Row(values5);
		List<Row> rows = new ArrayList<Row>();
		rows.addAll(Arrays.asList(row1, row2, row3, row4, row5));
		Board board = new Board(rows);
		return board;
	}

	@Test
	public void testGetColumns() {
		fail("Not yet implemented");
	}

}
