import java.util.*;
public class indexfind{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(k == arr[i]){
                System.out.print(i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}