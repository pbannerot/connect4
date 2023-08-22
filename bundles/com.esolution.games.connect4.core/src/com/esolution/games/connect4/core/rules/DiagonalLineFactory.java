package com.esolution.games.connect4.core.rules;

public class DiagonalLineFactory {
	private final DiagonalDirection diagonalDirection;


	/**
	 * @param diagonalDirection
	 */
	public DiagonalLineFactory(DiagonalDirection diagonalDirection) {
		this.diagonalDirection = diagonalDirection;
	}


	public DiagonalLine getDiagonalLine() {
		DiagonalLine diagonalLine = null;
		switch (diagonalDirection) {
		case DOWN_LEFT_TO_TOP_RIGHT:
			diagonalLine = new DownLeftToTopRightDiagonal();
			break;
		case TOP_LEFT_TO_DOWN_RIGHT:
			diagonalLine = new TopLeftToDownRightDiagonal();
			break;
		}
		return diagonalLine;
	}
	
	

}
