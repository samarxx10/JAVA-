public class rotate3times {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12};
        int k = 3;
        rotate(nums,k);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void rotate(int[] nums , int k){
        int n = nums.length;
        k = k % n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp = start;
           nums[start]  = nums[end];
            nums[end]  = temp;

            start++;
            end--;

        }
    }
    
}
