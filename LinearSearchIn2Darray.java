import java.util.Arrays;
public class LinearSearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,34,6},
                {13,6,97,56},
                {4,9,34,87,56,45},
                {34,65}
        };

        int target = 87;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println("Integer can hold this much of maximum value: " + Integer.MAX_VALUE);
        System.out.println("Integer can hold this much of minimum value: " + Integer.MIN_VALUE);

        int ans2 = searchmax(arr);
        System.out.println(ans2);

        int ans3 = searchmaxenhanced(arr);
        System.out.println(ans3);
    }

    static int searchmax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row =0; row<arr.length;row++){
            for(int col =0; col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max= arr[row][col];
                }
            }
        }return max;
    }

    //Enhanced for loop search max:
    static int searchmaxenhanced(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] arr1 : arr){
            for(int element : arr1){
                if(element>max){
                    max=element;
                }
            }
        }return max;
    }


    static int[] search(int[][] arr , int target){
        for(int row =0; row<arr.length;row++){
            for(int col =0; col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }return new int[]{-1,-1};
    }
}
