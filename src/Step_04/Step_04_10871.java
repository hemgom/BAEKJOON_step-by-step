// https://www.acmicpc.net/problem/10871

package Step_04;

import java.util.Scanner;

public class Step_04_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int num = sc.nextInt();

        if (count >= 1 && count <= 10_000 && num >= 1 && num <= 10_000) {
            int[] nums = new int[count];

            for (int i = 0; i < count; i++) {
                nums[i] = sc.nextInt();
                if (nums[i] < num) {
                    System.out.printf("%d ", nums[i]);
                }
            }
        } else {
            System.out.println("입력 가능한 범위 : 1 <= A,B <= 10,000");
        }
    }
}
