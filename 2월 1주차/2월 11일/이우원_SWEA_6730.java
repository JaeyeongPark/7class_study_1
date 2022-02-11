import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
 
    private static final int[] dr = {-1, 1, 0, 0};
    private static final int[] dc = {0, 0, -1, 1};
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine().trim());
        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int before = Integer.parseInt(st.nextToken());
            int u = 0, d = 0;
            for (int i = 0; i < N - 1; i++) {
                int c = Integer.parseInt(st.nextToken());
                if(before > c) {
                    d = Math.max(d, before - c);
                } else if(c > before) {
                    u = Math.max(u, c - before);
                }
                before = c;
            }
            System.out.printf("#%d %d %d\n", testCase, u, d);
        }
    }
}