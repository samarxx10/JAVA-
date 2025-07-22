public class sorted {
    public static void main(String[] args) {
        int[] array = new int[]{10,20,30,40,50};
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i+1]){
                isSorted = false;
                break;
              }

           
        }

        if(isSorted){
            System.out.println(" The array is sorted in non decreasing order ");
        }

        else{
            System.out.println("The array is not sorted ");
        }

        
       

     }
}
