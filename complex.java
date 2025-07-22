public class complex {
    public static void main(String[] args) {

        Complex num1 = new Complex();
         num1.a = 5;
         num1.b = 7;
         num1.print();
        
    }
    
}

class Complex{
    int a , b;

    void print(){
        System.out.println(a+" + "+b+"i");
    }
}
