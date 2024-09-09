import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Loop_11 {
    public static void main(String[] args) {
        try {
            // BufferedReader 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;

            // EOF가 올 때까지 반복
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                // 입력받은 한 줄을 공백으로 분리
                String[] input = line.split(" ");
                int A = Integer.parseInt(input[0]);
                int B = Integer.parseInt(input[1]);

                // A + B 출력
                System.out.println(A + B);
            }

            // 리소스 해제
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
