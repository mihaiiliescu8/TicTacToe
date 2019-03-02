package Xsi0;

public class Player {

    public  String toString()  {

        return nume + simbol;
    }


    String nume;
    Board.Mark simbol;




    public Player(String nume, Board.Mark simbol) {

        this.simbol = simbol;
        this.nume = nume;


    }

    public Board.Mark getSimbol () {
        return simbol;


    }




    public void setNume(String nume) {
        this.nume = nume;
    }


    public void setSimbol(Board.Mark simbol) {
        this.simbol = simbol;
    }


}
