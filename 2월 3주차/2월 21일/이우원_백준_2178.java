import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] map = new boolean[N][M];
        boolean[][] visited = new boolean[N][M];

        for (int r = 0; r < N; r++) {
            String s = br.readLine();
            for (int c = 0; c < M; c++) {
                map[r][c] = s.charAt(c) == '1';
            }
        }

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0, 0));
        visited[0][0] = true;

        int mv = 0;
        while(!q.isEmpty()) {
            int sz = q.size();
            mv++;
            for(int z = 0; z < sz; z++) {
                Pair p = q.poll();

                if(p.r == N - 1 && p.c == M - 1) {
                    q.clear();
                    break;
                }

                for(int d = 0 ;d < 4; d++) {
                    int nr = p.r + dr[d];
                    int nc = p.c + dc[d];

                    if(nr < 0 || nr >= N || nc < 0 || nc >= M || !map[nr][nc] || visited[nr][nc])
                        continue;

                    q.offer(new Pair(nr, nc));
                    visited[nr][nc] = true;
                }
            }
        }

        System.out.println(mv);

    }

    static class Pair {
        int r, c;

        public Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}