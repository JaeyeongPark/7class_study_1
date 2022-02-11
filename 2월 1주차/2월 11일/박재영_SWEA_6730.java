package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 박재영_SWEA_6730 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
         
        for(int tc = 1; tc<=T;tc++) {
            int N = Integer.parseInt(in.readLine());
            StringTokenizer st = new StringTokenizer(in.readLine());
            int[] hurdel = new int[N];
            int up = 0;
            int down = 0;
            for(int i = 0; i<N;i++) {
                hurdel[i] = Integer.parseInt(st.nextToken());
            }
             
            for(int i = 0; i < N-1;i++) {
                if(hurdel[i+1]-hurdel[i]>up) {
                    up = hurdel[i+1]-hurdel[i];
                }
                if(hurdel[i+1]-hurdel[i]<down) {
                    down = hurdel[i+1]-hurdel[i];
                }
            }
             
            System.out.println("#"+tc+" "+up+" "+Math.abs(down));
        }
 
    }

}
