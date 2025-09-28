public class Recursion3{
    public static int summ(int n){
        if(n==1){
            return 1;
        }
        int k = n+ summ(n-1);
        return k;
    }
    public static void main(String args[]){
        int n = 100;
        System.out.println(summ(n));
    }
}