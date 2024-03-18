import java.util.Arrays;
public class SwapArrayelements {
    public static void main(String[] args) {

        int[] arr = {1,2,34,4,43,23,2};
        System.out.println(Arrays.toString(arr));
        System.out.println("Swaped Array for index 1 and 3");
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] array, int index1, int index3) {
        int temp = array[index1];
        array[index1] = array[index3];
        array[index3] = temp;
    }
}
