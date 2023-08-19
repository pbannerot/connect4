/**
 * 
 */
package com.esolution.games.connect4.core.rules;

import java.util.List;

import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.Square;

/**
 * 
 */
public interface DiagonalLine extends Rule {
	@Override
	default List<Square> computeTokenOnLine(Board board, Square square) {
		logger.debug(DiagonalLine.class);
		List<Square> adjacentSquares = null;
		return adjacentSquares;
	}
	
	List<Square> getSquareOnDiagonal(DiagonalDirection diagonalDirection);
}
