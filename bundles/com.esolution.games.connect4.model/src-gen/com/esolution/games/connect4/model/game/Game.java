/**
 */
package com.esolution.games.connect4.model.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.Game#getBoard <em>Board</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.Game#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see com.esolution.games.connect4.model.game.GamePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getGame_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Game#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link com.esolution.games.connect4.model.game.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see com.esolution.games.connect4.model.game.GamePackage#getGame_Teams()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Team> getTeams();

} // Game
