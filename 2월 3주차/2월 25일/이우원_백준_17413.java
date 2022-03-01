import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		StringBuffer sb = new StringBuffer();
		Stack<Character> stk = new Stack<>();

		boolean isTagStarted = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '<') {
				while (!stk.isEmpty())
					sb.append(stk.pop());
				isTagStarted = true;
				sb.append(s.charAt(i));
			} else if (s.charAt(i) == '>') {
				isTagStarted = false;
				sb.append(s.charAt(i));
			} else {
				if (isTagStarted)
					sb.append(s.charAt(i));
				else {
					if (s.charAt(i) == ' ') {
						while (!stk.isEmpty())
							sb.append(stk.pop());
						sb.append(s.charAt(i));
					} else {
						stk.add(s.charAt(i));
					}
				}
			}
		}

		while (!stk.isEmpty())
			sb.append(stk.pop());

		System.out.println(sb);
	}
}
