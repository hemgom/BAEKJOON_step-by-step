// https://www.acmicpc.net/problem/11720

package Step_05;

import java.util.Scanner;

public class Step_05_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCount = sc.nextInt();
        String nums = sc.next();
        char[] num = nums.toCharArray();
        int sum = 0;

        if (numCount == num.length) {
            for (int i = 0; i < num.length; i++) {
                // char -> int 형변환 방법 2가지
                // 1. char 값 - '0' : 양의 정수 아스키코드 - 0의 아스키코드 = 양의 정수가 됨
                // 2. Character.getNumericValue(char a) : char 값(숫자)을 int로 변환해주는 메서드
                sum += Character.getNumericValue(num[i]);
            }
            System.out.println(sum);
        } else {
            System.out.println("처음 입력한 수 만큼 정수를 입력하시오");
        }
    }
}
