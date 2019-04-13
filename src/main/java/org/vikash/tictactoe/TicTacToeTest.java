package org.vikash.tictactoe;

import java.util.Scanner;
import java.util.*;
public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        int x= 0;
        int y = 0;
        do{
            System.out.println(t.player==t.X?"Player X turn": "Player O turn");
            System.out.println("Enter x and y places");
            x = sc.nextInt();
            y = sc.nextInt();
            t.putSign(x,y);
            System.out.println(t.toString());
            System.out.println("__________________");
            t.displayWinner();
        }while(t.isEmpty);
    }

}
