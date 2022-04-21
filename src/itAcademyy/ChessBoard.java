package itAcademyy;

public class ChessBoard {

    private ChessPiece[][] chessBoards;

    public ChessBoard(ChessPiece[][] chessBoards) {
        this.chessBoards = chessBoards;
    }

    public void print(){
        for (int i = 0; i < chessBoards.length; i++) {
            for (int j = 0; j < chessBoards.length; j++)
                System.out.print(chessBoards[i][j].getRepresentation());

            System.out.println();
        }

    }
}
