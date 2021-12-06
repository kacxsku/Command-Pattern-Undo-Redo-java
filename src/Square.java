public class Square {

    private int XCoordinate;
    private int YCoordinate;
    private int length;


    public Square(int length) {
        this.XCoordinate = 0;
        this.YCoordinate = 0;
        this.length = length;
    }

    public Square(Square square) {
        this.YCoordinate = square.YCoordinate;
        this.XCoordinate = square.XCoordinate;
        this.length = square.length;
    }

    public int getXCoordinate() {
        return XCoordinate;
    }

    public void setXCoordinate(int XCoordinate) {
        this.XCoordinate = XCoordinate;
    }

    public int getYCoordinate() {
        return YCoordinate;
    }

    public void setYCoordinate(int YCoordinate) {
        this.YCoordinate = YCoordinate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return XCoordinate
                + " "
                + YCoordinate
                + " "
                + length;
    }

}
