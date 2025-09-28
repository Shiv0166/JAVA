import java.util.*;
public class pairsofall{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int summ = sc.nextInt();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == summ){
                    System.out.println(arr[i] );
                    System.out.println(arr[j]);
                }
            }
        }
    }
}