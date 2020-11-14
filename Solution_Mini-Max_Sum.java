import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    /** By Ahmed CHEMCHIK */
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long min=0,max=0;
        Arrays.sort(arr);
        for (int i = 0 ; i<4 ; i++){
            min += arr[i];    
        }
        for (int i1 = 1 ; i1<5 ; i1++){
            max += arr[i1];    
        }
        System.out.println(min+ " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
