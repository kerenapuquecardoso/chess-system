package boardgame;

public class Position {
    private int row;
    private int colum;

    public Position(int row, int colum) {
        this.colum = colum;
        this.row = row;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }


    @Override
    public String toString(){
        return row + ", " + colum;
    }


}
