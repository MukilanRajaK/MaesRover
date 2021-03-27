import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        String tempInput;
        tempInput = scanner.nextLine();
        while (!(tempInput.isBlank())) {
            input.add(tempInput);
            tempInput = scanner.nextLine();
        }
        System.out.println(getPositionOfRovers(input));
    }

    public static String getPositionOfRovers(ArrayList<String> input) {
        String[] maxCoOrdinatesOfMarsPlateau = input.get(0).split(" ");
        int maxXOfPlateau = Integer.parseInt(maxCoOrdinatesOfMarsPlateau[0]);
        int maxYOfPlateau = Integer.parseInt(maxCoOrdinatesOfMarsPlateau[1]);
        MarsPlateau marsPlateau = new MarsPlateau(maxXOfPlateau, maxYOfPlateau);
        int size = input.size() - 1;
        ArrayList<Rover> rovers = new ArrayList<>();
        StringBuilder positionOfRovers = new StringBuilder();
        for (int counter = 0; counter < size / 2; counter++) {
            String[] coOrdinatesOfRover = input.get((counter * 2) + 1).split(" ");
            int xCoOrdinate = Integer.parseInt(coOrdinatesOfRover[0]);
            int yCoOrdinate = Integer.parseInt(coOrdinatesOfRover[1]);
            char direction = coOrdinatesOfRover[2].charAt(0);
            rovers.add(new Rover(xCoOrdinate, yCoOrdinate, direction));
        }
        for (int counter = 0; counter < size / 2; counter++) {
            positionOfRovers.append((rovers.get(counter).navigate(input.get((counter * 2) + 2), marsPlateau) + "\n"));
        }
        return positionOfRovers.toString();

    }
}
