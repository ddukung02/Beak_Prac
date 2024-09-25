package Bronze_Deep1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Deep_7 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N=Integer.parseInt(br.readLine());
            String[] words = new String[N];

            for (int i = 0; i < N; i++) {
                words[i] = br.readLine();
            }

            char[] W0 = words[0].toCharArray();

            for (int i = 1; i < W0.length; i++) {

            }





            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
