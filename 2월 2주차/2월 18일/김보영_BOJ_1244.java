package study;

import java.util.Scanner;

public class BOJ_1244 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] sw=new int[n+1];
		
		for(int i=0;i<=n;i++)
			sw[i]=0;
		
		for(int i=1;i<=n;i++)
			sw[i]=sc.nextInt();
		
		int c=sc.nextInt();
		for(int i=0;i<c;i++) {
			int people=sc.nextInt();
			int a=sc.nextInt();
			
			if(people==1) {//남자
				int j=1;
				int s=a;
				while(a<=n) {
					j++;
					if(sw[a]==1)
						sw[a]=0;
					else
						sw[a]=1;
					
					a=s*j;
				}
			}
			if(people==2) {
				sw[a]=(sw[a]+1)%2;
				
				int j=1;
				while(a-j>=1&&a+j<=n) {
					if(sw[a-j]==sw[a+j]) {
						sw[a-j]=(sw[a-j]+1)%2;
						sw[a+j]=(sw[a+j]+1)%2;
						j++;
					}
					else break;
				}
			}
		}
		for(int i=1;i<=n;i++) {
			System.out.print(sw[i]+" ");
			if(i%20==0)
				System.out.println();
		}
	}
}
