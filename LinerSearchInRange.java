public class LinerSearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,23,4,86,45,3,5};
        int target = 3;
        boolean ans = search(arr,target,2,6);
        System.out.println(ans);
        int ans2 = search2(arr,target,2,6);
        System.out.println(ans2);
    }
    static boolean search(int[] nums, int target,int start,int end){
        if(nums.length==0){
            return false;
        }
        for(int i=start; i<= end; i++){

            if(nums[i] ==target){
                return true;
            }
        }
        return false;
    }
    static int search2(int[] nums, int target,int start,int end){
        if(nums.length==0){
            return -1;
        }
        for(int i=start; i<= end; i++){

            if(nums[i] ==target){
                return i;
            }
        }
        return -1;
    }
}
