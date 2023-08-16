/**
 */
package com.esolution.games.connect4.model.game.impl;

import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.GamePackage;
import com.esolution.games.connect4.model.game.Square;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.impl.BoardImpl#getSquares <em>Squares</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.impl.BoardImpl#getNbRow <em>Nb Row</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.impl.BoardImpl#getNbColumn <em>Nb Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The cached value of the '{@link #getSquares() <em>Squares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquares()
	 * @generated
	 * @ordered
	 */
	protected EList<Square> squares;

	/**
	 * The default value of the '{@link #getNbRow() <em>Nb Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRow()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ROW_EDEFAULT = 6;

	/**
	 * The cached value of the '{@link #getNbRow() <em>Nb Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRow()
	 * @generated
	 * @ordered
	 */
	protected int nbRow = NB_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbColumn() <em>Nb Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_COLUMN_EDEFAULT = 7;

	/**
	 * The cached value of the '{@link #getNbColumn() <em>Nb Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColumn()
	 * @generated
	 * @ordered
	 */
	protected int nbColumn = NB_COLUMN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Square> getSquares() {
		if (squares == null) {
			squares = new EObjectContainmentEList<Square>(Square.class, this, GamePackage.BOARD__SQUARES);
		}
		return squares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbRow() {
		return nbRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRow(int newNbRow) {
		int oldNbRow = nbRow;
		nbRow = newNbRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.BOARD__NB_ROW, oldNbRow, nbRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbColumn() {
		return nbColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbColumn(int newNbColumn) {
		int oldNbColumn = nbColumn;
		nbColumn = newNbColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.BOARD__NB_COLUMN, oldNbColumn, nbColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Square getFirstAvailableSquare(int column) {
		Square availableSquare = null;

		for (Square square : squares) {
			if (square.getColumn() == column) {
				if (square.isEmpty()) {
					availableSquare = square;
				}
			}
		}
		return availableSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.BOARD__SQUARES:
			return ((InternalEList<?>) getSquares()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GamePackage.BOARD__SQUARES:
			return getSquares();
		case GamePackage.BOARD__NB_ROW:
			return getNbRow();
		case GamePackage.BOARD__NB_COLUMN:
			return getNbColumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GamePackage.BOARD__SQUARES:
			getSquares().clear();
			getSquares().addAll((Collection<? extends Square>) newValue);
			return;
		case GamePackage.BOARD__NB_ROW:
			setNbRow((Integer) newValue);
			return;
		case GamePackage.BOARD__NB_COLUMN:
			setNbColumn((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GamePackage.BOARD__SQUARES:
			getSquares().clear();
			return;
		case GamePackage.BOARD__NB_ROW:
			setNbRow(NB_ROW_EDEFAULT);
			return;
		case GamePackage.BOARD__NB_COLUMN:
			setNbColumn(NB_COLUMN_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GamePackage.BOARD__SQUARES:
			return squares != null && !squares.isEmpty();
		case GamePackage.BOARD__NB_ROW:
			return nbRow != NB_ROW_EDEFAULT;
		case GamePackage.BOARD__NB_COLUMN:
			return nbColumn != NB_COLUMN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GamePackage.BOARD___GET_FIRST_AVAILABLE_SQUARE__INT:
			return getFirstAvailableSquare((Integer) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nbRow: ");
		result.append(nbRow);
		result.append(", nbColumn: ");
		result.append(nbColumn);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
