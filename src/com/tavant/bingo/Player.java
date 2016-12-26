package com.tavant.bingo;

public class Player {

	private int id;
	private Board board;

	public Player(int id, Board board) {
		super();
		this.id = id;
		this.board = board;
	}

	public int getId() {
		return id;
	}

	public Board getBoard() {
		return board;
	}

	public void displayBoard(Player player) {
		Board board = player.getBoard();
		for (Row row : board.getRows()) {
			System.out.println(row.getValues());
		}
	}
}
