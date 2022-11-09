import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rotation = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        ArrayList<String> linesForMatrix = new ArrayList<>();
        int maxWordLength = input.length();

        while (!input.equals("")){
            linesForMatrix.add(input);
            input = scanner.nextLine();
            if (input.length() > maxWordLength){
                maxWordLength = input.length();
            }
        }
        int rows = linesForMatrix.size();
        int cols = maxWordLength;

        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col < linesForMatrix.get(row).length()){
                    matrix[row][col] = linesForMatrix.get(row).charAt(col);
                }else {
                    matrix[row][col] = ' ';
                }
            }
        }
        if (rotation == 1){
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0 ; row--) {
                    if (row == 0){
                        System.out.print(matrix[row][col]);
                        break;
                    }
                    System.out.print(matrix[row][col] + "_");
                }
                System.out.println();
            }
        }else if (rotation == 2){
            for (int row = rows - 1; row >= 0 ; row--) {
                for (int col = cols - 1; col >= 0 ; col--) {
                    if (col == 0){
                        System.out.print(matrix[row][col]);
                        break;
                    }
                    System.out.print(matrix[row][col] + "_");
                }
                System.out.println();
            }
        }else if (rotation == 3){
            for (int col = cols - 1; col >= 0 ; col--) {
                    for (int row = 0; row < rows ; row++) {
                        if (row == rows - 1){
                            System.out.print(matrix[row][col]);
                            break;
                        }
                        System.out.print(matrix[row][col] + "_");
                    }

                System.out.println();
            }
        }else if (rotation == 4){
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (col == cols - 1){
                        System.out.println(matrix[row][col]);
                    }else {
                        System.out.print(matrix[row][col] + "_");
                    }
                }
                System.out.println();
            }
        }
    }
}
