import java.util.*;
class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter a max limit to which prime numbers are to be printed : ");
        int limit = in.nextInt();
        int num=2;
        boolean flag;
        do{
            flag = false;
            for(int i = 2; i<num; i++){
                if(num%i == 0)
                    flag = true;
            }
            if(flag == false)
                System.out.print(num+", ");
            num++;
        }while(num<limit);
    }
}