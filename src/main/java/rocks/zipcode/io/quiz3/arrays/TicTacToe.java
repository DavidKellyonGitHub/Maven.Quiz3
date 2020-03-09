package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[] row1 = new String[3];
    String[] row2 = new String[3];
    String [] row3 = new String[3];
    String[] column1 = new String[3];
    String[] column2 = new String[3];
    String[] column3 = new String[3];

    public TicTacToe(String[][] board) {
        this.row1 = new String[]{board[0][0], board[0][1], board[0][2]};
        this.row2 = new String[]{board[1][0], board[1][1], board[1][2]};
        this.row3 = new String[]{board[2][0], board[2][1], board[2][2]};
        this.column1 = new String[]{board[0][0], board[1][0], board[2][0]};
        this.column2 = new String[]{board[0][1],board[1][1], board[2][1]};
        this.column3 = new String[]{board[0][2], board[1][2], board[2][2]};
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        if (value == 0){
            return row1;
        } else if (value == 1){
            return row2;
        } else if (value ==2){
            return row3;
        }
        return null;
    }

    public String[] getColumn(Integer value) {
        if (value == 0){
            return column1;
        } else if (value == 1) {
            return column2;
        } else if (value ==2){
            return column3;
        }
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        int counter = 0; 
        String prevLetter = "";
        if (rowIndex ==0) {
            for (String letter : row1) {
                if (prevLetter == letter) {
                    counter++;
                }
                prevLetter = letter;

            }
            if (counter == 2)
                return true;
        } else if (rowIndex ==1) {
            for (String letter : row2) {
                if (prevLetter == letter) {
                    counter++;
                }
                prevLetter = letter;

            }
            if (counter == 2)
                return true;
        } else if (rowIndex ==2) {
            for (String letter : row3) {
                if (prevLetter == letter) {
                    counter++;
                }
                prevLetter = letter;

            }
            if (counter == 2)
                return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        int counter = 0;
        String prevLetter = "";
        if (columnIndex ==0) {
            for (String letter : column1) {
                if (prevLetter == letter) {
                    counter++;
                }
                prevLetter = letter;

            }
            if (counter == 2)
                return true;
        } else if (columnIndex ==1) {
            for (String letter : column2) {
                if (prevLetter == letter) {
                    counter++;
                }
                prevLetter = letter;

            }
            if (counter == 2)
                return true;
        } else if (columnIndex ==2) {
            for (String letter : column3) {
                if (prevLetter == letter) {
                    counter++;
                }
                prevLetter = letter;

            }
            if (counter == 2)
                return true;
        }
        return false;
    }

    public String getWinner() {
        if (isRowHomogenous(0)){
            return row1[0];
        } else if (isRowHomogenous(1)){
            return row2[0];
        } else if(isRowHomogenous(2)){
            return row3[0];
        } else if (isColumnHomogeneous(0)){
            return column1[0];
        } else if (isColumnHomogeneous(1)){
            return column2[0];
        } else if(isColumnHomogeneous(2)){
            return column3[0];
        }
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
