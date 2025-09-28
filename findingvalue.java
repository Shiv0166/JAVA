import java.util.*;

public class findingvalue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int k = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(k == arr[i]) {    // ✅ removed semicolon
                System.out.print("found");
                found = true;
                break;           // ✅ stop once found
            }
        }

        if(!found) {
            System.out.print("Not found");
        }
    }
}
