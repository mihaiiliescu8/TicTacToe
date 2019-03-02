package Xsi0;

import java.util.Scanner;

public  class TicTacToeConsole extends  Arbitru {


    public int[] getCoord() {

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        return new int[]{row, col};


    }

    private Scanner scanner;

    public TicTacToeConsole(Player player1, Player player2) {
        super(player1, player2);
        scanner = new Scanner(System.in);
    }
}




