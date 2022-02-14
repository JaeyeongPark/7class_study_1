/*
 * SWEA 1234. 비밀번호
 */

package difficulty03;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S1234 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./input/difficulty03/input_1234.txt"));
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			char[] input = (sc.next()).toCharArray();
			List<Integer> nums = new ArrayList<>();
			boolean find = false;
			int idx = 0;
			
			// 주어진 문자열을 Integer List에 입력
			for(int i = 0; i < N; i++) {
				nums.add(input[i] - '0');
			}
			
			while(!find) {
				// List에서 원소를 제거할 경우에 index가 변동되므로 재귀 함수가 종료될 때, 탐색할 다음의 index 값을 리턴 받음
				idx = recursion(nums, idx);
				
				// while문에서 List를 끝까지 탐색한 경우 동일한 연속된 숫자의 존재 여부를 탐색
				if(idx == nums.size() - 1) {
					idx = 0;
					for(int i = 0; i < nums.size() - 1; i++) {
						if(nums.get(i) == nums.get(i + 1)) {
							find = false;
							break;
						}
						find = true;
					}
				}
			}
			
			// 결과 출력
			System.out.printf("#%d ", test_case);
			for(int i = 0; i < nums.size(); i++) {
				System.out.print(nums.get(i));
			}
			System.out.println();
		}
		sc.close();
	}
	
	public static int recursion(List<Integer> nums, int idx) {
		if(idx < 0 || idx >= nums.size() - 1) {
			return 0;
		}
		
		// 원소 제거 후 동일한 숫자가 연이어 나오면 재귀적으로 탐색하여 제거
		if(nums.get(idx) == nums.get(idx + 1)) {
			nums.remove(idx);
			nums.remove(idx);
			return recursion(nums, idx - 1);
		}
		else {
			return idx + 1;
		}
	}
}
