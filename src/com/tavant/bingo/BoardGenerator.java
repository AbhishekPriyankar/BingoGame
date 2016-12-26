package com.tavant.bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoardGenerator {

	private static BoardGenerator INSTANCE;
	private static final int NUMBER_OF_ROWS = 5;
	private static final List<Integer> numbersInTheBoard = new ArrayList<Integer>();

	private BoardGenerator() {
		for (int i = 1; i <= NUMBER_OF_ROWS * NUMBER_OF_ROWS; i++) {
			this.numbersInTheBoard.add(i);
		}
	}

	public static BoardGenerator getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new BoardGenerator();
		}
		return INSTANCE;
	}

	public Board getRandomBoard() throws Exception {
		Collections.shuffle(numbersInTheBoard);
		Board board = null;
		int count = 0;
		List<Row> rows = new ArrayList<Row>();
		for (int i = 0; i < NUMBER_OF_ROWS; i++) {
			List<Integer> values = new ArrayList<Integer>();
			for (int j = 0; j < NUMBER_OF_ROWS; j++) {
				values.add(numbersInTheBoard.get(count++));
			}
			rows.add(new Row(values));
		}
		board = new Board(rows);
		return board;
	}
}
