package solve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SWEA_6730 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			ArrayList<Integer> up=new ArrayList<>();
			ArrayList<Integer> down=new ArrayList<>();
			
			for(int i=1;i<n;i++) {
				int tmp=arr[i]-arr[i-1];
				
				if(tmp>0)
					up.add(tmp);
				else if(tmp<0)
					down.add(tmp);
			}
			
			Collections.sort(up,Collections.reverseOrder());//내림차순 정렬
			Collections.sort(down);//오름차순 정렬
			
			int ansup=0;
			int ansdown=0;
			
			if(up.isEmpty())
				ansup=0;
			else
				ansup=up.get(0);
			
			if(down.isEmpty())
				ansdown=0;
			else
				ansdown=Math.abs(down.get(0));
			
			System.out.println("#"+t+" "+ansup+" "+ansdown);
			
		}

	}

}
