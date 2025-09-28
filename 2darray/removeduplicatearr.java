import java.util.*;
public class removeduplicatearr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = 0;
        int shiv[] = new int[size];
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<k;j++){
                if(shiv[j] == arr[i]){
                    found = true;
                    break;
                }
            }
            if(!found){
                shiv[k] = arr[i];
                k++;
            }
        }
        System.out.print("the length of new array : " + k);
    }
}