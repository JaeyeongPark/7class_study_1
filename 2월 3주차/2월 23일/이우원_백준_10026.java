import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];

        for (int i = 0; i < N; i++) {
            String t = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = t.charAt(j);
            }
        }
        System.out.print(bfs(map, N));
        System.out.println(" " + bfs(map, N));
    }

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1 ,1};
    static int bfs(char[][] map, int N) {
        int result = 0;
        boolean[][] visited = new boolean[N][N];

        for(int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if(visited[r][c])
                    continue;
                result++;

                Queue<Pair> q = new LinkedList<>();
                q.offer(new Pair(r, c));

                while(!q.isEmpty()) {
                    Pair p = q.poll();
                    for(int d = 0; d < 4; d++) {
                        int nr = p.r + dr[d];
                        int nc = p.c + dc[d];

                        if(nr < 0 || nr >= N || nc < 0 || nc >= N || map[nr][nc] != map[p.r][p.c] || visited[nr][nc]) {
                            continue;
                        }

                        q.offer(new Pair(nr, nc));
                        visited[nr][nc] = true;
                    }

                    if(map[p.r][p.c] == 'R')
                        map[p.r][p.c] = 'G';
                }
            }
        }
        return result;
    }

    static class Pair {
        int r, c;

        public Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
