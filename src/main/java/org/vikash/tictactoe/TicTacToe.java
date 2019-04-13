package org.vikash.tictactoe;

public class TicTacToe {
    public final static int X = 1;
    public final static  int O = -1;
    private int board[][] = new int [3][3];
    public int player = X;
    private final int EMPTY = 0;
    public boolean isEmpty = false;

    public void putSign(int x, int y){
        if(x<0 || y<0 || x>2 || y>2){
            System.out.println("invalid board position");
            return;
        }
        if(board[x][y]!=EMPTY){
            System.out.println("board position occupied");
            return;
        }
        board[x][y] = player;
        player = -player;
    }

    /**
     * Check if the current player wins or not
     * @param player
     * @return
     */
    public boolean isWin(int player){
        return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
                (board[1][0] + board[1][1] + board[1][2] == player*3) ||
                (board[2][0] + board[2][1] + board[2][2] == player*3) ||
                (board[0][0] + board[1][0] + board[2][0] == player*3) ||
                (board[0][1] + board[1][1] + board[2][1] == player*3) ||
                (board[0][2] + board[1][2] + board[2][2] == player*3) ||
                (board[0][0] + board[1][1] + board[2][2] == player*3) ||
                (board[2][0] + board[1][1] + board[0][2] == player*3));
    }


    public void displayWinner(){
        if(isWin(X)){
            System.out.println("\n X wins  !!!! ");
            isEmpty = false;
        }else if(isWin(O)){
            System.out.println("\n O wins !!!!");
            isEmpty = false;
        }else {
            if(!isEmpty){
                System.out.println(" its a  tie");
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                switch (board[i][j]){
                    case X:
                        sb.append(" X ");
                        break;
                    case O:
                        sb.append(" O ");
                        break;
                    case EMPTY:
                        sb.append(" ");
                        isEmpty = true;
                        break;
                }
                if(j<2){
                    sb.append(" | ");
                }
                if(i<2){
                    sb.append("\n-------\n");
                }
            }
        }
        return sb.toString();
    }
}
