package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1220_Magnetic {
	//1은 N극 , 2는 S극     아래 s극 , 위 N극
	static int[] dir =  {1,-1}; 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
			int cnt = 0;
			boolean flag = true;
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			//map 밖으로 떨어질 자성체 골라내기
			for(int c = 0; c<N; c++) {
				for(int r = 0; r<N;r++) {
					
					//아래로 내려가면서 2가 나오기 전에 나온 1은 0으로 바꿈
					if(map[r][c] == 2 & flag == true) {
						map[r][c] = 0;
					}else if(map[r][c] == 1) {
						flag = false;
					}
				}
				flag = true;
				for(int r = N-1; r>=0;r--) {
					//위로 올라가면서 1이 나오기 전에 나온 2는 0으로 바꿈
					if(map[r][c] == 1 & flag == true) {
						map[r][c] = 0;
					}else if(map[r][c] == 2) {
						flag = false;
					}
				}
				flag = true;
			}
			
			//위쪽은 전부 1로 시작
			for(int c = 0; c<N; c++) {
				for(int r = 0; r<N;r++) {
					if(map[r][c] == 2 & flag == true) {
						cnt++;
						flag = false;
					}else if(map[r][c] == 1) {
						flag = true;
					}

				}	
			}
			
			System.out.println("#"+tc+" "+cnt);
			
		}

	}

}
