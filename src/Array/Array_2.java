package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Array_2 {
    public static void main(String[] args) {
        try {
            // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] s = br.readLine().split(" ");

            int N = Integer.parseInt(s[0]);
            int X = Integer.parseInt(s[1]);
            // 두 번째 입력: N개의 정수를 공백을 기준으로 나누어 배열에 저장
            String[] numbers = br.readLine().split(" ");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }
            // 정수 v의 개수를 세기 위한 변수

            for (int i = 0; i < N; i++) {
                if (arr[i] < X) {
                    bw.write(arr[i] + " ");
                }
            }

            // 출력 버퍼를 모두 출력하고 리소스 해제
            bw.flush();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
