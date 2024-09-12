package Step_String;

import java.io.*;

public class String_4 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int a  = br.read();

            System.out.println(a);

            // 출력 버퍼를 모두 출력하고 리소스 해제
            br.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
