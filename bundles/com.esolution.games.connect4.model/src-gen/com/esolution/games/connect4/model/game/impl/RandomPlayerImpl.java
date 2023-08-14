/**
 */
package com.esolution.games.connect4.model.game.impl;

import com.esolution.games.connect4.model.game.GamePackage;
import com.esolution.games.connect4.model.game.RandomPlayer;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RandomPlayerImpl extends PlayerImpl implements RandomPlayer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomPlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.RANDOM_PLAYER;
	}

} //RandomPlayerImpl
