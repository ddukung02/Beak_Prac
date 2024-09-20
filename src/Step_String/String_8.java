package Step_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class String_8 {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력을 받고 양쪽 공백을 제거합니다.
        String input = br.readLine().trim();

        // 입력이 빈 문자열일 경우 단어 개수는 0입니다.
        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            // StringTokenizer를 사용하여 공백을 기준으로 문자열을 나눕니다.
            StringTokenizer st = new StringTokenizer(input);

            // StringTokenizer의 countTokens() 메서드를 사용하여 단어의 개수를 출력합니다.
            System.out.println(st.countTokens());
        }
        br.close();

    }
}
