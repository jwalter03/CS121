package weekFour;

public class nestedForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is i:" + i + "\n");
            for (int j = 0; j < 3; j++) {
                System.out.println("      This is j:" + j);
            }
        }
        //2D array
        int[][] matrix = {
                {11,22,33},
                {45,54,65},
                {67,76,97}

        };
        for(int i = 0; i<matrix.length; i++){
            System.out.println("This is i:"+i+"\n");
            for(int j = 0;j <matrix[i].length; j++){
                System.out.println("This is j = " +j);
                System.out.println(matrix[i][j]+"");
            }
        }
        //generate pattern
        int n = 7;
        for(int i = 0; i < n; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }}