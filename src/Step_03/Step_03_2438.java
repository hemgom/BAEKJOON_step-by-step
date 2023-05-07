// https://www.acmicpc.net/problem/2438

package Step_03;

import java.util.Scanner;

public class Step_03_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String star = "*";

        if (count >= 1 && count <= 100) {
            for (int i = 1; i <= count; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%s", star);
                }
                System.out.println();
            }
        } else {
            System.out.println("입력 가능 범위 : 1 <= n <= 100");
        }

    }
}
