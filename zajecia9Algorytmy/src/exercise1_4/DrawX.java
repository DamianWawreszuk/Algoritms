package exercise1_4;

public class DrawX {
    public static void main(String[] args) {
        int[][] xTab = {
                {1, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 1},
        };
        printX(xTab);
    }

    private static void printX(int[][] xTabx) {
        for(int row = 0; row < xTabx.length; row++){
            for(int column = 0; column < xTabx.length; column++){
                if(xTabx[row][column] == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
