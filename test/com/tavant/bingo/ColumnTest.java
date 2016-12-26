package com.tavant.bingo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ColumnTest {

	@Test
	public void testGetValue() throws Exception {
		ArrayList<Integer> columnValue = new ArrayList<Integer>();
		columnValue.addAll(Arrays.asList(1, 2, 3, 4, 5));

		Column column = new Column(columnValue);
		assertEquals(5, column.getColumnValues().size());
		assertEquals(new Integer(3), column.getColumnValues().get(2));
		assertArrayEquals(columnValue.toArray(), column.getColumnValues().toArray());
	}

	@Test
	public void testForDuplicate() {
		ArrayList<Integer> columnValue = new ArrayList<Integer>();
		columnValue.addAll(Arrays.asList(1, 2, 3, 2, 5));

		boolean exceptionHandled = false;
		Column column = null;
		try {
			column = new Column(columnValue);
		} catch (Exception e) {
			exceptionHandled = true;
		}
		assertTrue(exceptionHandled);
	}

}
