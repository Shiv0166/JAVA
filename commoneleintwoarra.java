import java.util.*;
public class commoneleintwoarra{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int shiv[] = new int[l];
        for(int i=0;i<shiv.length;i++){
            shiv[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<shiv.length;j++){
                if(arr[i] == shiv[j]){
                    System.out.print("The common elemnt : " + arr[i]);
                }
            }
        }
    }
}