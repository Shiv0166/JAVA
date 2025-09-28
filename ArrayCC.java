//linear search 
import java.util.*;
public class ArrayCC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];
        int k = marks.length;
        for(int i=0;i<k;i++){
            marks[i] = sc.nextInt();
        }
        int j = sc.nextInt();
        for(int i=0;i<k;i++){
            if(marks[i] == j){
                System.out.print(i);
                return;
            }
        }
        System.out.print("Not found!");
    }
}