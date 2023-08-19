/**
 * 
 */
package com.esolution.games.connect4.app.parts;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import com.esolution.games.connect4.core.Connect4Match;
import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.GameFactory;
import com.esolution.games.connect4.model.game.Side;
import com.esolution.games.connect4.model.game.Square;
import com.esolution.games.connect4.model.game.Token;

/**
 * 
 */
public class BoardPart {
	private static final Log logger = LogFactory.getLog(BoardPart.class);
	
	private Board board;
	private List<Label> squares;
	private Side currentSide = Side.RED;
	
	@Inject MPart boardPart;
	
	public BoardPart() {
		board = Connect4Match.getInstance().getBoard();
		
		squares = new ArrayList<Label>();
	}

	@PostConstruct
	public void createComposite(Composite parent) {
		logger.debug("createComposite()");
		
		parent.setLayout(new GridLayout(board.getNbColumn(), true));
		parent.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_BLUE));
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.minimumHeight = 25;
		gridData.minimumWidth = 25;
		
		for (int row = 0; row < board.getNbRow(); row ++) {
			for (int column = 0; column < board.getNbColumn(); column ++) {
				Square square = GameFactory.eINSTANCE.createSquare();
				square.setColumn(column);
				square.setRow(row);
				square.setBoard(board);
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
						
						Square availableSquare = board.getFirstAvailableSquare(square.getColumn());
						if (availableSquare != null) {
							Token token = currentSide.equals(Side.RED) ? GameFactory.eINSTANCE.createRedToken() : GameFactory.eINSTANCE.createYellowToken();
							availableSquare.setToken(token);
							token.setSquare(availableSquare);
							
							Connect4Match.getInstance().checkWinner(availableSquare);

							currentSide = currentSide.equals(Side.RED) ? Side.YELLOW : Side.RED;
							
							setFocus();
//							((Resource) availableSquare.getImage()).dispose();
						}
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
				
				label.addDisposeListener(new DisposeListener() {
					
					@Override
					public void widgetDisposed(DisposeEvent e) {
						logger.debug("widgetDisposed " + e);
						
						((Label) e.getSource()).getImage().dispose();
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
			label.getImage().dispose();
			label.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_BLUE));
			label.setImage((Image) square.getImage());
		}
	}
}
