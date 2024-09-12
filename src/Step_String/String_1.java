package Step_String;

import java.io.*;

public class String_1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String S = br.readLine();
            int i = Integer.parseInt(br.readLine());

            System.out.println(S.charAt(i-1));
            // 출력 버퍼를 모두 출력하고 리소스 해제
            bw.flush();
            br.close();
            bw.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
