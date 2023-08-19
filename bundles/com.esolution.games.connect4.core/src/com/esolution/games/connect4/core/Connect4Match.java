/**
 * 
 */
package com.esolution.games.connect4.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.esolution.games.connect4.core.rules.DiagonalDirection;
import com.esolution.games.connect4.core.rules.DiagonalLineFactory;
import com.esolution.games.connect4.core.rules.HorizontalLine;
import com.esolution.games.connect4.core.rules.RuleCase;
import com.esolution.games.connect4.core.rules.VerticalLine;
import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.Game;
import com.esolution.games.connect4.model.game.GameFactory;
import com.esolution.games.connect4.model.game.Player;
import com.esolution.games.connect4.model.game.Side;
import com.esolution.games.connect4.model.game.Square;
import com.esolution.games.connect4.model.game.Team;

/**
 * 
 */
public class Connect4Match {
	private static final Log logger = LogFactory.getLog(Connect4Match.class);
	private static volatile Connect4Match connect4Match = null;

	private final Game connect4Game;
	private final Board board;

	private Connect4Match() {
		connect4Game = GameFactory.eINSTANCE.createGame();
		board = GameFactory.eINSTANCE.createBoard();
		connect4Game.setBoard(board);

		Team redTeam = GameFactory.eINSTANCE.createTeam();
		redTeam.setSide(Side.RED);
		Player redPlayer = GameFactory.eINSTANCE.createHumanPlayer();
		redTeam.setPlayer(redPlayer);
		connect4Game.getTeams().add(redTeam);

		Team yelloTeam = GameFactory.eINSTANCE.createTeam();
		yelloTeam.setSide(Side.YELLOW);
		Player yellowPlayer = GameFactory.eINSTANCE.createHumanPlayer();
		yelloTeam.setPlayer(yellowPlayer);
		connect4Game.getTeams().add(yelloTeam);

		for (int tokenId = 0; tokenId < 21; tokenId++) {
			redPlayer.getTokens().add(GameFactory.eINSTANCE.createRedToken());
			yellowPlayer.getTokens().add(GameFactory.eINSTANCE.createYellowToken());
		}
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

	public void resetConnect4Match() {
		for (Square square : board.getSquares()) {
			square.setToken(null);
		}
	}

	public Side checkWinner(Square availableSquare) {
		List<RuleCase> rules = Stream
				.of(new RuleCase(new HorizontalLine()), new RuleCase(new VerticalLine()),
						new RuleCase(new DiagonalLineFactory(DiagonalDirection.TOP_DOWN).getDiagonalLine()),
						new RuleCase(new DiagonalLineFactory(DiagonalDirection.DOWN_TOP).getDiagonalLine()))
				.collect(Collectors.toCollection(ArrayList::new));
		for (RuleCase ruleCase : rules) {
			List<Square> winner = ruleCase.checkRule(board, availableSquare);
			if (winner != null && winner.size() >= 4) {
				logger.info("WINNER");
			}
		}

		return null;
	}

	/**
	 * @return the connect4Game
	 */
	public Game getConnect4Game() {
		return connect4Game;
	}

	/**
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}

}
