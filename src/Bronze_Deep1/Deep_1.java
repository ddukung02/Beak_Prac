package Bronze_Deep1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Deep_1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            bw.write("         ,r'\"7");
            bw.newLine();
            bw.write("r`-_   ,'  ,/");
            bw.newLine();
            bw.write(" \\. \". L_r'");
            bw.newLine();
            bw.write("   `~\\/");
            bw.newLine();
            bw.write("      |");
            bw.newLine();
            bw.write("      |");
            bw.newLine();


            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
