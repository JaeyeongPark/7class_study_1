import java.util.Scanner;
import java.util.Stack;

public class B17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<Character>();
        char tmp;
        String result= "";
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            tmp = str.charAt(i);

            // '<'과 '>' 사이에 있는 문자는 그대로 출력
            if (tmp == '<'){
                // '<'를 만나기 전에 스택에 문자가 담겨있다면, 스택에 있는 값들 뽑아내기
                // <ab cd>ef gh<ij kl>
                if (!stack.isEmpty()){
                    while (!stack.isEmpty())
                        result += stack.pop();
                }
                flag = true;
                result+=tmp;
            }
            else if (tmp == '>'){
                flag = false;
                result+=tmp;
            }
            else if (flag){  // 괄호 안 문자라면
                result+=tmp;
            }
            else if (!flag && tmp == ' '){  // 괄호 밖 문자면서 공백을 만났다면
                while (!stack.isEmpty())  result+=stack.pop(); // 스택을 전부 비우면서 문자 뒤집기
                result += tmp;
            }
            else if (!flag){ // 괄호 밖 문자라면
                stack.add(tmp);
            }
        }

        // 스택에 남은 문자 pop
        if (!stack.isEmpty()){
            while (!stack.isEmpty())  result+=stack.pop();
        }

        System.out.println(result);
    }
}
