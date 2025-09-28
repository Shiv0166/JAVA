//normal reverse of array
import java.util.*;
public class Reverseebyspace{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int l = arr.length;
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        int news[] = new int[100];
        for(int i=0;i<l;i++){
            int j=l-i-1;
            news[i] = arr[j];
        }
        for(int i=0;i<l;i++){
            System.out.println(news[i]);
        }
    }
}