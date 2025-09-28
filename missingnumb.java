import java.util.*;
public class missingnumb{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] != 1){
                System.out.print("The missing number is: " +(arr[i]+1));
            }
        }
    }
}