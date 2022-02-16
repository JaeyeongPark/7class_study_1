import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = 10;
        for (int testCase = 1; testCase <= T; testCase++) {
            int tc = Integer.parseInt(br.readLine());
            int[][] m = new int[100][100];
            int ret = 0;
 
            for(int r = 0; r < 100; r++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int t = 0;
                for(int c = 0; c < 100; c++) {
                    m[r][c] = Integer.parseInt(st.nextToken());
                    t += m[r][c];
                }
                ret = Math.max(t, ret);
            }
 
            for(int c = 0; c < 100; c++) {
                int t = 0;
                for(int r = 0; r < 100; r++) {
                    t += m[r][c];
                }
                ret = Math.max(t, ret);
            }
            int a = 0;
            int b = 0;
            for(int i = 0; i < 100; i++) {
                a += m[i][i];
                b += m[99 - i][i];
            }
            ret = Math.max(ret, a);
            ret = Math.max(ret, b);
 
 
            System.out.printf("#%d %d\n", testCase, ret);
        }
    }
}