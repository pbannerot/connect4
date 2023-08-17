/**
 * 
 */
package com.esolution.games.connect4.core;

/**
 * 
 */
public class Connect4Match {
	private static volatile Connect4Match connect4Match = null;
	private Connect4Match() {
	}

	public static Connect4Match getInstance() {
		if (connect4Match == null) {
			synchronized (Connect4Match.class) {
				if (connect4Match == null) {
					connect4Match = new Connect4Match();
				}
			}
		}
		return connect4Match;
	}
}
