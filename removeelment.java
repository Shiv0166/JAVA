import java.util.*;
public class removeelment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int kar[] = new int[size];
        int j=0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                continue;
            }else{
                kar[j] = arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(kar[i]);
            System.out.print(" ");
        }
    }
}
// import java.util.*;
// public class removeelment {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();
//         int kar[] = new int[size]; // updated size to match original array
//         int j = 0; // index for kar

//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] == k){
//                 continue; // skip the element we want to remove
//             } else {
//                 kar[j] = arr[i]; // copy only if not k
//                 j++; // increment j only when we copy
//             }
//         }

//         // print only the filled elements
//         for(int i = 0; i < j; i++){
//             System.out.print(kar[i] + " ");
//         }
//     }
// }