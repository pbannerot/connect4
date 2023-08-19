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
public class RuleCase {
	private Rule rule;

	/**
	 * @param rule
	 */
	public RuleCase(Rule rule) {
		this.rule = rule;
	}
	
	public List<Square> checkRule(Board board, Square currentSquare) {
		return rule.computeTokenOnLine(board, currentSquare);
	}
	
}
