package solve;

import java.util.Scanner;

public class SWEA_1209 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int t=1;t<=10;t++) {
			int tc=sc.nextInt();
			
			int arr[][]=new int[100][100];
			
			for(int i=0;i<100;i++)
				for(int j=0;j<100;j++) {
					arr[i][j]=sc.nextInt();
				}
			
			int ans=0;
			//행의 합
			for(int i=0;i<100;i++) {
				int sum=0;
				for(int j=0;j<100;j++) {
					sum+=arr[i][j];
				}
				ans=Math.max(sum, ans);
			}
			//열의 합
			for(int i=0;i<100;i++) {
				int sum=0;
				for(int j=0;j<100;j++) {
					sum+=arr[j][i];
				}
				ans=Math.max(sum, ans);
			}
			//대각선 합
			int sum1=0;//대각선1
			int sum2=0;//대각선2
			for(int i=0;i<100;i++) {
				sum1+=arr[i][i];
				sum2+=arr[i][99-i];
			}
			
			ans=Math.max(ans, Math.max(sum1, sum2));
			
			System.out.println("#"+tc+" "+ans);
		}
	}

}
