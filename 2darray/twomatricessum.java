// import java.util.*;
// public class twomatricessum{
//     public static void summ(int arr[][], int shiv[][], int raj[][]){
//         int l = arr.length;
//         for(int i=0;i<l;i++){
//             for(int j=0;j<l;j++){
//                 raj[i][j] = arr[i][j] + shiv[i][j];
//             }
//         }
//         for(int i=0;i<raj.length;i++){
//             for(int j=0;j<raj.length;j++){
//                 System.out.print(raj[i][j]);
//                 System.out.print(" ");
//             }
//         }
        
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[][] = new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int shiv[][] = new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 shiv[i][j] = sc.nextInt();
//             }
//         }
//         int raj[][] = new int[n][n];
//         summ(arr, shiv, raj);

//     }
// }

// follow this code because in uppper code  take l as length and width  because in n is same
//but if no of rows and col not same then it create problem 
//for column int arr[0].length iska mtlb yh h ki first row ka kitna length hh in horizontal wise 
// import java.util.*;

// public class TwoMatricesSum {
//     public static void summ(int arr[][], int shiv[][], int raj[][]) {
//         int rows = arr.length;       // number of rows
//         int cols = arr[0].length;    // number of columns

//         // Matrix addition
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 raj[i][j] = arr[i][j] + shiv[i][j];
//             }
//         }

//         // Printing result in matrix form
//         System.out.println("Sum of two matrices:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(raj[i][j] + " ");
//             }
//             System.out.println(); // move to next row
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // Take rows and columns
//         System.out.print("Enter number of rows: ");
//         int n = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int m = sc.nextInt();

//         int arr[][] = new int[n][m];
//         int shiv[][] = new int[n][m];
//         int raj[][] = new int[n][m];

//         // Input first matrix
//         System.out.println("Enter first matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         // Input second matrix
//         System.out.println("Enter second matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 shiv[i][j] = sc.nextInt();
//             }
//         }

//         // Function call
//         summ(arr, shiv, raj);

//         sc.close();
//     }
// }
