package BJ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_2178 {
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	static int[][] map;
	static int N,M;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		File file = new File("미로.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		int tc = Integer.parseInt(str);
//		System.out.println(tc);
//		for(int t=0;t<tc;t++) {
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i=0;i<N;i++) {
			str = br.readLine();
			
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(str.charAt(j)+"");
				
			}
			
		}
		
		boolean[][] v = new boolean[N][M];
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if (map[r][c] == 1) {

					
					BFS(r, c, v);
				}
			}
		}
//		print(map);
		System.out.println(map[N-1][M-1]);
//	}
	}
	
	
	private static void BFS(int r, int c, boolean[][] v) {
		int cnt=0;
		Queue<int[]> Q = new LinkedList<>();
		Q.add(new int[] { r, c });
		v[r][c] = true;
		while (!Q.isEmpty()) {
			cnt++;
			int size = Q.size();
			
			for (int i = 0; i < size; i++) {
				int[] p = Q.poll();
				
				
				if(p[0]==N-1&& p[1]==N-1) {
					
				}
				
				
				map[p[0]][p[1]] = cnt;
				for (int d = 0; d < 4; d++) {
					int nr = p[0] + dr[d];
					int nc = p[1] + dc[d];
					if (check(nr, nc) && map[nr][nc]==1) {
						v[nr][nc] = true;
						Q.add(new int[] { nr, nc });
					}
				}
			}
		}
	}
	
	private static boolean check(int nr, int nc) {
		if (nr >= 0 && nr < N && nc >= 0 && nc < M)
			return true;
		return false;
	}
	
	private static void print(int[][] map) {
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				System.out.print(map[r][c] + " ");
			}
			System.out.println();
		}
	}

}
