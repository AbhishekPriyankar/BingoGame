package com.tavant.bingo;

import java.util.ArrayList;

public class GameMaster {
	Board board;
	private ArrayList<Integer> randomNumber;

	public GameMaster(ArrayList<Integer> randomNumber) {
		this.randomNumber = randomNumber;
	}

	public boolean matchRow(ArrayList<Integer> randomNumber, Row row) {
		if (randomNumber.containsAll(row.getValues())) {
			return true;
		}
		return false;
	}

	public boolean matchCol(ArrayList<Integer> randomNumber, Column col) throws Exception {
		if (randomNumber.containsAll(col.getColumnValues())) {
			return true;
		}
		return false;
	}
}
