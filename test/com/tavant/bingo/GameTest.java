package com.tavant.bingo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GameTest {
	Set<Player> winnersList = new HashSet<Player>();

	@Test
	public void testStart() throws Exception {
		ArrayList<Integer> rowValues = new ArrayList<Integer>();
		rowValues.addAll(Arrays.asList(6, 7, 8, 9, 10));

		ArrayList<Row> rows = new ArrayList<Row>();
		Row row = new Row(rowValues);
		rows.add(row);
		Board board = new Board(rows);

		Player player = new Player(32, board);
		player.displayBoard(player);
		winnersList.add(player);
		ArrayList<Player> listOfPlayers = new ArrayList<Player>();
		listOfPlayers.add(player);
		Game game = new Game(listOfPlayers);
		ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
		randomNumbers.addAll(Arrays.asList(6, 7, 8, 9, 10));

		assertEquals(winnersList, game.start(randomNumbers));
		assertEquals(winnersList.size(), game.start(randomNumbers).size());
		assertArrayEquals(winnersList.toArray(), game.start(randomNumbers).toArray());
	}
}
