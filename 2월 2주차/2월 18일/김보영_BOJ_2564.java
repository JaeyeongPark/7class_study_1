package study;

import java.util.Scanner;

public class BOJ_2564 {
	
	static int store[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int width=sc.nextInt();
		int height=sc.nextInt();
		
		int n=sc.nextInt();
		store=new int[n][2];
		
		for(int i=0;i<n;i++) {
			store[i][0]=sc.nextInt();
			store[i][1]=sc.nextInt();
		}
		
		int d=sc.nextInt();
		int x=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<n;i++) {
			if(d==store[i][0])
				sum+=Math.abs(store[i][1]-x);
			
			else if(d==1&&store[i][0]==3)
				sum+=x+store[i][1];
			else if(d==1&&store[i][0]==4)
				sum+=(width-x)+store[i][1];
			else if(d==1&&store[i][0]==2||d==2&&store[i][0]==1)
				sum+=height+Math.min(store[i][1]+x, width-x+width-store[i][1]);
			else if(d==2&&store[i][0]==3)
				sum+=x+height-store[i][1];
			else if(d==2&&store[i][0]==4)
				sum+=width-x+height-store[i][1];
			else if(d==3&&store[i][0]==2)
				sum+=height-x+store[i][1];
			else if(d==3&&store[i][0]==4||d==4&&store[i][1]==3)
				sum+=width+Math.min(height-x+height-store[i][1], x+store[i][1]);
			else if(d==4&&store[i][0]==2)
				sum+=width-store[i][1]+height-x;
			else if(d==4&&store[i][0]==1)
				sum+=x+width-store[i][1];
			
		}
		System.out.println(sum);

	}

}
