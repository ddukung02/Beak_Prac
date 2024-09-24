package Bronze_Deep1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Deep_4 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String S = st.nextToken();

            char[] arr = S.toCharArray();
            char[] arr2 = new char[arr.length];

            for (int i = 0; i < arr.length; i++) {
                arr2[arr.length-1-i] = arr[i];
            }

            if (Arrays.equals(arr, arr2)) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }

            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
