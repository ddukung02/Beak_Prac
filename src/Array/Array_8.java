package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Array_8 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 나머지를 저장할 배열 선언
            int[] remain = new int[10];
            int count = 0;

            // 10개의 숫자를 입력받고, 42로 나눈 나머지를 저장
            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(br.readLine());
                remain[i] = num % 42;
            }

            // 중복을 확인하여 서로 다른 나머지 개수를 세기 위한 반복문
            for (int i = 0; i < 10; i++) {
                boolean isUnique = true;  // 나머지가 중복되었는지 확인하는 변수
                for (int j = 0; j < i; j++) {  // 현재까지의 값을 비교
                    if (remain[i] == remain[j]) {
                        isUnique = false;  // 중복된 값이 있으면 false로 설정
                        break;
                    }
                }
                if (isUnique) {  // 중복되지 않은 값일 경우 count 증가
                    count++;
                }
            }

            // 결과 출력
            System.out.println(count);

            br.close();  // 리소스 해제
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
