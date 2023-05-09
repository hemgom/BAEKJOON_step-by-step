// https://www.acmicpc.net/problem/10813

package Step_04;

import java.util.Scanner;

public class Step_04_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basketNum = sc.nextInt();
        int count = sc.nextInt();
        int[] basket = new int[basketNum];
        int ball1, ball2, balltmp;

        if (basketNum >= 1 && basketNum <= 100 && count >= 1 && count <= 100) {
            method10813_2(basket);

            for (int i = 0; i < count; i++) {
                ball1 = sc.nextInt();
                ball2 = sc.nextInt();

                if (ball1 >= 1 && ball1 <= basketNum && ball2 >= 1 && ball2 <=basketNum) {
                    balltmp = basket[ball1-1];
                    basket[ball1-1] = basket[ball2-1];
                    basket[ball2-1] = balltmp;
                }

            }
            method10813(basket);
        } else {
            System.out.println("입력 가능한 범위 : 1 <= x,y <= 100");
        }
    }
    static void method10813(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
    static void method10813_2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
    }
}
