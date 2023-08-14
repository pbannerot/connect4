/**
 * 
 */
package com.esolution.games.connect4.app.parts;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.Game;
import com.esolution.games.connect4.model.game.GameFactory;
import com.esolution.games.connect4.model.game.Square;

/**
 * 
 */
public class BoardPart {
	private static final Log logger = LogFactory.getLog(BoardPart.class);
	
	private Game connect4Game;
	private Board board;
	private List<Label> squares;
	
	public BoardPart() {
		connect4Game = GameFactory.eINSTANCE.createGame();
		board = GameFactory.eINSTANCE.createBoard();
		connect4Game.setBoard(board);
		
		squares = new ArrayList<Label>();
	}

	@PostConstruct
	public void createComposite(Composite parent) {
		logger.debug("createComposite()");
		
		parent.setLayout(new GridLayout(board.getNbColumn(), true));
		parent.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_BLUE));
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.verticalSpan = board.getNbRow();
		gridData.minimumHeight = 25;
		gridData.minimumWidth = 25;
		
		for (int column = 0; column < board.getNbColumn(); column ++) {
			for (int row = 0; row < board.getNbRow(); row ++) {
				Square square = GameFactory.eINSTANCE.createSquare();
				square.setColumn(column);
				square.setRow(row);
				board.getSquares().add(square);
				
				Label label = new Label(parent, SWT.NONE | SWT.CENTER);
				label.setSize(new Point(25, 25));
				label.setLayoutData(gridData);
                label.setData(square);
				label.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_BLUE));
				label.setImage((Image) square.getImage());
				
				label.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseUp(MouseEvent e) {
						logger.debug("mouseUp " + e);
					}
					
					@Override
					public void mouseDown(MouseEvent e) {
						logger.debug("mouseDown " + e);
						
					}
					
					@Override
					public void mouseDoubleClick(MouseEvent e) {
						logger.debug("mouseDoubleClick " + e);
						
					}
				});
				
				squares.add(label);
			}
		}
	}

	@Focus
	public void setFocus() {
		logger.debug("setFocus()");
		
		for (Label label : squares) {
			Square square = (Square) label.getData();
		}
	}
}
