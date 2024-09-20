package Step_String;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_9 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());

            String S1 = st.nextToken();
            String S2 = st.nextToken();

            char[] number1=new char[3];
            char[] number2=new char[3];
            char[] number3=new char[3];
            char[] number4=new char[3];

            number1 = S1.toCharArray();
            number3 = S2.toCharArray();

            for (int i = 0; i < number1.length; i++) {
                number2[i] = number1[2-i];
            }
            for (int i = 0; i < number3.length; i++) {
                number4[i] = number3[2-i];
            }

            String S3 = new String(number2);
            String S4 = new String(number4);

            int N = Integer.parseInt(S3);
            int M = Integer.parseInt(S4);

            if (N>M){
                System.out.print(N);
            }else{
                System.out.print(M);
            }
            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
