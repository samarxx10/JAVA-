public class rotatearray{
    public static void main(String[] args) {
        int[] nums = new int[]{2,4,6,8,10};
        leftrotatebyone(nums);

        for(int num : nums){
            System.out.print(num + " " );
        }
    }

    public static void leftrotatebyone(int[] nums){
        if(nums.length == 0 )return;

        int first = nums[0];

        for(int i = 0 ; i < nums.length - 1 ; i++){
            nums[i] = nums[i+1];
        }

        nums[nums.length - 1] = first;
    }
}