package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array_3 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 첫 번째 입력: 정수의 개수 N
            int N = Integer.parseInt(br.readLine());

            // 두 번째 입력: N개의 정수를 공백으로 구분하여 입력받기
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // 첫 번째 값을 초기 최솟값과 최댓값으로 설정
            int min = Integer.parseInt(st.nextToken());
            int max = min;

            // N개의 정수를 순회하며 최솟값과 최댓값 계산
            for (int i = 1; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                // Math 클래스를 사용해 최솟값과 최댓값 계산
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            // 결과 출력 (최솟값과 최댓값)
            bw.write(min + " " + max + "\n");

            // 출력 버퍼를 비우고 리소스 해제
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
