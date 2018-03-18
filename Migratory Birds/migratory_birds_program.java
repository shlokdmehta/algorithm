import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int[] birdTypeCount = new int[5];
        int higher=0;
        int ans=0;
        for(int bird: ar)
        {
            birdTypeCount[bird-1]++;
        }
        for(int i=0; i<birdTypeCount.length; i++)
        {
            if(birdTypeCount[i]>higher)
            {
                higher = birdTypeCount[i];
                ans = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
