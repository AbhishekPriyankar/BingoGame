package com.tavant.bingo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameMasterTest {
	GameMaster gameMaster = null;

	@Test
	public void testMatchRow() throws Exception {
		ArrayList<Integer> randomValues = new ArrayList<Integer>();
		randomValues.addAll(Arrays.asList(1, 2, 3, 4, 5,6,7,8,9));
		gameMaster = new GameMaster(randomValues);

		Row row = new Row(randomValues);

		assertTrue(gameMaster.matchRow(randomValues, row));
	}
	
	@Test
	public void testMatchCol() throws Exception{
		ArrayList<Integer> randomValues = new ArrayList<Integer>();
		randomValues.addAll(Arrays.asList(1,2,3,4,5));
		gameMaster = new GameMaster(randomValues);
		
		Column col = new Column(randomValues);
		
		assertTrue(gameMaster.matchCol(randomValues, col));
	}
}
