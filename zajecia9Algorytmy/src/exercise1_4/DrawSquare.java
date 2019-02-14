package exercise1_4;

public class DrawSquare {
    public static void main(String[] args) {
        int[][] squareTab = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
        };
        printSquare(squareTab);
    }

    private static void printSquare(int[][] squareTab) {
        for (int row = 0; row < squareTab.length; row++) {
            for (int column = 0; column < squareTab.length; column++) {
                if (squareTab[row][column] == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
