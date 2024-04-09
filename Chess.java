enum PieceType {
    KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN
}

class Piece {
    private PieceType type;
    private boolean isWhite; 

    public Piece(PieceType type, boolean isWhite) {
        this.type = type;
        this.isWhite = isWhite;
    }

    public PieceType getType() {
        return type;
    }

    public boolean isWhite() {
        return isWhite;
    }
}

class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        board[0][0] = new Piece(PieceType.ROOK, true);
        board[0][1] = new Piece(PieceType.KNIGHT, true);
        board[0][2] = new Piece(PieceType.BISHOP, true);
        board[0][3] = new Piece(PieceType.QUEEN, true);
        board[0][4] = new Piece(PieceType.KING, true);
        board[0][5] = new Piece(PieceType.BISHOP, true);
        board[0][6] = new Piece(PieceType.KNIGHT, true);
        board[0][7] = new Piece(PieceType.ROOK, true);
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Piece(PieceType.PAWN, true);
        }

        board[7][0] = new Piece(PieceType.ROOK, false);
        board[7][1] = new Piece(PieceType.KNIGHT, false);
        board[7][2] = new Piece(PieceType.BISHOP, false);
        board[7][3] = new Piece(PieceType.QUEEN, false);
        board[7][4] = new Piece(PieceType.KING, false);
        board[7][5] = new Piece(PieceType.BISHOP, false);
        board[7][6] = new Piece(PieceType.KNIGHT, false);
        board[7][7] = new Piece(PieceType.ROOK, false);
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Piece(PieceType.PAWN, false);
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print("- ");
                } else {
                    if (board[i][j].isWhite()) {
                        System.out.print("W");
                    } else {
                        System.out.print("B");
                    }
                    switch (board[i][j].getType()) {
                        case KING:
                            System.out.print("K ");
                            break;
                        case QUEEN:
                            System.out.print("Q ");
                            break;
                        case ROOK:
                            System.out.print("R ");
                            break;
                        case BISHOP:
                            System.out.print("B ");
                            break;
                        case KNIGHT:
                            System.out.print("N ");
                            break;
                        case PAWN:
                            System.out.print("P ");
                            break;
                    }
                }
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
    }
}
