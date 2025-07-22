public class sorted1 {
    public static void main(String[] args) {
        int[] array = new int[]{10,20,30,40,50};
        boolean result = isSorted(array);
        System.out.println(result);

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
    

