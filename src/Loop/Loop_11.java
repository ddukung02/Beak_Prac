package Loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Loop_11 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;
            // EOF가 올 때까지 반복
            while ((line = br.readLine()) != null) {
                // 한 줄을 공백으로 나누어 A와 B를 추출
                String[] input = line.split(" ");
                int A = Integer.parseInt(input[0]);
                int B = Integer.parseInt(input[1]);

                // A + B 결과 출력
                System.out.println(A + B);
            }

            // 리소스 해제
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
