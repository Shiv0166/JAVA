// //diagonal sum 
// import java.util.*;
// public class ques1{
// public static int diagonalsum(int arr[][]) {
//     int n = arr.length;
//     int sum = 0;

//     for (int i = 0; i < n; i++) {
//         sum += arr[i][i];           // primary diagonal
//         if (i != n - i - 1) {       // avoid double-counting center
//             sum += arr[i][n - i - 1]; // secondary diagonal
//         }
//     }

//     return sum;
// }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[][] = new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int k = diagonalsum(arr);
//         System.out.print(k);
//     }
// }


// import java.util.*;
// public class ques1{
//     public static void main(String args[]){
//         Scanner sc = new Scaner(System.in);
//         int k = sc.nextInt();
//         int fact =1;
//         for(int i=1;i<=k;i++){
//             fact *= i;
//         }
//         System.out.print(fact);
//     }
// }