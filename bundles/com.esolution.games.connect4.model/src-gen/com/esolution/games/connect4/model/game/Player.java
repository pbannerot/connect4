/**
 */
package com.esolution.games.connect4.model.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.Player#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see com.esolution.games.connect4.model.game.GamePackage#getPlayer()
 * @model abstract="true"
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link com.esolution.games.connect4.model.game.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see com.esolution.games.connect4.model.game.GamePackage#getPlayer_Tokens()
	 * @model containment="true" upper="21"
	 * @generated
	 */
	EList<Token> getTokens();

} // Player
