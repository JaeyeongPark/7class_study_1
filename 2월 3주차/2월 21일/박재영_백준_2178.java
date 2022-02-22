package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_2178_미로탐색 {
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
	static int N,M,ans;
	static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new char[N+1][M+1];
		ans = 987654321;
		for (int r = 1; r <= N; r++) {
			String s = sc.next();
			for (int c = 1; c <= M; c++) {
				arr[r][c] = s.charAt(c-1);
			}
		}
		//print(arr);
		bfs(1,1,1);
		
		
	}
	
	
	
	
	private static void bfs(int r, int c,int cnt) {
		Queue<Point> que = new LinkedList<Point>();
		boolean[][] v = new boolean[N+1][M+1];
		
		que.offer(new Point(r,c,cnt));
		while(!que.isEmpty()) {
			cnt++;
			int size = que.size();
			for (int i = 0; i < size; i++) {
				Point p = que.poll();
				
				if(p.r == N && p.c == M) {
					System.out.println(p.cnt);
					break;
				}
				
				for (int d = 0; d < 4; d++) {
					int nr = p.r+dr[d];
					int nc = p.c+dc[d];
					if(nr >= 1 && nr <= N && nc >= 1 && nc <=M && !v[nr][nc] && arr[nr][nc] == '1') {
						v[nr][nc] = true;
						que.add(new Point(nr,nc,p.cnt+1));
					}
				}
			}
		}
		
	}
	
	static class Point{
		int r, c, cnt;
		Point(int r,int c, int cnt){
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
	}

	private static void print(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
