// https://www.acmicpc.net/problem/2675

package Step_05;

import java.util.Scanner;

public class Step_05_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int repeat = sc.nextInt();
            String s = sc.next();
            char[] newS = s.toCharArray();

            for (int j = 0; j < newS.length; j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.printf("%c", newS[j]);
                }
            }
            System.out.println();
        }
    }
}
