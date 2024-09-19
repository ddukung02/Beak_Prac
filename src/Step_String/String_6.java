package Step_String;

import java.io.*;
import java.util.Arrays;

public class String_6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String S = br.readLine();

            for (char i = 'a'; i <= 'z'; i++) {
                bw.write(S.indexOf(i)+" ");
            }

            bw.flush();
            br.close();
            bw.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
