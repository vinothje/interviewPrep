package basic;

/*please test input/output by entering inputs in the box below.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String args[] ) throws Exception {
    String thisLine = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float x, r;
    int t=0;
    while ((thisLine = br.readLine()) != null) {
            if(t ==0) {
                t = Integer.parseInt(thisLine);
            } else {
                x = Float.valueOf(thisLine);
                while(true) {
                    r = x % 2;
                    if(r == 1.0) {
                        System.out.println(0);
                        break;
                    }
                    if(x < 1.0) {
                        x = x *2;
                        if(x > 1.0) {
                            System.out.println(0);
                            break;
                        }
                    } else {
                        x = x/2;
                    }
                    if(x == 1.0) {
                        System.out.println(1);
                        break;
                    }
                }
            }
         }
    }
}
