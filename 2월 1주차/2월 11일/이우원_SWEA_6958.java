<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine().trim());
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
 
            int p = 0;
            int maxCnt = -1;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int cnt = 0;
                for(int j = 0; j < M; j++) {
                    int k = Integer.parseInt(st.nextToken());
                    if(k == 1) {
                        cnt++;
                    }
                }
                if(cnt > maxCnt) {
                    p = 1;
                    maxCnt = cnt;
                } else if(cnt == maxCnt) {
                    p++;
                }
            }
 
            System.out.printf("#%d %d %d\n", testCase, p, maxCnt);
        }
    }
=======
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine().trim());
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
 
            int p = 0;
            int maxCnt = -1;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int cnt = 0;
                for(int j = 0; j < M; j++) {
                    int k = Integer.parseInt(st.nextToken());
                    if(k == 1) {
                        cnt++;
                    }
                }
                if(cnt > maxCnt) {
                    p = 1;
                    maxCnt = cnt;
                } else if(cnt == maxCnt) {
                    p++;
                }
            }
 
            System.out.printf("#%d %d %d\n", testCase, p, maxCnt);
        }
    }
>>>>>>> 38d72a7fd25498bf6ebc219f35a7a1b34b0f00ff
}