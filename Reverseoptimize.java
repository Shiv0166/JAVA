import java.util.*;
public class Reverseoptimize{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int l = arr.length;
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        int st = 0;
        int end = size-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }
}


