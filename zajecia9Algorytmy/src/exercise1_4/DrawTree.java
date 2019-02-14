package exercise1_4;

public class DrawTree {
    public static void main(String[] args) {
        int[][] treeArray = {
                {1, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1},
        };
        printTree(treeArray);
        System.out.println("koniec sposobu pierwszego \n");



        //drugi sposób
        int height = 6;
        int width = 6;

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (row >= column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printTree(int[][] treeArray) {
        for(int row = 0; row <treeArray.length; row++){
            for(int column = 0; column < treeArray.length; column++){
                if(treeArray[row][column] == 1){
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
