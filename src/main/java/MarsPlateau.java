public class MarsPlateau {

    private final int yMax;
    private final int xMax;
    private int[][] map;

    public MarsPlateau(int xMax, int yMax) {
        this.xMax=xMax;
        this.yMax=yMax;
        map =new int[xMax][yMax];
    }

    public int getYMax() {
        return yMax;
    }

    public int getXMax() {
        return xMax;
    }

    public void setMap(int x,int y,int value)
    {
        map[x][y]+=value;
    }

    public int getMap(int x,int y)
    {
        return map[x][y];
    }
}
