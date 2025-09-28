// public class Boilerplate{
//     public static void main(String args[]){
//         System.out.print("Hello Shivam");
//     }
// }
// public class Boilerplate{
//     public static void main(String args[]){
//         int a = 6;
//         int b= 7;
//         int sum = a+b;
//         System.out.print(sum);
//     }
// }
// import java.util.*;
// public class Boilerplate{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         boolean shiv = sc.nextBoolean();
//         System.out.print(shiv);
//     }
// }

// import java.util.*;
// public class Boilerplate{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.print(sum);
//     }
// }
// import java.util.*;
// public class Boilerplate{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if(number%2==0){
//             System.out.print("It's a even number");
//         }else{
//             System.out.println("It's odd number");
//         }
//     }
// }



//print the number 1 to 10
// import java.util.*;
// public class Boilerplate{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             System.out.println(i);
//         }
//     }
// }



//the sum of first n number
// import java.util.*;
// public class Boilerplate{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k=0;
//         for(int i=1;i<=n;i++){
//             k+=i;
//         }
//         System.out.println("The sum of first n number " + k);
//     }
// }

//reverse a number
// import java.util.*;
// public class Boilerplate{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         int n =0;
//         while(k>0){
//             int digit = k%10;
//             n = digit+n*10;
//             k /= 10;
//         }
//         System.out.print("the reverse of required number: " + n);
//     }
// }



//check number is prime number
// import java.util.*;
// public class Boilerplate{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         boolean isPrime = true;
//         if(k<2){
//             isPrime = false;
//         }
//         else{
//         for(int i=2;i<k;i++){
//             if(k%i ==0){
//                 isPrime = false;
//                 break;
//             }
//         }
//     }
//         if(isPrime==true){
//             System.out.println("the number is prime");
//         }else{
//             System.out.println("the number is not prime");
//         }
//     }
// }

// Write a program that reads a set of integers, 

//find the product of two number using function 
// import java.util.*;
// public class Boilerplate{
// public static void calculatepro(int a, int b){
//     System.out.println("The product of two number: "  + a*b);
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     calculatepro(a,b);
// }
// }

//find the factorial of number n
// import java.util.*;
// public class Boilerplate{
// public static int calculatepro(int n){
//     int fact =1;
//     for(int i=1;i<=n;i++){
//         fact *= i;
//     }
//     return fact;
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int factorial = calculatepro(n);
//     System.out.print("The factorial is : " + factorial);
// }
// } 
//find prime number in range
import java.util.*;
public class Boilerplate{
public static int calculatepri(int n){
    boolean is
    if(n<2){
        return false;
    }
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        if()
    }
}
}