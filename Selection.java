import java.util.*;
public class Selection{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int l = arr.length;
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<l-1;i++){
            int minpos = i;
            for(int j=i+1;j<l;j++){
                if(arr[j]<arr[minpos]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

}