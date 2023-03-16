
/**
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public abstract class ChessPiece {

    private Color color;
    private int moveCount;

    public ChessPosition getChessPosition() {
        return null;
    }

    protected boolean isThereOpponentPiece(Position position) {
        return false;
    }

    protected void increaseMoveCount() {
    }
    protected void decreaseMoveCount() {
    }
}
