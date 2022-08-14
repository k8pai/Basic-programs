import java.util.*;
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Enter a max limit to which fibonacci is to be printed : ");
        int limit = in.nextInt();
        int firstTerm=1, secondTerm=0, prevElem;
        do{
            prevElem = firstTerm;
            System.out.println(firstTerm+", ");
            firstTerm += secondTerm;
            secondTerm = prevElem;
        }while(firstTerm<limit);
    }
}