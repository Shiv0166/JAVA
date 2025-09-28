import java.util.*;
public class Recursion2{
    public static void printInc(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        printInc(num-1);
        System.out.println(num);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInc(n);
    }
}