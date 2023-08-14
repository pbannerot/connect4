/**
 */
package com.esolution.games.connect4.model.game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.esolution.games.connect4.model.game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.esolution.com/connect4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "connect4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamePackage eINSTANCE = com.esolution.games.connect4.model.game.impl.GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.GameImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__BOARD = 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TEAMS = 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.TeamImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 1;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SIDE = 0;

	/**
	 * The feature id for the '<em><b>Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYER = 1;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.BoardImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 2;

	/**
	 * The feature id for the '<em><b>Squares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SQUARES = 0;

	/**
	 * The feature id for the '<em><b>Nb Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NB_ROW = 1;

	/**
	 * The feature id for the '<em><b>Nb Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NB_COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.PieceImpl <em>Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.PieceImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getPiece()
	 * @generated
	 */
	int PIECE = 3;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__SQUARE = 0;

	/**
	 * The number of structural features of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.RedPieceImpl <em>Red Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.RedPieceImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getRedPiece()
	 * @generated
	 */
	int RED_PIECE = 4;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_PIECE__SQUARE = PIECE__SQUARE;

	/**
	 * The number of structural features of the '<em>Red Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_PIECE_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Red Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_PIECE_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.YellowPieceImpl <em>Yellow Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.YellowPieceImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getYellowPiece()
	 * @generated
	 */
	int YELLOW_PIECE = 5;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELLOW_PIECE__SQUARE = PIECE__SQUARE;

	/**
	 * The number of structural features of the '<em>Yellow Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELLOW_PIECE_FEATURE_COUNT = PIECE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Yellow Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELLOW_PIECE_OPERATION_COUNT = PIECE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.SquareImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 6;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__ROW = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE___GET_IMAGE = 0;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.PlayerImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 7;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PIECES = 0;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.HumanPlayerImpl <em>Human Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.HumanPlayerImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getHumanPlayer()
	 * @generated
	 */
	int HUMAN_PLAYER = 8;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PLAYER__PIECES = PLAYER__PIECES;

	/**
	 * The number of structural features of the '<em>Human Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PLAYER_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Human Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PLAYER_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.RandomPlayerImpl <em>Random Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.RandomPlayerImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getRandomPlayer()
	 * @generated
	 */
	int RANDOM_PLAYER = 9;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_PLAYER__PIECES = PLAYER__PIECES;

	/**
	 * The number of structural features of the '<em>Random Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_PLAYER_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Random Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_PLAYER_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.impl.AIPlayerImpl <em>AI Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.impl.AIPlayerImpl
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getAIPlayer()
	 * @generated
	 */
	int AI_PLAYER = 10;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PLAYER__PIECES = PLAYER__PIECES;

	/**
	 * The number of structural features of the '<em>AI Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PLAYER_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AI Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PLAYER_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.esolution.games.connect4.model.game.Side <em>Side</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.esolution.games.connect4.model.game.Side
	 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getSide()
	 * @generated
	 */
	int SIDE = 11;

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see com.esolution.games.connect4.model.game.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference '{@link com.esolution.games.connect4.model.game.Game#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see com.esolution.games.connect4.model.game.Game#getBoard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link com.esolution.games.connect4.model.game.Game#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see com.esolution.games.connect4.model.game.Game#getTeams()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Teams();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see com.esolution.games.connect4.model.game.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link com.esolution.games.connect4.model.game.Team#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see com.esolution.games.connect4.model.game.Team#getSide()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Side();

	/**
	 * Returns the meta object for the containment reference '{@link com.esolution.games.connect4.model.game.Team#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Player</em>'.
	 * @see com.esolution.games.connect4.model.game.Team#getPlayer()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Player();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see com.esolution.games.connect4.model.game.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link com.esolution.games.connect4.model.game.Board#getSquares <em>Squares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Squares</em>'.
	 * @see com.esolution.games.connect4.model.game.Board#getSquares()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Squares();

	/**
	 * Returns the meta object for the attribute '{@link com.esolution.games.connect4.model.game.Board#getNbRow <em>Nb Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Row</em>'.
	 * @see com.esolution.games.connect4.model.game.Board#getNbRow()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_NbRow();

	/**
	 * Returns the meta object for the attribute '{@link com.esolution.games.connect4.model.game.Board#getNbColumn <em>Nb Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Column</em>'.
	 * @see com.esolution.games.connect4.model.game.Board#getNbColumn()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_NbColumn();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece</em>'.
	 * @see com.esolution.games.connect4.model.game.Piece
	 * @generated
	 */
	EClass getPiece();

	/**
	 * Returns the meta object for the reference '{@link com.esolution.games.connect4.model.game.Piece#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Square</em>'.
	 * @see com.esolution.games.connect4.model.game.Piece#getSquare()
	 * @see #getPiece()
	 * @generated
	 */
	EReference getPiece_Square();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.RedPiece <em>Red Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Red Piece</em>'.
	 * @see com.esolution.games.connect4.model.game.RedPiece
	 * @generated
	 */
	EClass getRedPiece();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.YellowPiece <em>Yellow Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yellow Piece</em>'.
	 * @see com.esolution.games.connect4.model.game.YellowPiece
	 * @generated
	 */
	EClass getYellowPiece();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see com.esolution.games.connect4.model.game.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the attribute '{@link com.esolution.games.connect4.model.game.Square#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see com.esolution.games.connect4.model.game.Square#getRow()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Row();

	/**
	 * Returns the meta object for the attribute '{@link com.esolution.games.connect4.model.game.Square#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see com.esolution.games.connect4.model.game.Square#getColumn()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Column();

	/**
	 * Returns the meta object for the '{@link com.esolution.games.connect4.model.game.Square#getImage() <em>Get Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image</em>' operation.
	 * @see com.esolution.games.connect4.model.game.Square#getImage()
	 * @generated
	 */
	EOperation getSquare__GetImage();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see com.esolution.games.connect4.model.game.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.esolution.games.connect4.model.game.Player#getPieces <em>Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pieces</em>'.
	 * @see com.esolution.games.connect4.model.game.Player#getPieces()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Pieces();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.HumanPlayer <em>Human Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Player</em>'.
	 * @see com.esolution.games.connect4.model.game.HumanPlayer
	 * @generated
	 */
	EClass getHumanPlayer();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.RandomPlayer <em>Random Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Player</em>'.
	 * @see com.esolution.games.connect4.model.game.RandomPlayer
	 * @generated
	 */
	EClass getRandomPlayer();

	/**
	 * Returns the meta object for class '{@link com.esolution.games.connect4.model.game.AIPlayer <em>AI Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Player</em>'.
	 * @see com.esolution.games.connect4.model.game.AIPlayer
	 * @generated
	 */
	EClass getAIPlayer();

	/**
	 * Returns the meta object for enum '{@link com.esolution.games.connect4.model.game.Side <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Side</em>'.
	 * @see com.esolution.games.connect4.model.game.Side
	 * @generated
	 */
	EEnum getSide();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameFactory getGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.GameImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__BOARD = eINSTANCE.getGame_Board();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TEAMS = eINSTANCE.getGame_Teams();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.TeamImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SIDE = eINSTANCE.getTeam_Side();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYER = eINSTANCE.getTeam_Player();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.BoardImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Squares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SQUARES = eINSTANCE.getBoard_Squares();

		/**
		 * The meta object literal for the '<em><b>Nb Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NB_ROW = eINSTANCE.getBoard_NbRow();

		/**
		 * The meta object literal for the '<em><b>Nb Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NB_COLUMN = eINSTANCE.getBoard_NbColumn();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.PieceImpl <em>Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.PieceImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getPiece()
		 * @generated
		 */
		EClass PIECE = eINSTANCE.getPiece();

		/**
		 * The meta object literal for the '<em><b>Square</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE__SQUARE = eINSTANCE.getPiece_Square();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.RedPieceImpl <em>Red Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.RedPieceImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getRedPiece()
		 * @generated
		 */
		EClass RED_PIECE = eINSTANCE.getRedPiece();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.YellowPieceImpl <em>Yellow Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.YellowPieceImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getYellowPiece()
		 * @generated
		 */
		EClass YELLOW_PIECE = eINSTANCE.getYellowPiece();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.SquareImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__ROW = eINSTANCE.getSquare_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__COLUMN = eINSTANCE.getSquare_Column();

		/**
		 * The meta object literal for the '<em><b>Get Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SQUARE___GET_IMAGE = eINSTANCE.getSquare__GetImage();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.PlayerImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Pieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PIECES = eINSTANCE.getPlayer_Pieces();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.HumanPlayerImpl <em>Human Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.HumanPlayerImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getHumanPlayer()
		 * @generated
		 */
		EClass HUMAN_PLAYER = eINSTANCE.getHumanPlayer();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.RandomPlayerImpl <em>Random Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.RandomPlayerImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getRandomPlayer()
		 * @generated
		 */
		EClass RANDOM_PLAYER = eINSTANCE.getRandomPlayer();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.impl.AIPlayerImpl <em>AI Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.impl.AIPlayerImpl
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getAIPlayer()
		 * @generated
		 */
		EClass AI_PLAYER = eINSTANCE.getAIPlayer();

		/**
		 * The meta object literal for the '{@link com.esolution.games.connect4.model.game.Side <em>Side</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.esolution.games.connect4.model.game.Side
		 * @see com.esolution.games.connect4.model.game.impl.GamePackageImpl#getSide()
		 * @generated
		 */
		EEnum SIDE = eINSTANCE.getSide();

	}

} //GamePackage
