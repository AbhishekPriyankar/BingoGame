package com.tavant.bingo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Contest {

	private int numberOfPlayers;
	private static Scanner input;

	public Contest(int numberOfPlayers) {
		super();
		this.numberOfPlayers = numberOfPlayers;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public Game getGame() throws Exception {
		BoardGenerator boardGenerator = BoardGenerator.getInstance();
		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < numberOfPlayers; i++) {
			Board board = boardGenerator.getRandomBoard();
			Player player = new Player(i, board);
			//System.out.println("Player :" + player.getId());
			//player.displayBoard(player);
			players.add(player);
		}

		Game game = new Game(players);
		return game;
	}

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> randomNumber = new ArrayList<Integer>();
		Set<Player> listOfWinners = new HashSet<Player>();

		System.out.println("Enter the Participants number : ");
		input = new Scanner(System.in);
		int numberOfPlayers = 0;
		numberOfPlayers = input.nextInt();

		Contest contest = new Contest(numberOfPlayers);
		Game game = contest.getGame();
		System.out.println("Starting Game !!!!");
		input = new Scanner(System.in);
		System.out.println("Call the Numbers BOSS!!!!!");
		for (int i = 1; i <= 5; i++) {
			Integer luckyNumber = input.nextInt();
			randomNumber.add(luckyNumber);
		}
		while (listOfWinners.size() < 1) {
			listOfWinners = game.start(randomNumber);
			Integer newRandomNumber = input.nextInt();
			randomNumber.add(newRandomNumber);
		}
		for (Player player : listOfWinners) {
			System.out.println("the winner/s is/are " + player.getId());
		}
	}
}
