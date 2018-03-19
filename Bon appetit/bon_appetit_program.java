import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int n = scn.nextInt();
        int k = scn.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = scn.nextInt();
            sum += ar[i];
        }
        int b_charged = scn.nextInt();
        sum = sum - ar[k];
        if(sum/2 == b_charged)
            System.out.println("Bon Appetit");
        else
            System.out.println(b_charged - (sum/2));
    }
}
