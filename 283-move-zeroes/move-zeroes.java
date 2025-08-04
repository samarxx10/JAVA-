// samarth 
public class Solution{
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums){
        int index = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }
    }



            
                
            
        
      
    
}