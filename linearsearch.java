public class linearsearch{
    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,8,10};
        int search = 6;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == search){
                System.out.println("The element found at index : " + i);
                found = true;
                break;
                
            }
            
        }

        if(!found){
            System.out.println("The element is not found  : ");
        }
      
    }
}