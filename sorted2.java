import java.util.*;
public class sorted2 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the number of elements in a array : ");
    int size = sc.nextInt();

    int[] array = new int[size];
    System.out.println("Enter " + size + " elements: ");
    for (int i = 0; i < size; i++) {
        array[i] = sc.nextInt();
        
    }


    boolean result = isSorted(array);
    System.out.println(result);
    sc.close();
    
}

public static boolean isSorted(int[] array){
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]){
                    return false;
                }
                
            }

            return true;

        }
}
    




