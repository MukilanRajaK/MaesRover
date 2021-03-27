import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void checkInputCoOrdinatesEqualToCoordinatesFromRover() {
        Rover rover = new Rover(1, 3, 'N');

        String coOrdinates = rover.getCoOrdinates();

        assertEquals("1 3 N", coOrdinates);
    }

    @Test
    void checkingNavigateMethod() {
        Rover rover = new Rover(0, 0, 'N');
        MarsPlateau marsPlateau = new MarsPlateau(4, 5);
        String movement = "MRML";

        String finalCoOrdinateOfRover = rover.navigate(movement, marsPlateau);

        assertEquals(finalCoOrdinateOfRover, "1 1 N");

    }
}
