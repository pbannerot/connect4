/**
 * 
 */
package com.esolution.games.connect4.core.rules;

import java.util.ArrayList;
import java.util.List;

import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.Side;
import com.esolution.games.connect4.model.game.Square;

/**
 * 
 */
public interface DiagonalLine extends Rule {
	@Override
	default List<Square> computeTokenOnLine(Board board, Square square) {
		logger.debug(DiagonalLine.class);
		List<Square> adjacentSquares = new ArrayList<>();	// Stream.of(square).collect(Collectors.toCollection(ArrayList::new));
		Side side = square.getToken().getSide();
		
		List<Square> aboveSquares = getSquareOnDiagonal(board, square);
		for (Square aboveSquare : aboveSquares) {
			if (!aboveSquare.isEmpty() && side.equals(aboveSquare.getToken().getSide())) {
				adjacentSquares.add(aboveSquare);
			} else {
				if (adjacentSquares.size() < 4) {
					adjacentSquares.clear();
				}
			} 
		}
		
		if (adjacentSquares.size() < 4) {
			adjacentSquares.clear();
		}
		List<Square> belowSquares = getSquareOnDiagonal(board, square);
		for (Square belowSquare : belowSquares) {
			if (!belowSquare.isEmpty() && side.equals(belowSquare.getToken().getSide())) {
				adjacentSquares.add(belowSquare);
			} else {
				if (adjacentSquares.size() < 4) {
					adjacentSquares.clear();
				}
			} 
		}
		return adjacentSquares.size() >= 4 ? adjacentSquares : null;
	}
	
	List<Square> getSquareOnDiagonal(Board board, Square square);
}
