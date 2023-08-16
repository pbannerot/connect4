/**
 */
package com.esolution.games.connect4.model.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.Token#getSquare <em>Square</em>}</li>
 * </ul>
 *
 * @see com.esolution.games.connect4.model.game.GamePackage#getToken()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Square</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.esolution.games.connect4.model.game.Square#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square</em>' reference.
	 * @see #setSquare(Square)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getToken_Square()
	 * @see com.esolution.games.connect4.model.game.Square#getToken
	 * @model opposite="token" required="true"
	 * @generated
	 */
	Square getSquare();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Token#getSquare <em>Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Square</em>' reference.
	 * @see #getSquare()
	 * @generated
	 */
	void setSquare(Square value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Side getSide();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Side getOppositeSide();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getImageFile();

} // Token
