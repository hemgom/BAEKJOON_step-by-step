// https://www.acmicpc.net/problem/3052

package Step_04;

import java.util.Scanner;

public class Step_04_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] remain = new int[10];
        int num;

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num > 0 && num <= 1000) {
                remain[i] = num % 42;
            }
        }
        System.out.println(method3052(remain));
    }
    static int method3052(int[] a) {
        int result = 0;
        int[] remainNum = new int[42];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < remainNum.length; j++) {
                if (j == a[i]) {
                    remainNum[j] = 1;
                }
            }
        }

        for (int v = 0; v < remainNum.length; v++) {
            if (remainNum[v] > 0) {
                result += 1;
            }
        }

        return result;
    }
}
