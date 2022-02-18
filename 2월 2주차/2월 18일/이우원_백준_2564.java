import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static int W, H;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        W = sc.nextInt();
        H = sc.nextInt();

        int N = sc.nextInt();
        int[][] stores = new int[N][2];
        for (int i = 0; i < N; i++) {
            stores[i][0] = sc.nextInt();
            stores[i][1] = sc.nextInt();
        }
        int dir = sc.nextInt();
        int dist = sc.nextInt();

        int ret = 0;

        int a = fun1(dir, dist);
        for (int i = 0; i < N; i++) {
            int d = 1000;
            d = Math.min(d, Math.abs(a - fun1(stores[i][0], stores[i][1])));
            d = Math.min(d, Math.abs(2*W+2*H - d));
            ret += d;
        }
        System.out.println(ret);
    }

    public static int fun1(int a, int b) {
        switch (a) {
            case 1:
                return b;
            case 2:
                return 2 * W + H - b;
            case 3:
                return 2 * W + 2 * H - b;
            case 4:
                return W + b;
        }
        return -1;
    }
}
