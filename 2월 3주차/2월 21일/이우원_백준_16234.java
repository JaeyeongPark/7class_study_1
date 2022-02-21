import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][N];

        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        int ret = 0;
        boolean isDone = false;
        while (!isDone) {
            isDone = true;
            boolean[][] visited = new boolean[N][N];

            List<List<Pair>> unions = new LinkedList<>();

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (visited[r][c]) continue;

                    List<Pair> list = new LinkedList<>();
                    Queue<Pair> q = new LinkedList<>();

                    q.offer(new Pair(r, c));
                    visited[r][c] = true;
                    list.add(new Pair(r, c));

                    while (!q.isEmpty()) {
                        Pair p = q.poll();

                        for (int d = 0; d < 4; d++) {
                            int nr = p.r + dr[d];
                            int nc = p.c + dc[d];

                            if (nr < 0 || nr >= N || nc < 0 || nc >= N
                                    || Math.abs(map[nr][nc] - map[p.r][p.c]) < L
                                    || Math.abs(map[nr][nc] - map[p.r][p.c]) > R
                                    || visited[nr][nc])
                                continue;

                            q.offer(new Pair(nr, nc));
                            list.add(new Pair(nr, nc));

                            visited[nr][nc] = true;
                        }
                    }

                    if(list.size() != 1) {
                        unions.add(list);
                        isDone = false;
                    }
                }
            }

            for(List<Pair> t : unions) {
                int sum = 0;
                for (Pair p : t) {
                    sum += map[p.r][p.c];
                }
                for(Pair p : t) {
                    map[p.r][p.c] = sum / t.size();
                }
            }

            if(!isDone)
                ret++;
        }


        System.out.println(ret);

    }

    static class Pair {
        int r, c;

        public Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
