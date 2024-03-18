public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,35,435,54,34,53,45,32,54,6};
        int target=34;
        int ans=LinearSearch(arr,target);
        System.out.println("Index of the element: " + ans);
        int ans2=LinearSearch2(arr,target);
        System.out.println("Element itslef: " + ans2);
        boolean ans3=LinearSearch3(arr,target);
        System.out.println("True or False: " + ans3);

    }
    //search the target and return true or false
    static boolean LinearSearch3(int[] nums, int target){
        if(nums.length==0){
            return false;
        }
        for (int element : nums) {
            if (element == target) {
                return true;
            }

        }return false;
    }

    //search the target and return the element
    static int LinearSearch2(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }
        for (int element : nums) {
            if (element == target) {
                return element;
            }

        }return Integer.MAX_VALUE;
    }

            //this line will return -1 if none of the return statement above have executed
            //hence the no target has found

//        for (int index=0; index<nums.length  ;index++){
//            int element = nums[index];
//            if(element==target){
//                return element;
//            }
//            //this line will return -1 if none of the return statement above have executed
//            //hence the no target has found
//        }return -1;


        //search in the array: return the index if item found
    //otherwise return -1
    static int LinearSearch(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }
        for (int index=0; index<nums.length  ;index++){
            int element = nums[index];
            if(element==target){
                return index;
            }
            //this line will return -1 if none of the return statement above have executed
            //hence the no target has found
        }return -1;
    }
}
