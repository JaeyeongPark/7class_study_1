import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
 
    static final int[] arr = {1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine().trim());
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
 
            String ret = "SAME";
 
            if(a.length() != b.length()) {
                ret = "DIFF";
            } else {
                for(int i = 0; i < a.length(); i++) {
                    int ag = arr[a.charAt(i) - 'A'];
                    int bg = arr[b.charAt(i) - 'A'];
                    if(ag != bg) {
                        ret = "DIFF";
                        break;
                    }
                }
            }
 
            System.out.printf("#%d %s\n", test_case, ret);
        }
    }
}