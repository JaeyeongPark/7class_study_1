import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
        for(int testCase = 1; testCase <= T; testCase++) {
            String s = sc.next();
 
            int ret = 0;
            char before = '0';
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != before) {
                    ret++;
                    before = s.charAt(i);
                }
            }
             
            System.out.printf("#%d %d\n", testCase, ret);
        }
    }
}