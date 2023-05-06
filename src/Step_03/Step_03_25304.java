// 첫째 줄에는 영수증에 적힌 총 금액
// 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수
// 이후에는 물건의 가격과 구매한 물건의 수
// 총 금액과 입력한 금액의 같다면 Yes를 다르다면 No를 출력하는 프로그램을 작성하라

package Step_03;

import java.util.Scanner;

public class Step_03_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalP = sc.nextInt();
        int kind = sc.nextInt();
        int[] eachP = new int[kind];

        for (int i = 0; i < kind; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();

            if (price >= 1 && price <= 1_000_000) {
                if (count >= 1 && count <= 10) {
                    eachP[i] = price * count;
                } else {
                    System.out.println("물건 개수의 범위 : 1 <= count <= 10");
                }
            } else {
                System.out.println("물건 가격의 범위 : 1 <= price <= 1,000,000");
            }
        }

        if (totalP >= 1 && totalP <= 1_000_000_000) {
            if (kind >= 1 && kind <= 100) {
                if (totalP == sumP(eachP)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("물건 종류 개수 입력 범위 : 1 <= 종류 개수 <= 100");
            }
        } else {
            System.out.println("총 금액 입력 범위 : 1 <= 총 금액 <= 1,000,000,000");
        }
    }

    static int sumP (int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
