public class sortedarray{
    public static void main(String[] args) {
        int[] array = new int[]{1,4,2,5,10};
        boolean result  = isSorted(array);
        System.out.println(result);
    }

    public static boolean isSorted(int[] array){
    for (int i = 0; i < array.length; i++) {
        if(array[i] > array[i+1]){
            return false;

        }
        
    }

    return true;
}
}