import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = 10;
        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine().trim());
 
            int[][] map = new int[N][N];
            for(int r = 0; r < N; r++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int c = 0; c < N; c++) {
                    map[r][c] = Integer.parseInt(st.nextToken());
                }
            }
            int ret = 0;
            for(int c = 0; c < N; c++) {
                boolean f = false;
                for(int r = 0; r < N; r++) {
                    if (map[r][c] == 1)
                        f = true;
                    else if (map[r][c] == 2 && f) {
                        ret += 1;
                        f = false;
                    }
                }
            }
 
            System.out.printf("#%d %d\n", testCase, ret);
        }
    }
}