/**
 */
package com.esolution.games.connect4.model.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.esolution.games.connect4.model.game.Team#getSide <em>Side</em>}</li>
 *   <li>{@link com.esolution.games.connect4.model.game.Team#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see com.esolution.games.connect4.model.game.GamePackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The literals are from the enumeration {@link com.esolution.games.connect4.model.game.Side}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see com.esolution.games.connect4.model.game.Side
	 * @see #setSide(Side)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getTeam_Side()
	 * @model
	 * @generated
	 */
	Side getSide();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Team#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see com.esolution.games.connect4.model.game.Side
	 * @see #getSide()
	 * @generated
	 */
	void setSide(Side value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference.
	 * @see #setPlayer(Player)
	 * @see com.esolution.games.connect4.model.game.GamePackage#getTeam_Player()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link com.esolution.games.connect4.model.game.Team#getPlayer <em>Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' containment reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

} // Team
