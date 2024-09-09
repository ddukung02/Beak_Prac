package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Array_1 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 첫 번째 입력: 정수의 개수 N
            int N = Integer.parseInt(br.readLine());

            // 두 번째 입력: N개의 정수를 공백을 기준으로 나누어 배열에 저장
            String[] numbers = br.readLine().split(" ");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            // 세 번째 입력: 찾으려고 하는 정수 v
            int v = Integer.parseInt(br.readLine());

            // 정수 v의 개수를 세기 위한 변수
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == v) {
                    count++;
                }
            }

            // 결과 출력
            bw.write(count + "\n");

            // 출력 버퍼를 모두 출력하고 리소스 해제
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
