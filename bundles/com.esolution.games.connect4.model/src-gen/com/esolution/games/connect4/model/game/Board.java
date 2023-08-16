/**
 */
package com.esolution.games.connect4.model.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.Board#getSquares <em>Squares</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.Board#getNbRow <em>Nb Row</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.Board#getNbColumn <em>Nb Column</em>}</li>
 * </ul>
 *
 * @see com.esolution.games.connect4.model.game.GamePackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Squares</b></em>' containment reference list.
	 * The list contents are of type {@link com.esolution.games.connect4.model.game.Square}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Squares</em>' containment reference list.
	 * @see com.esolution.games.connect4.model.game.GamePackage#getBoard_Squares()
	 * @model containment="true"
	 * @generated
	 */
	EList<Square> getSquares();

	/**
	 * Returns the value of the '<em><b>Nb Row</b></em>' attribute.
	 * The default value is <code>"6"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Row</em>' attribute.
	 * @see #setNbRow(int)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getBoard_NbRow()
	 * @model default="6"
	 * @generated
	 */
	int getNbRow();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Board#getNbRow <em>Nb Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Row</em>' attribute.
	 * @see #getNbRow()
	 * @generated
	 */
	void setNbRow(int value);

	/**
	 * Returns the value of the '<em><b>Nb Column</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Column</em>' attribute.
	 * @see #setNbColumn(int)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getBoard_NbColumn()
	 * @model default="7"
	 * @generated
	 */
	int getNbColumn();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Board#getNbColumn <em>Nb Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Column</em>' attribute.
	 * @see #getNbColumn()
	 * @generated
	 */
	void setNbColumn(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Square getFirstAvailableSquare(int column);

} // Board
