/**
 * 
 */
package com.esolution.games.connect4.core.rules;

import java.util.ArrayList;
import java.util.List;

import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.Square;

/**
 * 
 */
public class DownLeftToTopRightDiagonal implements DiagonalLine {

	@Override
	public List<Square> getSquareOnDiagonal(Board board, Square square) {
		List<Square> squaresOnDiagonal = new ArrayList<>();
		Square adjacentSquare = square;
		Square previousSquare = square;
		do {
			previousSquare = adjacentSquare;
			adjacentSquare = adjacentSquare.getAdjacentSquare(1, -1);
		} while (adjacentSquare != null);
		
		adjacentSquare = previousSquare;
		do {
			squaresOnDiagonal.add(adjacentSquare);
			adjacentSquare = adjacentSquare.getAdjacentSquare(-1, 1);
		} while (adjacentSquare != null);
		
		return squaresOnDiagonal;
	}

}
