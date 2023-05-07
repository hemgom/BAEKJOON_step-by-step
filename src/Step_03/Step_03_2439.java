// https://www.acmicpc.net/problem/2439

package Step_03;

import java.util.Scanner;

public class Step_03_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int subcount = count;
        String nuLL = " ";

        if (count >= 1 && count <= 100) {
            for (int i = 1; i <= count; i++) {
                for (int j = subcount-1; j > 0; j--) {
                    System.out.printf("%s", nuLL);
                }
                afor(i);
                System.out.println();
                subcount -= 1;
            }
        } else {
            System.out.println("입력 범위 : 1 <= n <= 100");
        }

    }
    static void afor (int a) {
        String star = "*";
        for (int i = 1; i <= a; i++) {
            System.out.printf("%s", star);
        }
    }
}
