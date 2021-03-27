import java.util.HashMap;

public class Rover {
    private int xCoOrdinate;
    private int yCoOrdinate;
    private char direction;
    private final HashMap<Character, Character> directionChangerLeft = new HashMap<>();
    private final HashMap<Character, Character> directionChangerRight = new HashMap<>();

    Rover(int xCoOrdinate, int yCoOrdinate, char direction) {
        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
        this.direction = direction;
        directionChangerLeft.put('N', 'W');
        directionChangerLeft.put('W', 'S');
        directionChangerLeft.put('S', 'E');
        directionChangerLeft.put('E', 'N');
        directionChangerRight.put('N', 'E');
        directionChangerRight.put('E', 'S');
        directionChangerRight.put('S', 'W');
        directionChangerRight.put('W', 'N');

    }

    public String getCoOrdinates() {
        return xCoOrdinate + " " + yCoOrdinate + " " + direction;

    }


    public String navigate(String movements, MarsPlateau marsPlateau) {
        char[] movement = movements.toCharArray();
        for (char c : movement) {
            if (checkCoOrdinatesBoundary(marsPlateau)) {
                if (c == 'L') {
                    direction = directionChangerLeft.get(direction);
                } else if (c == 'R') {
                    direction = directionChangerRight.get(direction);
                } else if (c == 'M') {
                    if (direction == 'N') {
                        yCoOrdinate += 1;
                    }
                    if (direction == 'S') {
                        yCoOrdinate -= 1;
                    }
                    if (direction == 'E') {
                        xCoOrdinate += 1;
                    }
                    if (direction == 'W') {
                        xCoOrdinate -= 1;
                    }
                }
            } else {
                return "Out of Boundary";
            }
        }
        if (checkCoOrdinatesBoundary(marsPlateau)) {
            return getCoOrdinates();
        }
        return "Out of Boundary";
    }

    private boolean checkCoOrdinatesBoundary(MarsPlateau marsPlateau) {
        int maxXCoOrdinate = marsPlateau.getXMax();
        int maxYCoOrdinate = marsPlateau.getYMax();
        return ((xCoOrdinate >= 0 && xCoOrdinate <= maxXCoOrdinate) && (yCoOrdinate >= 0 && yCoOrdinate <= maxYCoOrdinate));
    }
}
