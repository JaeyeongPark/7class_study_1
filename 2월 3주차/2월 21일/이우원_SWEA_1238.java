import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
  
public class Solution {
     
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        int T = 10;
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
             
            int n = Integer.parseInt(token.nextToken());
            int start = Integer.parseInt(token.nextToken());
             
            List<Integer>[] arr = new LinkedList[101];
            for(int i = 0; i <= 100; i++)
                arr[i] = new LinkedList<Integer>();
             
            token = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i += 2) {
                int a = Integer.parseInt(token.nextToken());
                int b = Integer.parseInt(token.nextToken());
                 
                arr[a].add(b);
            }
             
            boolean[] visited = new boolean[101];
             
            int ret = -1;
            Queue<Integer> q = new LinkedList<>();
            q.offer(start);
            visited[start] = true;
             
            while(!q.isEmpty()) {
                int sz = q.size();
                ret = -1;
                for(int i = 0; i < sz; i++) {
                    int t = q.poll();
                    ret = Math.max(ret,  t); 
                    for(int a : arr[t]) {
                        if(!visited[a]) {
                            visited[a] = true;
                            q.offer(a);
                        }
                    }
                }
            }
             
            System.out.printf("#%d %d\n", testCase, ret);
        }
             
    }
}