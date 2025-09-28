import java.util.*;
public class Subaaa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int l = arr.length;
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<l;i++){
            for(int j = i;j<l;j++){
                System.out.print(i);
                System.out.print(j);
            System.out.print(" ");
            }
            System.out.println();
        }
    }
}