package solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1220 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int t=1;t<=10;t++) {
			int n=Integer.parseInt(br.readLine());
			
			int[][] arr=new int[100][100];
			
			for(int i=0;i<100;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0;j<100;j++){
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			int cnt=0;//교착상태 갯수
			for(int i=0;i<100;i++) {
				boolean b=false;//떨어질게 없음
				for(int j=0;j<100;j++) {
					if(arr[j][i]==1) {
						b=true;
					}
					if(arr[j][i]==2&&b==true) {
						cnt++;
						b=false;
					}
				}
			}
			System.out.println("#"+t+" "+cnt);
		}
	}
}
