public class Secondlargest{
    public static void main(String[] args) {
        int[] array = new int[]{10,20,30,40,45,50};
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
    
    for (int i = 0; i < array.length; i++) {
        if(array[i] > Largest){
          SecondLargest = Largest;
          Largest = array[i];  
        }

        else if( array[i] > SecondLargest && array[i]!= Largest){
            SecondLargest = array[i];
        }
        
    }

    if(SecondLargest == Integer.MIN_VALUE){
        System.out.println("There is no secondlargest number : ");
    }

    else{
        System.out.println("The secondlargest number is : " + SecondLargest);
    }
     
  }


}