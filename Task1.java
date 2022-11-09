import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String[] tokens = command.split(":\\s+");
        int smallestCount = Integer.MAX_VALUE;

        while (!command.equals("End")){
            if (smallestCount > Integer.parseInt(tokens[1])){
                smallestCount = Integer.parseInt(tokens[1]);
            }

            command = scanner.nextLine();
        }
        System.out.println(smallestCount);
    }
}
