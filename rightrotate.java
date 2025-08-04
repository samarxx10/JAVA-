public class rightrotate {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        rightrotate1(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            
        }

    }

    public static void rightrotate1(int[] array){
        if(array.length == 0)return;

        int last = array[4];

        for (int i = array.length - 1; i > 0 ; i--) {
            array[i] = array[i-1];
            
        }

        array[0] = last;
    }
    
}
