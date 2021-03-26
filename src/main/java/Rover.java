public class Rover {
    private int xCoOrdinate;
    private int yCoOrdinate;
    private char direction;
    Rover(int xCoOrdinate,int yCoOrdinate,char direction)
    {
        this.xCoOrdinate=xCoOrdinate;
        this.yCoOrdinate=yCoOrdinate;
        this.direction=direction;

    }

    public String getCoOrdinates() {
        return xCoOrdinate +" "+ yCoOrdinate +" "+direction;

    }

    public int getxCoOrdinate() {
        return xCoOrdinate;
    }

    public void setxCoOrdinate(int xCoOrdinate) {
        this.xCoOrdinate = xCoOrdinate;
    }

    public int getyCoOrdinate() {
        return yCoOrdinate;
    }

    public void setyCoOrdinate(int yCoOrdinate) {
        this.yCoOrdinate = yCoOrdinate;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
}
