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
		case DOWN_TOP:
			diagonalLine = new DownTopDiagonal();
			break;
		case TOP_DOWN:
			diagonalLine = new TopDownDiagonal();
			break;
		}
		return diagonalLine;
	}
	
	

}
