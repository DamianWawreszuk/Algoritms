package exercise1_4;

public class DrawDiagonal {
    public static void main(String[] args) {
        int height = 6;
        int width = 6;


        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (row == column) {
                    System.out.print("*");
                }
                else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
