package com.tavant.bingo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {
	Board board = null;

	@Test
	public void testGetId() {
		Player player = new Player(2, board);
		assertEquals(2, player.getId());
	}
	
	@Test
	public void testGetBoard(){
		Player player = new Player(5,board);
		assertEquals(null, player.getBoard());
	} 
}
