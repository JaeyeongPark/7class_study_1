import java.util.Arrays;
import java.util.Scanner;

public class B1244 {
    // 남학생은 자기가 받은 수의 배수이면
    // 여학생은 자기의 수를 중심으로 대칭되는 범위까지 반대로 바꿈
    // 1: 켜짐, 0: 꺼짐
    // 1: 남자, 2: 여학생
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];

        // 전구 입력
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int num = sc.nextInt();
            int k=1;
            int tmp = num-1;

            if (s==1){ // 남학생
                while (tmp<T){
                    arr[tmp]^=1;
                    tmp+=num;
                }
            }else{ // 여학생
                while (true){
                    int tmp1 = num-1+k;
                    int tmp2 = num-1-k;
                    if (tmp1<T && tmp2>=0 && arr[tmp1]==arr[tmp2]){ // 범위를 안 벗어나고 두 상태가 같다면
                        k++;
                        continue;
                    }else {
                        for (int j = tmp2+1; j < tmp1; j++) { // 다르다면 범위만큼 반대로 돌리기
                            arr[j]^=1;
                        }
                        break;
                    }
                }
            }
        }
        // 출력
        for (int i = 0; i < T; i++) {
            System.out.print(arr[i]+" ");
            if((i+1)%20==0)
                System.out.println();
        }
    }
}
