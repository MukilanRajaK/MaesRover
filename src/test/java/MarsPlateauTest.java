import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsPlateauTest {
    @Test
    void checkingWhetherMarsPlateauMapIsUpdatedAndRetrievedCorrectly() {
        MarsPlateau marsPlateau = new MarsPlateau(5, 6);

        marsPlateau.setMap(2, 3, 1);
        int mapCoOrdinateValue = marsPlateau.getMap(2, 3);

        assertEquals(1, mapCoOrdinateValue);

    }
}
