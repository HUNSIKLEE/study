package array;

public class ArrayDi2 {

    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int row = 0; row < 2; row++){
            for(int colum = 0; colum < 3; colum++){
                System.out.println(arr[row][colum] + " ");
            }
            System.out.println();
        }
    }
}
