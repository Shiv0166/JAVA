import java.util.*;
public class counteveod{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int evecout =0;
        int odcout = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evecout++;
            }else{
                odcout++;
            }
        }
        System.out.print("The no of even: " + evecout);
        System.out.print("The no of odd: " + odcout);
    } 
}