public class consecutive {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1};
        int maxcount = findconsecutiveones(array);
        System.out.println("Maximum 1's : " + maxcount);
    }

    public static int findconsecutiveones(int[] array){
        int max = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
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
