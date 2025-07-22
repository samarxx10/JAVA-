import java.util.Scanner;
public class palindrome {
 public static boolean isPalindrome(int num){
    int original = num;
    int reversed = 0;

    while(num > 0 ){
     int digit = num % 10;
     reversed = reversed * 10 + digit;
     num = num / 10; 
    }

    return original == reversed;
    
 }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = sc.nextInt();

    if(isPalindrome(number)){
        System.out.println(number + " the number is palindrome ");
    }

    else{
        System.out.println(number + " the number is not a palindrome ");
    }

    sc.close();

    
    }

        
}

    

