package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 박재영_SWEA_6958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
         
        for(int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] arr = new int [N][M];
            int[] cnt = new int[N];
            int pcnt = 0;
            int max = -1;
             
            for(int i = 0 ; i<N; i++) {
                st = new StringTokenizer(in.readLine()," ");
                for(int j = 0 ; j<M;j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
             
            for(int i = 0 ; i<N; i++) {
                for(int j = 0 ; j<M;j++) {
                    cnt[i] += arr[i][j];
                }
                if(cnt[i] >= max) {
                    if(cnt[i] == max) {
                        pcnt++;
                    }else {
                        pcnt = 1;
                    }
                    max = cnt[i];
                }
            }
            System.out.println("#"+tc+" "+pcnt+" "+max);
        }   
    }

}
