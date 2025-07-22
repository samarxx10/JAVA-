public class largestnumber {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,8,10};
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if( array[i] >  largest ){
              largest = array[i];
            }

           
        }

        System.out.println("Largest number is : " + largest);
    }
    
}
