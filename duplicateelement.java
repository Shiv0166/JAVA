import java.util.*;
public class duplicateelement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean nww = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elemnet : "+ arr[i]);
                    nww = true;
                    break;
                }
            }
        }
        if(!nww){
            System.out.println("No duplicate ");
        }
    }
}