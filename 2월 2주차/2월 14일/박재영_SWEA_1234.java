package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class swea_1234 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(in.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			List<Character> list = new LinkedList<Character>();
			boolean check = false;
			
			
			for(int i = 0; i<s.length();i++) {
				list.add(s.charAt(i));
			}
			//char[] arr = st.nextToken().toCharArray();
			
			while(true) {
				for(int i = 0; i<list.size()-1;i++) {
					check = false;
					if(list.get(i).equals(list.get(i+1))) {
						check = true;
						list.remove(i);
						list.remove(i);
						break;
					}
				}
				if(check == false) break;
			}
			System.out.print("#"+tc+" ");
			for(int i = 0; i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			
			
		}

	}

}
