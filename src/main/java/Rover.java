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
        String coOrdinates=String.valueOf(xCoOrdinate)+" "+String.valueOf(yCoOrdinate)+" "+direction;
        return coOrdinates;
    }




}
