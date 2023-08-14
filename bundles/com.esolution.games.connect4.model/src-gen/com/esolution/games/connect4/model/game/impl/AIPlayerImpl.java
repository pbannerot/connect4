/**
 */
package com.esolution.games.connect4.model.game.impl;

import com.esolution.games.connect4.model.game.AIPlayer;
import com.esolution.games.connect4.model.game.GamePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AIPlayerImpl extends PlayerImpl implements AIPlayer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIPlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.AI_PLAYER;
	}

} //AIPlayerImpl
