package Step_String;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String M = sc.nextLine();
        char array[];
        array = M.toCharArray();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i]-'0';
        }
        System.out.println(sum);
    }
}
