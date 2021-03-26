import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void checkInputCoOrdinatesEqualToCoordinatesFromRover() {
        Rover rover = new Rover(1, 3, 'N');

        String coOrdinates=rover.getCoOrdinates();

        assertEquals("1 3 N",coOrdinates);
    }

}
