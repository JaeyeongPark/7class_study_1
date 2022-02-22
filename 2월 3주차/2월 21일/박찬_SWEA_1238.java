package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Contact_1238 {

	static boolean[][] arr;
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("contact.txt"));
		Scanner sc =new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0;t<2;t++) {
			int N= sc.nextInt();
			int start = sc.nextInt();
			
			arr = new boolean[101][101];
			for(int i=0;i<N/2;i++) {
				int from = sc.nextInt();
				int to = sc.nextInt();
				
				arr[from][to] = true;
	//			System.out.println(from + " "+to);
			}
			int result = bfs(start);
			System.out.println(result);
			
					
		}
	}
	private static int bfs(int v) {
        int result = 0;
         
        boolean[] visited = new boolean[101];
        int size = 0;
         
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;
         
        while(!queue.isEmpty()) {
            size = queue.size();
            int max = 0;
             
            while(--size >= 0) {
                int current = queue.poll();
                for(int i=1; i<=100; i++) {
                    if(arr[current][i] && !visited[i]) {
                        queue.offer(i);
                        if(max < i) max = i;
       //                 System.out.println(max);
                        visited[i] = true;
                    }
                }
            }
            if(max>0) result = max;
        }
         
        return result;
    }

}
