import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
        for(int testCase = 1; testCase <= T; testCase++) {
            String s = sc.next();
 
            Stack<Integer> stk = new Stack<>();
             
            int ret = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stk.add(i);
                } else {
                    if(stk.peek() == i - 1) {
                        stk.pop();
                        ret += stk.size();
                    }else {
                        stk.pop();
                        ret += 1;
                    }
                }
            }
             
            System.out.printf("#%d %d\n", testCase, ret);
        }
    }
}