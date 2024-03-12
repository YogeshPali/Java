import java.util.Arrays;
import java.util.Scanner;

public class Input_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 231;
        arr[2] = 21;
        arr[3] = 212;
        arr[4] = 22;
        System.out.println(Arrays.toString(arr));
        // internally stored in form of [23,231,21,212,22]


//        System.out.println(arr[3]);
//         for (int i =0; i< arr.length; i++){
//             arr[i] = in.nextInt();
//         }
//        System.out.println(Arrays.toString(arr));

//        for (int i =0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//        for (int num :arr){// for every element in the array, print the element
//            System.out.print(num + " "); // here num represents the element of the array
//        }

//        System.out.println(arr[5]);// Arrays Index Out of Bound error

        // Array of objects
        String[] str = new String[4];
        for(int i =0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Yogesh";
        System.out.println(Arrays.toString(str));
    }


}
