import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,63,5};
        change(arr);// pass by the copy of th refrence
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]= 99;// not creating the new array we are modifing the array
                    // if you make the change to the object via this reference variable, same object can be changed
    }
}
