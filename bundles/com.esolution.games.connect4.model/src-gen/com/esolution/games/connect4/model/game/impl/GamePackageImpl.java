/**
 */
package com.esolution.games.connect4.model.game.impl;

import com.esolution.games.connect4.model.game.AIPlayer;
import com.esolution.games.connect4.model.game.Board;
import com.esolution.games.connect4.model.game.Game;
import com.esolution.games.connect4.model.game.GameFactory;
import com.esolution.games.connect4.model.game.GamePackage;
import com.esolution.games.connect4.model.game.HumanPlayer;
import com.esolution.games.connect4.model.game.Player;
import com.esolution.games.connect4.model.game.RandomPlayer;
import com.esolution.games.connect4.model.game.RedToken;
import com.esolution.games.connect4.model.game.Side;
import com.esolution.games.connect4.model.game.Square;
import com.esolution.games.connect4.model.game.Team;
import com.esolution.games.connect4.model.game.Token;
import com.esolution.games.connect4.model.game.YellowToken;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamePackageImpl extends EPackageImpl implements GamePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yellowTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sideEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.esolution.games.connect4.model.game.GamePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GamePackageImpl() {
		super(eNS_URI, GameFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GamePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GamePackage init() {
		if (isInited)
			return (GamePackage) EPackage.Registry.INSTANCE.getEPackage(GamePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGamePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GamePackageImpl theGamePackage = registeredGamePackage instanceof GamePackageImpl
				? (GamePackageImpl) registeredGamePackage
				: new GamePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGamePackage.createPackageContents();

		// Initialize created meta-data
		theGamePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGamePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GamePackage.eNS_URI, theGamePackage);
		return theGamePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Board() {
		return (EReference) gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGame_Teams() {
		return (EReference) gameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeam_Side() {
		return (EAttribute) teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeam_Player() {
		return (EReference) teamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Squares() {
		return (EReference) boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_NbRow() {
		return (EAttribute) boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoard_NbColumn() {
		return (EAttribute) boardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoard__GetFirstAvailableSquare__int() {
		return boardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoard__GetAdjacentSquare__Square_int_int() {
		return boardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoard__GetSquare__int_int() {
		return boardEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Square() {
		return (EReference) tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__GetSide() {
		return tokenEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__GetOppositeSide() {
		return tokenEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getToken__GetImageFile() {
		return tokenEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedToken() {
		return redTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYellowToken() {
		return yellowTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSquare() {
		return squareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_Row() {
		return (EAttribute) squareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_Column() {
		return (EAttribute) squareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_Token() {
		return (EReference) squareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSquare__GetImage() {
		return squareEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSquare__IsEmpty() {
		return squareEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayer() {
		return playerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_Tokens() {
		return (EReference) playerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanPlayer() {
		return humanPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomPlayer() {
		return randomPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAIPlayer() {
		return aiPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSide() {
		return sideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameFactory getGameFactory() {
		return (GameFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		gameEClass = createEClass(GAME);
		createEReference(gameEClass, GAME__BOARD);
		createEReference(gameEClass, GAME__TEAMS);

		teamEClass = createEClass(TEAM);
		createEAttribute(teamEClass, TEAM__SIDE);
		createEReference(teamEClass, TEAM__PLAYER);

		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__SQUARES);
		createEAttribute(boardEClass, BOARD__NB_ROW);
		createEAttribute(boardEClass, BOARD__NB_COLUMN);
		createEOperation(boardEClass, BOARD___GET_FIRST_AVAILABLE_SQUARE__INT);
		createEOperation(boardEClass, BOARD___GET_ADJACENT_SQUARE__SQUARE_INT_INT);
		createEOperation(boardEClass, BOARD___GET_SQUARE__INT_INT);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__SQUARE);
		createEOperation(tokenEClass, TOKEN___GET_SIDE);
		createEOperation(tokenEClass, TOKEN___GET_OPPOSITE_SIDE);
		createEOperation(tokenEClass, TOKEN___GET_IMAGE_FILE);

		redTokenEClass = createEClass(RED_TOKEN);

		yellowTokenEClass = createEClass(YELLOW_TOKEN);

		squareEClass = createEClass(SQUARE);
		createEAttribute(squareEClass, SQUARE__ROW);
		createEAttribute(squareEClass, SQUARE__COLUMN);
		createEReference(squareEClass, SQUARE__TOKEN);
		createEOperation(squareEClass, SQUARE___GET_IMAGE);
		createEOperation(squareEClass, SQUARE___IS_EMPTY);

		playerEClass = createEClass(PLAYER);
		createEReference(playerEClass, PLAYER__TOKENS);

		humanPlayerEClass = createEClass(HUMAN_PLAYER);

		randomPlayerEClass = createEClass(RANDOM_PLAYER);

		aiPlayerEClass = createEClass(AI_PLAYER);

		// Create enums
		sideEEnum = createEEnum(SIDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		redTokenEClass.getESuperTypes().add(this.getToken());
		yellowTokenEClass.getESuperTypes().add(this.getToken());
		humanPlayerEClass.getESuperTypes().add(this.getPlayer());
		randomPlayerEClass.getESuperTypes().add(this.getPlayer());
		aiPlayerEClass.getESuperTypes().add(this.getPlayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGame_Board(), this.getBoard(), null, "board", null, 1, 1, Game.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGame_Teams(), this.getTeam(), null, "teams", null, 0, 2, Game.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeam_Side(), this.getSide(), "side", null, 0, 1, Team.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeam_Player(), this.getPlayer(), null, "player", null, 1, 1, Team.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Squares(), this.getSquare(), null, "squares", null, 0, -1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBoard_NbRow(), ecorePackage.getEInt(), "nbRow", "6", 0, 1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_NbColumn(), ecorePackage.getEInt(), "nbColumn", "7", 0, 1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBoard__GetFirstAvailableSquare__int(), this.getSquare(),
				"getFirstAvailableSquare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBoard__GetAdjacentSquare__Square_int_int(), this.getSquare(), "getAdjacentSquare", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSquare(), "sourceSquare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "columnOffset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "rowOffset", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBoard__GetSquare__int_int(), this.getSquare(), "getSquare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_Square(), this.getSquare(), this.getSquare_Token(), "square", null, 1, 1, Token.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getToken__GetSide(), this.getSide(), "getSide", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__GetOppositeSide(), this.getSide(), "getOppositeSide", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getToken__GetImageFile(), ecorePackage.getEString(), "getImageFile", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(redTokenEClass, RedToken.class, "RedToken", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(yellowTokenEClass, YellowToken.class, "YellowToken", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(squareEClass, Square.class, "Square", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSquare_Row(), ecorePackage.getEInt(), "row", null, 0, 1, Square.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquare_Column(), ecorePackage.getEInt(), "column", null, 0, 1, Square.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_Token(), this.getToken(), this.getToken_Square(), "token", null, 0, 1, Square.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSquare__GetImage(), ecorePackage.getEJavaObject(), "getImage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSquare__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(playerEClass, Player.class, "Player", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlayer_Tokens(), this.getToken(), null, "tokens", null, 0, 21, Player.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(humanPlayerEClass, HumanPlayer.class, "HumanPlayer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(randomPlayerEClass, RandomPlayer.class, "RandomPlayer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(aiPlayerEClass, AIPlayer.class, "AIPlayer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(sideEEnum, Side.class, "Side");
		addEEnumLiteral(sideEEnum, Side.YELLOW);
		addEEnumLiteral(sideEEnum, Side.RED);

		// Create resource
		createResource(eNS_URI);
	}

} //GamePackageImpl
