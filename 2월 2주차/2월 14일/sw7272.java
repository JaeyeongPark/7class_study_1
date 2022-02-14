package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sw7272 {
	static String[] zero = {"C","E","F","G","H","I","J","K","L","M","N","S","T","U","V","W","X","Y","Z"};
	static String[] one = {"A","D","O","P","Q","R"};
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("7272.txt"));

		int T = sc.nextInt();
		
		
		for (int tc = 1; tc <= T; tc++) {
			String a = sc.next();
			String b = sc.next();
			String result = "SAME"; // 기본값
			char aa;
			char bb;
			
			// 글자수가 다르면 다른 문자
			if (a.length()!=b.length()) {
				result = "DIFF";
				System.out.printf("#%d %s\n", tc, result);
				continue;
			}
			
			// 하나씩 확인
			for (int i = 0; i < a.length(); i++) {
				aa = a.charAt(i);
				bb = b.charAt(i);
				
				if (aa=='B' && bb=='B') continue; // B==B면 pass
				
				// 두 글자의 구멍개수가 다르면 "DIFF"로 결과를 바꾸고 반복문 종료
				// 만약 모든 if문 조건에서 false면 "SAME"유지
				// contains를 통해 해당 문자가 들어있는지 확인
				if (Arrays.asList(zero).contains(String.valueOf(aa))!=Arrays.asList(zero).contains(String.valueOf(bb))) {
					result = "DIFF";
					break;
				}else if (Arrays.asList(one).contains(String.valueOf(aa))!=Arrays.asList(one).contains(String.valueOf(bb))) {
					result = "DIFF";
					break;
				}
			}
			
			System.out.printf("#%d %s\n", tc, result);
		}
	}

}
