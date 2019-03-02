package Xsi0;

public class Runner {

    public static void main(String[] args) {


        Board table = new Board();

        System.out.println(table);


        Player Alex = new Player("Alex " + "cu simbolul ", Board.Mark.MARK_X);
        Player Mihai = new Player("Mihai " + "cu simbolul ", Board.Mark.MARK_0);


        TicTacToeConsole obj = new TicTacToeConsole(Alex, Mihai);
        obj.start();





    }

}
