package Xsi0;


import javax.sound.midi.Soundbank;
import java.util.BitSet;

public abstract class Arbitru implements Readable {

    Board t;
    Player player1;
    Player player2;
    boolean xTurn;



    Arbitru(Player a, Player b) {

        t = new Board();

        this.player1 = a;
        this.player2 = b;
        this.xTurn = true;

    }

    @Override

    public String toString() {

        // return player1+ "" + player2;
        return player1.toString() + player2.toString();
    }




    Board board  = new Board();







    public void start() {

        while (true) {

            int coord[] = getCoord();
            board.move(coord[0], coord[1], xTurn ? Board.Mark.MARK_X : Board.Mark.MARK_0);
            if (xTurn == true) {
                xTurn = false;
            } else {
                xTurn = true;

            }
            System.out.println(board);

            if (board.isGameOver(board.getWinner(coord[0], coord[1]))) {
                System.out.println("Game Over!");
                if (board.remiza()) {
                    System.out.println("Remiza");
                } else {
                    if (board.getWinner(coord[0], coord[1]) == Board.Mark.MARK_X) {
                        System.out.println("A cistigat " + player1);
                    } else {
                        System.out.println("A cistigat " + player2);
                    }
                }
                break;
            }
        }
    }

}






