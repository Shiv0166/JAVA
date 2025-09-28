import java.util.*;
public class secondlar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int maxi = arr[0];
        for(int i=1;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi = arr[i];
            }
        }
        int sec = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sec<maxi && sec<arr[i]){
                sec = arr[i];
            }
        }
        if(sec == Integer.MIN_VALUE){
            System.out.print("No second largest element");
        }else{
            System.out.println("The second largest number: " + sec);
        }

    }
}