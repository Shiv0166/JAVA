import java.util.*;
public class quest31w3res{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 10){
                count++;
            }
        }
        int j = count*10;
        if(j==k){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}