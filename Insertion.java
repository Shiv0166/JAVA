import java.util.*;
public class Insertion{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int l = arr.length;
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<arr.length;i++){
            int curr = arr[i]; 
            int prev = i-1;
            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion 
            arr[prev+1] = curr; 
        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

}