public class MaxValueinArray {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,2,4));
    }
        //Work on edge conditions of array, like array is null
    static int max(int[] arr) {
        //imagine that arr is not empty
        if(arr==null){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }

        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        }
        return maxValue;
    }

    static int maxRange(int[] arr, int start , int end) {
        //imagine that arr is not empty
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}


