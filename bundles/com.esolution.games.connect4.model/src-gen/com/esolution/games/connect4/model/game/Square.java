/**
 */
package com.esolution.games.connect4.model.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.Square#getRow <em>Row</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.Square#getColumn <em>Column</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.Square#getToken <em>Token</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.Square#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @see com.esolution.games.connect4.model.game.GamePackage#getSquare()
 * @model
 * @generated
 */
public interface Square extends EObject {

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getSquare_Row()
	 * @model
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Square#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getSquare_Column()
	 * @model
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Square#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.esolution.games.connect4.model.game.Token#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getSquare_Token()
	 * @see com.esolution.games.connect4.model.game.Token#getSquare
	 * @model opposite="square"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Square#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.esolution.games.connect4.model.game.Board#getSquares <em>Squares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' reference.
	 * @see #setBoard(Board)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getSquare_Board()
	 * @see com.esolution.games.connect4.model.game.Board#getSquares
	 * @model opposite="squares" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Square#getBoard <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Object getImage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Square getAdjacentSquare(int columnOffset, int rowOffset);
} // Square
