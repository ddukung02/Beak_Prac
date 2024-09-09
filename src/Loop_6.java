import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Loop_6 {
    public static void main(String[] args) {
        try {
            // BufferedReader와 BufferedWriter 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 첫 줄에서 테스트 케이스의 개수 입력
            int T = Integer.parseInt(br.readLine());

            // 테스트 케이스만큼 반복
            for (int i = 0; i < T; i++) {
                // 두 정수 A와 B 입력받기
                String[] input = br.readLine().split(" ");
                int A = Integer.parseInt(input[0]);
                int B = Integer.parseInt(input[1]);

                // 결과를 버퍼에 저장
                bw.write((A + B) + "\n");
            }

            // 출력 버퍼를 모두 출력 (flush)
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 오류 메시지 출력
        }
    }
}
