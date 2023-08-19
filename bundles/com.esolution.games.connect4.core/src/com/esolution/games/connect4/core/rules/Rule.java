/**
 * 
 */
package com.esolution.games.connect4.core.rules;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.Square;

/**
 * 
 */
public interface Rule {
	public static final Log logger = LogFactory.getLog(Rule.class);
	
	public List<Square> computeTokenOnLine(Board board, Square square);

}
