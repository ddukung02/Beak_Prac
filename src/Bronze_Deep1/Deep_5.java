package Bronze_Deep1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Deep_5 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String S = st.nextToken();
            int[] count=new int[S.length()];
            int number=0;
            int number2=0;
            char resultC=Character.toUpperCase(S.charAt(0));


            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < S.length(); j++) {
                    if (Character.toUpperCase(S.charAt(i)) == Character.toUpperCase(S.charAt(j))) {
                        count[i]++;
                    }
                }
            }

            for (int i = 0; i < S.length(); i++) {
                if (count[i]>count[number]){
                    number=count[i];
                    number2=i;
                    resultC=Character.toUpperCase(S.charAt(i));
                }
            }

            for (int i = 0; i < S.length(); i++) {
                if (Character.toUpperCase(S.charAt(i)) == resultC){
                    continue;
                }
                if (count[i]==count[number2]){
                    resultC='?';
                }
            }


            bw.write(resultC);
            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
