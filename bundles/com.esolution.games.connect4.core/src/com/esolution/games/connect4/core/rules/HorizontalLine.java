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
public class HorizontalLine implements Rule {
	@Override
	public List<Square> computeTokenOnLine(Board board, Square square) {
		List<Square> adjacentSquares = new ArrayList<>();
		Side side = square.getToken().getSide();
		int row = square.getRow();
		
		Square firstSquareOnRow = board.getSquare(0, row);
		
		for (int offset = 0; offset < board.getNbColumn() - 1; offset ++) {
			Square adjacentSquare = firstSquareOnRow.getAdjacentSquare(offset, 0);
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
