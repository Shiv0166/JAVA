import java.util.*;
public class diffmaxmin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int maxmi = Integer.MIN_VALUE;
        int minmi = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maxmi<arr[i]){
                maxmi = arr[i];
            }
            if(minmi>arr[i]){
                minmi = arr[i];
            }
        }
        System.out.print(maxmi-minmi);
    }
}
