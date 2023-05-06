// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
// 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

package Step_03;

import java.util.Scanner;

public class Step_03_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 1 && num <= 10000) {
            System.out.println(toNsum(num));
        } else {
            System.out.println("입력 가능 범위 : 1 <= n <= 10000");
        }

    }

    static int toNsum (int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
