import java.util.*;
public class removedupl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int shiv[] = new int[size];
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            boolean isfound = false;
            for(int j=0;j<k;j++){
                if(arr[i] == shiv[j]){
                    isfound = true;
                    break;
                }
            }
            if(!isfound){
                shiv[k] = arr[i];
                k++;
            }
        }
        for(int i=0;i<shiv.length;i++){
            System.out.print(shiv[i]);
            System.out.print(" ");
        }
    }
}
//very good question 
