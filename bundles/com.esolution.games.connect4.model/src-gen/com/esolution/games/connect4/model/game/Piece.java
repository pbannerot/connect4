/**
 */
package com.esolution.games.connect4.model.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.Piece#getSquare <em>Square</em>}</li>
 * </ul>
 *
 * @see com.esolution.games.connect4.model.game.GamePackage#getPiece()
 * @model abstract="true"
 * @generated
 */
public interface Piece extends EObject {
	/**
	 * Returns the value of the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square</em>' reference.
	 * @see #setSquare(Square)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getPiece_Square()
	 * @model required="true"
	 * @generated
	 */
	Square getSquare();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Piece#getSquare <em>Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Square</em>' reference.
	 * @see #getSquare()
	 * @generated
	 */
	void setSquare(Square value);

} // Piece
