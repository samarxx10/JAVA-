//samarth
public class Solution{
    public static void main(String[] args){
        int[] nums = {1,1,2};
        int k = removeDuplicates(nums);

        System.out.println("unique count" + k);
        System.out.println("modified array : " );
        for(int i = 0 ; i < k ; i++){
            System.out.println(nums[i] + "  ");
        }

    }

    public static int removeDuplicates(int[] nums){
        if(nums.length == 0)return 0;

        int index = 1;

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;            
            }
        }

        return index;
    }
}