package com.tavant.bingo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RowTest {

	@Test
	public void testGetValues() throws Exception {
		List<Integer> rowValues = new ArrayList<Integer>();
		rowValues.add(1);
		rowValues.add(2);
		rowValues.add(3);
		rowValues.add(4);
		rowValues.add(5);
		Row row = new Row(rowValues);
		assertEquals(5, row.getValues().size());
		assertEquals(new Integer(3), (Integer) row.getValues().get(2));
		assertArrayEquals(rowValues.toArray(), row.getValues().toArray());
	}

	@Test
	public void testGetValuesWithDuplicateValues() {
		List<Integer> rowValues = new ArrayList<Integer>();
		rowValues.add(1);
		rowValues.add(2);
		rowValues.add(1);
		rowValues.add(4);
		rowValues.add(5);
		boolean exceptionThrown = false;
		Row row = null;
		try {
			row = new Row(rowValues);
		} catch (Exception ex) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
}
