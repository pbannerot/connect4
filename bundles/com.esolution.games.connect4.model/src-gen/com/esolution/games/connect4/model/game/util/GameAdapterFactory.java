/**
 */
package com.esolution.games.connect4.model.game.util;

import com.esolution.games.connect4.model.game.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.esolution.games.connect4.model.game.GamePackage
 * @generated
 */
public class GameAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GamePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameSwitch<Adapter> modelSwitch = new GameSwitch<Adapter>() {
		@Override
		public Adapter caseGame(Game object) {
			return createGameAdapter();
		}

		@Override
		public Adapter caseTeam(Team object) {
			return createTeamAdapter();
		}

		@Override
		public Adapter caseBoard(Board object) {
			return createBoardAdapter();
		}

		@Override
		public Adapter casePiece(Piece object) {
			return createPieceAdapter();
		}

		@Override
		public Adapter caseRedPiece(RedPiece object) {
			return createRedPieceAdapter();
		}

		@Override
		public Adapter caseYellowPiece(YellowPiece object) {
			return createYellowPieceAdapter();
		}

		@Override
		public Adapter caseSquare(Square object) {
			return createSquareAdapter();
		}

		@Override
		public Adapter casePlayer(Player object) {
			return createPlayerAdapter();
		}

		@Override
		public Adapter caseHumanPlayer(HumanPlayer object) {
			return createHumanPlayerAdapter();
		}

		@Override
		public Adapter caseRandomPlayer(RandomPlayer object) {
			return createRandomPlayerAdapter();
		}

		@Override
		public Adapter caseAIPlayer(AIPlayer object) {
			return createAIPlayerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.Team
	 * @generated
	 */
	public Adapter createTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.Piece
	 * @generated
	 */
	public Adapter createPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.RedPiece <em>Red Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.RedPiece
	 * @generated
	 */
	public Adapter createRedPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.YellowPiece <em>Yellow Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.YellowPiece
	 * @generated
	 */
	public Adapter createYellowPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.Square
	 * @generated
	 */
	public Adapter createSquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.HumanPlayer <em>Human Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.HumanPlayer
	 * @generated
	 */
	public Adapter createHumanPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.RandomPlayer <em>Random Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.RandomPlayer
	 * @generated
	 */
	public Adapter createRandomPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.esolution.games.connect4.model.game.AIPlayer <em>AI Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.esolution.games.connect4.model.game.AIPlayer
	 * @generated
	 */
	public Adapter createAIPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GameAdapterFactory
