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
            int[] remain = new int[11];
            int count = 0;
            // 10개의 숫자를 입력받고, 42로 나눈 나머지를 저장
            for (int i = 1; i < 11; i++) {
                int num = Integer.parseInt(br.readLine());
                remain[i] = num % 42;
            }

            // 중복을 확인하여 서로 다른 나머지 개수를 세기 위한 반복문
            for (int i = 0; i < 11; i++) {
                boolean unique = true;
                for (int j = 0; j < i; j++) {
                    if (remain[i] == remain[j]) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
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
