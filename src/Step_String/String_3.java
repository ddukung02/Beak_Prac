package Step_String;

import java.io.*;
import java.util.StringTokenizer;

public class String_3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());
            String S;
            char[] toChar ;
            for (int i = 0; i < T; i++) {

                S = br.readLine();
                toChar=S.toCharArray();
                bw.write(toChar[0]);
                bw.write(toChar[toChar.length-1]+"\n");
            }
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
