// https://www.acmicpc.net/problem/2444

package Step_06;

import java.util.Scanner;

public class Step_06_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        char space = ' ';
        int spaceNum1 = num;
        int spaceNum2 = 2;

        if (num >= 1 && num <= 100) {
            for (int i = 0; i < num-1; i++) {
                for (int j = spaceNum1-1; j > 0; j--) {
                    System.out.printf("%c", space);
                }
                method2444_01(i);
                System.out.println();
                spaceNum1 -= 1;
            }

            method2444_01(num-1);
            System.out.println();

            for (int z = num-2; z >= 0; z--) {
                for (int x = 1; x <= spaceNum2-1; x++) {
                    System.out.printf("%c", space);
                }
                method2444_02(z);
                System.out.println();
                spaceNum2 += 1;
            }

        }
    }
    static void method2444_01(int a) {
        char star = '*';
        for (int i = 1; i <= a*2+1; i++) {
            System.out.printf("%c", star);
        }
    }
    static void method2444_02(int a) {
        char star = '*';
        for (int i = a*2+1; i > 0 ; i--) {
            System.out.printf("%c", star);
        }

    }
}
