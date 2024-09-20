package Step_String;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_10 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            char[] a;
            a = S.toCharArray();

            System.out.println();

            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
