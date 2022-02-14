package SWEA_6730;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 장애물경주난이도 {

	public static void main(String[] args) throws FileNotFoundException{
		System.setIn(new FileInputStream("s_input.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0;t<tc;t++) {
			int N=sc.nextInt();
			int [] a = new int[N];
			for(int i=0;i<N;i++) {
				int x=sc.nextInt();
				a[i] = x;
			}
			int U=0;
			int D=0;
			for(int i=0;i<N;i++) {
				if(i+1<N && a[i]<a[i+1]) {
					int tmp_u = Math.abs(a[i]-a[i+1]);
					if(tmp_u>U) {
						U=tmp_u;
					}
				}
				if(i+1<N && a[i]>=a[i+1]) {
					int tmp_d = a[i]-a[i+1];
					if(tmp_d>D) {
						D=tmp_d;
					}
				}
				
			}
			System.out.println("#"+(t+1)+" "+U+" "+D);
		}
	}

}
