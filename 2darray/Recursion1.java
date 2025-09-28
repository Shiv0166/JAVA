import java.util.*;
public class Recursion1{
    public static void printDec(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.print(num+" ");
        printDec(num-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDec(n);
    }
}