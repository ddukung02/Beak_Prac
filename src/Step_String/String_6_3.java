package Step_String;

import java.io.*;

public class String_6_3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String S = br.readLine();
            int[] position = new int[26];

            for (int i = 0; i < S.length(); i++) {
                position[i] = -1;
            }

            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                int index = c - 'a';
                if (position[index] == -1) {
                    position[index] = i;
                }
            }
            for (int i = 0; i < 26; i++) {
                bw.write(position[i]+" ");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
