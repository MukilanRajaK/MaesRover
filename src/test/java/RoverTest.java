import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void shouldReturnFalseIfRoverPositionIsGreaterThanMarsPlateau() {
        Rover rover = new Rover(6, 1, 'N');
        MarsPlateau marsPlateau = new MarsPlateau(3, 3);

        boolean result = rover.checkCoOrdinatesBoundary(marsPlateau);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueIfRoverPositionIsGreaterThanMarsPlateau() {
        Rover rover = new Rover(2, 2, 'N');
        MarsPlateau marsPlateau = new MarsPlateau(3, 3);

        boolean result = rover.checkCoOrdinatesBoundary(marsPlateau);

        assertTrue(result);
    }

    @Test
    void shouldReturnPositionOfRoverInStringFormat() {
        Rover rover = new Rover(2, 2, 'N');

        String coOrdinates = rover.getCoOrdinates();

        assertEquals("2 2 N",coOrdinates);
    }
}
