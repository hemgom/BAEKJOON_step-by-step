// 현재 시간을 입력하고 조리에 걸리는 시간(분)을 입력하면 조리가 완료되는 시간을 출력하는 프로그램 작성

package Step_02;

import java.util.Scanner;

public class Step_02_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int cook = sc.nextInt();

        if (h >= 0 && h <= 23) {
            if (m>=0 && m <= 59) {
                if (cook >= 0 && cook <= 1000) {
                    int con = (h * 60) + m;
                    int total = con + cook;
                    int th = (total / 60) % 24;
                    int tm = total % 60;

                    System.out.printf("%d %d%n", th, tm);
                } else {
                    System.out.println("조리시간 범위 : 0 <= cook <= 1000");
                }
            } else {
                System.out.println("분의 범위 : 0 <= m <= 59");
            }
        } else {
            System.out.println("시간의 범위 : 0 <= h <= 23");
        }

    }
}
