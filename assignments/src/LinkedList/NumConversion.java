package LinkedList;
import java.io.*;

/**
 * Created by vinothjeevanandam on 6/28/17.
 */
public class NumConversion {
    public static void main(String[] args) {
        String str = "123";
        char[] ch = str.toCharArray();
        int num = 0;
        for(int i= ch.length-1;i>=0;i--) {
            int x = ch[i] - '0';
            num += x * Math.pow(10, (ch.length - i-1));
        }
        System.out.println(num);

        doDecimal("123.456");
    }

    static void doDecimal(String str) {
        char[] ch  = str.toCharArray();
        int num = 0;
        int cnt = 0;
        int index;
        for(int i= 0;i<= ch.length;i++) {
            if(ch[i] == '.') {
                index = cnt++;
            }
        }
    }
}

/*
spiral output from mxn matrix
find the transcript words
3. boggle problem.

pramp.com
 */
