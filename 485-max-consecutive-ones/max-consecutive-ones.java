// samarth
public class Solution{
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};

        int maxcount = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum 1's " + maxcount);
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int count = 0;

       for(int num : nums){
            if(num == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }

        return max;
    }
}