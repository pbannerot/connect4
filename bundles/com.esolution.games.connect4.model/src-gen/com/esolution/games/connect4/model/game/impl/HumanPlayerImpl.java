/**
 */
package com.esolution.games.connect4.model.game.impl;

import com.esolution.games.connect4.model.game.GamePackage;
import com.esolution.games.connect4.model.game.HumanPlayer;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HumanPlayerImpl extends PlayerImpl implements HumanPlayer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanPlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.HUMAN_PLAYER;
	}

} //HumanPlayerImpl
