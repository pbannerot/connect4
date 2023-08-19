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
public class VerticalLine implements Rule {

	@Override
	public List<Square> computeTokenOnLine(Board board, Square square) {
		List<Square> adjacentSquares = new ArrayList<>();
		Side side = square.getToken().getSide();
		int column = square.getColumn();
		
		Square lastSquareOnColumn = board.getSquare(column, board.getNbRow() -1);
		
		for (int offset = 0 ; offset < board.getNbRow(); offset ++) {
			Square adjacentSquare = lastSquareOnColumn.getAdjacentSquare(0, -offset);
			logger.debug(adjacentSquare);
			
			if (!adjacentSquare.isEmpty() && side.equals(adjacentSquare.getToken().getSide())) {
				adjacentSquares.add(adjacentSquare);
			} else {
				if (adjacentSquares.size() < 4) {
					adjacentSquares.clear();
				}
			} 
		}
		return adjacentSquares.size() >= 4 ? adjacentSquares : null;

	}

}
