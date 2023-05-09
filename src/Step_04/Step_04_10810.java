// https://www.acmicpc.net/problem/10810

package Step_04;

import java.util.Scanner;

public class Step_04_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basketNum = sc.nextInt();
        int count = sc.nextInt();
        int[] basket = new int[basketNum];
        int beginNum, endNum, ballNum;

        if (basketNum >= 1 && basketNum <= 100 && count >= 1 && count <= 100) {
            for (int i = 0; i < count; i++) {
                beginNum = sc.nextInt();
                endNum = sc.nextInt();
                ballNum = sc.nextInt();

                if (beginNum >= 1 && beginNum <= basketNum && endNum >= 1 && endNum <=basketNum && ballNum >=1 && ballNum <= basketNum) {
                    for (int q = beginNum-1; q < endNum; q++) {
                        basket[q] = ballNum;
                    }
                }

            }
            method10810(basket);
        } else {
            System.out.println("입력 가능한 범위 : 1 <= x,y <= 100");
        }
    }
    static void method10810(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
