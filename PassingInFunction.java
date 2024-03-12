import java.util.Scanner;
import java.util.Arrays;
public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {12,32,123,43};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;
        //System.out.println(Arrays.toString(arr));
    }
}
