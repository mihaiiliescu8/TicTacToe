package Xsi0;

public class Board {


    private Mark table[][];


    public Board() {

        table = new Mark[3][3];
        table[0][0] = Mark.MARK_EMPTY;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; ++j) {
                table[i][j] = Mark.MARK_EMPTY;

            }
        }


    }


    public enum Mark {

        MARK_X {
            @Override
            public String toString() {
                return "X";
            }
        },


        MARK_0 {
            @Override
            public String toString() {
                return "0";
            }
        },
        MARK_EMPTY {
            @Override
            public String toString() {
                return "-";
            }
        }
    }


    public String toString() {

        //   String aux = "";
        StringBuilder aux = new StringBuilder("");


        for (int i = 0; i < 3; ++i) {

            for (int j = 0; j < 3; ++j)


                aux.append(" " + table[i][j].toString());
            aux = aux.append("\n");
        }


        return aux.toString();
    }

    public void move(int coord1, int coord2, Mark mark) {
        table[coord1][coord2] = mark;
    }


    public Mark getWinner(int row, int col) {


        if (table[row][0] != Mark.MARK_EMPTY &&
                table[row][0] == table[row][1] &&
                table[row][0] == table[row][2])
        {
            return table[row][col];
        }


        if (table[0][col] != Mark.MARK_EMPTY &&
                table[0][col] == table[1][col] &&
                table[0][col] == table[2][col])

        {
            return table[row][col];
        }

        if( table[0][0] != Mark.MARK_EMPTY &&
                table[0][0] == table[1][1] &&
                table[1][1] == table[2][2])

        {
            return  table[row][col];
        }

        if(table[0][2] != Mark.MARK_EMPTY &&
                table[0][2] == table[1][1] &&
                table[1][1] == table[2][0])
        {
            return table[row][col];
        }

        return Mark.MARK_EMPTY;





    }






    public boolean remiza() {
        int celuleocupate = 0;

        for(int i = 0; i< table.length; i++) {
            for (int j = 0; j< table[i].length; j++) {
                if(table[i][j] == Mark.MARK_EMPTY) {
                    continue;
                } else{
                    celuleocupate ++;
                }
            }
        }
        if (celuleocupate >= 9){
            return true;
        }
        return false;
    }



    public boolean isGameOver (Mark simbol) {

        if (simbol == Mark.MARK_X  || simbol == Mark.MARK_0) {
            return true;
        }else {

            if(simbol == Mark.MARK_EMPTY && remiza()) {
                return  true;
            }
        }
        return false;

    }



}



