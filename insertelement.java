import java.util.*;
public class insertelement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int kaho[] = new int[size + 1]; 
        int ind = sc.nextInt();
        int val = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(i<ind){
                kaho[i] = arr[i];
            }else if(i==ind){
                kaho[i] = val;
            }else{
                kaho[i] = arr[i-1];
            }
        }
        for(int i=0;i<kaho.length;i++){
            System.out.print(kaho[i]);
            System.out.print(" ");
        }
    }
}