package solve;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10026_적록색약 {
	static int n;
	static boolean visited[][];
	static char arr[][];
	static int dir[][]= {{0,-1},{0,1},{-1,0},{1,0}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		visited=new boolean[n][n];
		
		arr=new char[n][n];
		for(int i=0;i<n;i++) {
			String s=sc.next();
			for(int j=0;j<n;j++)
				arr[i][j]=s.charAt(j);
		}
		
		int cnt1=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				if(visited[i][j]==false) {
					char start=arr[i][j];
					dfs1(i,j,start);
					cnt1++;
				}
			}
		for(int i=0;i<n;i++)//방문배열 초기화
			Arrays.fill(visited[i], false);
		
		int cnt2=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				if(visited[i][j]==false) {
					char start=arr[i][j];
					dfs2(i,j,start);
					cnt2++;
				}
			}
		System.out.println(cnt1+" "+cnt2);

	}
	
	public static void dfs1(int x,int y,char start) {
		visited[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int nextX=x+dir[i][0];
			int nextY=y+dir[i][1];
			
			if(nextX>=0&&nextX<n&&nextY>=0&&nextY<n&&visited[nextX][nextY]==false&&arr[nextX][nextY]==start)
				dfs1(nextX,nextY,start);
		}
	}
	
	public static void dfs2(int x,int y,char start) {
		visited[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int nextX=x+dir[i][0];
			int nextY=y+dir[i][1];
			
			if(nextX>=0&&nextX<n&&nextY>=0&&nextY<n&&visited[nextX][nextY]==false) {
				if(((start=='R'||start=='G')&&(arr[nextX][nextY]=='R'||arr[nextX][nextY]=='G'))||start=='B'&&arr[nextX][nextY]=='B')
					dfs2(nextX,nextY,start);
			}
		}
	}

}
