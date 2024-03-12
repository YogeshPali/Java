import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
        {1,2,3
         4,5,6
         7,8,9}
         */
        Scanner in = new Scanner(System.in);

//        int[][] arr = new int[3][];
//
        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int[] b: arr2d){
            System.out.println(Arrays.toString(b));
        }
//        System.out.println(Arrays.deepToString(arr2d));
//
//        int[][] arr2di ={
//                {1,2,3},//0th index
//                {4,5},//1st index
//                {6,7,8,9}//2nd index
//        };
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for(int row = 0 ; row< arr.length; row++){
            //for each column in every row
            for(int col =0; col < arr[row].length; col++){
                arr[row][col]= in.nextInt();
            }

        }

        //Output

//        for(int row = 0 ; row< arr.length; row++){
//            //for each column in every row
//            for(int col =0; col < arr[row].length; col++){
//                System.out.print( arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for(int row =0; row< arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
          for(int[] a : arr){
              System.out.println(Arrays.toString(a));
          }

    }
}
