import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        int valley = 0;
        int fromSeaLevel = 0;
        for(char character : s.toCharArray()){
            if(character == 'U')
                fromSeaLevel++;
            if(character == 'D')
                fromSeaLevel--;
        
            if(fromSeaLevel == 0 && character == 'U')
                valley++;
        }
        return valley;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}

