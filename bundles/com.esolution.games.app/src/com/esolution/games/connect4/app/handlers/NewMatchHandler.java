/**
 * 
 */
package com.esolution.games.connect4.app.handlers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import com.esolution.games.connect4.app.parts.BoardPart;
import com.esolution.games.connect4.core.Connect4Match;

/**
 * 
 */
public class NewMatchHandler {
	private static final Log logger = LogFactory.getLog(NewMatchHandler.class);
	
	@Execute
	public void execute(EPartService partService){
		Connect4Match.getInstance().resetConnect4Match();
		
		MPart part = partService.findPart("com.esolution.games.connect4.app.part.board");
		BoardPart boardPart = (BoardPart) part.getObject();
		boardPart.setFocus();
	}
}
