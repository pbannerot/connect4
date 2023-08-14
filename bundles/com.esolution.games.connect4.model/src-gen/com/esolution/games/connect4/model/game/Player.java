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
 *   <li>{@link com.esolution.games.connect4.model.game.Player#getPieces <em>Pieces</em>}</li>
 * </ul>
 *
 * @see com.esolution.games.connect4.model.game.GamePackage#getPlayer()
 * @model abstract="true"
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link com.esolution.games.connect4.model.game.Piece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pieces</em>' containment reference list.
	 * @see com.esolution.games.connect4.model.game.GamePackage#getPlayer_Pieces()
	 * @model containment="true" upper="21"
	 * @generated
	 */
	EList<Piece> getPieces();

} // Player
