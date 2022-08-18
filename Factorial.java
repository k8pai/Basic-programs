import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Factorial using iteration.");
        System.out.print(" Enter Number : ");
        int n = in.nextInt();
        int fact=1;
        while(n>1){
            fact*=n;
            n--;
        }
        System.out.println("Factorial = "+fact);
    }
}