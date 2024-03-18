public class MinNoLinearSearch {
    public static void main(String[] args) {
        int[] arr ={2,32,53,21,6,-3,5,-4,5,34,23};
        int ans = search(arr);
        System.out.println(ans);
    }
    static int search(int[] nums){
        if(nums.length==0){
            return -1;
        }
        int MinNo= nums[0];
        for(int i=0 ; i<nums.length; i++){
            if(nums[i]<MinNo){
                MinNo=nums[i];
            }
        }return MinNo;
    }

}
