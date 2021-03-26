import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String Args[])
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input=new ArrayList<>();
        String tempInput;
        tempInput=scanner.nextLine();
        while(!(tempInput.isBlank()))
        {
            input.add(tempInput);
            tempInput=scanner.nextLine();
        }
        System.out.println(getPositionOfRovers(input));
    }

    private static String getPositionOfRovers(ArrayList<String> input) {

    }
}
