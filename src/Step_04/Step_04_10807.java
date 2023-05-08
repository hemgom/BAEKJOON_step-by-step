// https://www.acmicpc.net/problem/10807

package Step_04;

import java.util.Scanner;

public class Step_04_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method10807 userMethod = new Method10807();

        int count = sc.nextInt();

        if (count >= 1 && count <= 100) {
            int[] nums = new int[count];
            for (int i = 0; i < count; i++) {
                int num = sc.nextInt();
                if (num >= -100 && num <= 100) {
                    nums[i] = num;
                } else {
                    System.out.println("입력 가능한 범위 : -100 <= nums <= 100");
                    break;
                }
            }
            int cellectNum = sc.nextInt();
            System.out.println(userMethod.comparison(nums, cellectNum));
        } else {
            System.out.println("입력 가능한 범위 : 1 <= n <= 100");
        }
    }
}

class Method10807 {
    int stack = 0;
    int comparison (int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                stack += 1;
            } else {
                stack += 0;
            }
        }
        return stack;
    }
}
