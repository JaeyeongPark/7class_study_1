package solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SWEA_6958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int tc=sc.nextInt();
		for(int t=1;t<=tc;t++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			Map<Integer,Integer> map=new HashMap<>();
					
			int[][] arr=new int[n][m];
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++) {
					arr[i][j]=sc.nextInt();
				}
			
			int max=0;
			for(int i=0;i<n;i++) {
				int sum=0;
				for(int j=0;j<m;j++) {
					if(arr[i][j]==1) sum++;
				}
				if(map.get(sum)==null)
                    map.put(sum,1);
                else
                    map.put(sum,map.get(sum)+1);
				
				max=Math.max(max, sum);
			}
			
			System.out.println("#"+t+" "+map.get(max)+" "+max);
		}
	}

}
