/**
 */
package com.esolution.games.connect4.model.game.impl;

import com.esolution.games.connect4.model.game.GamePackage;
import com.esolution.games.connect4.model.game.Side;
import com.esolution.games.connect4.model.game.Square;
import com.esolution.games.connect4.model.game.YellowToken;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Yellow Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.impl.YellowTokenImpl#getSquare <em>Square</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YellowTokenImpl extends MinimalEObjectImpl.Container implements YellowToken {
	/**
	 * The cached value of the '{@link #getSquare() <em>Square</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquare()
	 * @generated
	 * @ordered
	 */
	protected Square square;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YellowTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.YELLOW_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square getSquare() {
		if (square != null && square.eIsProxy()) {
			InternalEObject oldSquare = (InternalEObject) square;
			square = (Square) eResolveProxy(oldSquare);
			if (square != oldSquare) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamePackage.YELLOW_TOKEN__SQUARE,
							oldSquare, square));
			}
		}
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square basicGetSquare() {
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSquare(Square newSquare, NotificationChain msgs) {
		Square oldSquare = square;
		square = newSquare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GamePackage.YELLOW_TOKEN__SQUARE, oldSquare, newSquare);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSquare(Square newSquare) {
		if (newSquare != square) {
			NotificationChain msgs = null;
			if (square != null)
				msgs = ((InternalEObject) square).eInverseRemove(this, GamePackage.SQUARE__TOKEN, Square.class, msgs);
			if (newSquare != null)
				msgs = ((InternalEObject) newSquare).eInverseAdd(this, GamePackage.SQUARE__TOKEN, Square.class, msgs);
			msgs = basicSetSquare(newSquare, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.YELLOW_TOKEN__SQUARE, newSquare,
					newSquare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Side getSide() {
		return Side.YELLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Side getOppositeSide() {
		return Side.RED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getImageFile() {
		return "images/yellow.png";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.YELLOW_TOKEN__SQUARE:
			if (square != null)
				msgs = ((InternalEObject) square).eInverseRemove(this, GamePackage.SQUARE__TOKEN, Square.class, msgs);
			return basicSetSquare((Square) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.YELLOW_TOKEN__SQUARE:
			return basicSetSquare(null, msgs);
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
		case GamePackage.YELLOW_TOKEN__SQUARE:
			if (resolve)
				return getSquare();
			return basicGetSquare();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GamePackage.YELLOW_TOKEN__SQUARE:
			setSquare((Square) newValue);
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
		case GamePackage.YELLOW_TOKEN__SQUARE:
			setSquare((Square) null);
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
		case GamePackage.YELLOW_TOKEN__SQUARE:
			return square != null;
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
		case GamePackage.YELLOW_TOKEN___GET_SIDE:
			return getSide();
		case GamePackage.YELLOW_TOKEN___GET_OPPOSITE_SIDE:
			return getOppositeSide();
		case GamePackage.YELLOW_TOKEN___GET_IMAGE_FILE:
			return getImageFile();
		}
		return super.eInvoke(operationID, arguments);
	}

} //YellowTokenImpl
