package SWEA_6958;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 동철이의프로그래밍대회 {

	public static void main(String[] args) throws FileNotFoundException{
		System.setIn(new FileInputStream("s_input (1).txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0;t<tc;t++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			int [][] test = new int[N][M];
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					int q=sc.nextInt();
					test[i][j]=q;
				}
			}
			
			int []sum = new int[N+1];
			
			int cnt=1;
			int tmp=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(test[i][j]==1) {
						sum[i]++;
					}
				}
			}
			
			
			tmp=sum[0];
			for(int i=0;i<N;i++) {
				if(sum[i]<sum[i+1]) {
					tmp=sum[i+1];
				}
				if(sum[i]==sum[i+1]) {
					cnt++;
				}
				
			}
			if(tmp==0) {
				cnt=N;
			}
			System.out.println("#"+(t+1)+" "+cnt+" "+ tmp);
			System.out.println();
			
			
		}
		
	}

}
