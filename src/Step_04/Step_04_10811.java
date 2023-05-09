// https://www.acmicpc.net/problem/10811

package Step_04;

import java.util.Scanner;

public class Step_04_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basket = sc.nextInt();
        int count = sc.nextInt();
        int[] basketNum = new int[basket];

        if (basket >= 1 && basket <= 100) {
            for (int i = 0; i < basket; i++) {
                basketNum[i] = i+1;
            }
        }

        if (count >= 1 && count <= 100) {
            for (int j = 0; j < count; j++) {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                method10811(basketNum, num1, num2);
            }
        }

        for (int i = 0; i < basketNum.length; i++) {
            System.out.printf("%d ", basketNum[i]);
        }
    }
    static int[] method10811(int[] a, int b, int c) {
        int index1 = b-1;
        int index2 = c-1;
        int[] result = new int[c-(b-1)];
        int j = 0;

        for (int i = index2; i >= index1; i--) {
            result[j] = a[i];
            j += 1;
        }

        for (int v = 0; v < result.length; v++) {
            a[index1] = result[v];
            index1 += 1;
        }

        return a;
    }
}
