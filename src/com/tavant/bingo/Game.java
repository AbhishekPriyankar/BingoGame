package com.tavant.bingo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {

	private List<Player> players;

	public Game(List<Player> players) {
		super();
		this.players = players;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public Set<Player> start(ArrayList<Integer> randomNumber) throws Exception {

		Set<Player> winnerList = new HashSet<Player>();
		GameMaster gameMaster = new GameMaster(randomNumber);

		for (Player currentPlayer : this.players) {
			Board currentPlayerBoard = currentPlayer.getBoard();
			for (Row row : currentPlayerBoard.getRows()) {
				if (gameMaster.matchRow(randomNumber, row) == true) {
					winnerList.add(currentPlayer);
					break;
				} else {
					for (Column col : currentPlayerBoard.getColumns()) {
						if (gameMaster.matchCol(randomNumber, col) == true) {
							winnerList.add(currentPlayer);
							break;
						}
					}
				}
			}
		}
		return winnerList;
	}
}
