import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTest {
    @Test
    void shouldReturnCorrectAnswerIfInputIsValid() {
        MainClass mainClass = new MainClass();
        ArrayList<String> input=new ArrayList<>();
        input.add("3 3");
        input.add("1 1 E");
        input.add("LMMRM");
        input.add("0 1 W");
        input.add("LMM");

        String output=mainClass.getPositionOfRovers(input);

        assertEquals("2 3 E\nOut of Boundary\n",output);

    }
}
