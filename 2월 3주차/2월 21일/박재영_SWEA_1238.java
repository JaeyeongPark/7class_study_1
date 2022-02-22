package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1238_Contact {
	static int N;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			int start = sc.nextInt();
			ans = 0;
			int[][] adjMatrix = new int[101][101];
		
		
			for (int i = 0; i < N/2; i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				adjMatrix[from][to] = 1;
			}
//			for (int[] is : adjMatrix) {
//				System.out.println(Arrays.toString(is));
//			
//			}
			bfs(adjMatrix,start);
			System.out.println("#"+tc+" "+ans);
		}
		
	}

	private static void bfs(int[][] adjMatrix, int start) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] v = new boolean[101];
		int idx = 0;
		queue.offer(start);
		v[start] = true;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			//System.out.println("size:"+size);
			ans = -1;
			for (int i = 0; i < size; i++) {  //size를 이용해서 단계별 구분
				int current = queue.poll();
				//System.out.println(current);
				ans = Math.max(ans, current);    //해당 단계에서 가장 높은 값 저장
				for (int j = 0; j<101;j++){
					if(!v[j] && adjMatrix[current][j] == 1) {
						queue.offer(j);
						v[j] = true;
					}
				} 
			}
		}

		
//		System.out.println(ans);
	}

	private static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
