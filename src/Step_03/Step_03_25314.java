// 문제 : https://www.acmicpc.net/problem/25314

package Step_03;

import java.util.Scanner;

public class Step_03_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 4 && n <= 1000 && n%4 == 0) {
            for (int i = 0; i < n/4; i++) {
                String t = "long";
                System.out.printf("%s ", t);
            }
            System.out.println("int");
        } else {
            System.out.println("n의 범위 : 4 <= n <= 1000, n은 4의 배수");
        }
    }
}
