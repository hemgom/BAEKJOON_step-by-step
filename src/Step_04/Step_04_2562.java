// https://www.acmicpc.net/problem/2562

package Step_04;

import java.util.Scanner;

public class Step_04_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 9;
        int[] nums = new int[9];

        for (int i = 0; i < 9; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] < 100 && nums[i] > 0) {
            } else {
                System.out.println("입력 가능한 범위 : 0 < n < 100");
            }
        }
        System.out.printf("%d%n%d%n", Method2562(nums)[0], Method2562(nums)[1]);
    }

    static int[] Method2562(int[] a) {
        int maxNum = a[0];
        int index = 0;
        int[] result = new int[2];
        for (int i = 1; i < a.length; i++) {
            if (maxNum < a[i]) {
                maxNum = a[i];
                index = i;
            }
        }
        result[0] = maxNum;
        result[1] = index+1;
        return result;
    }
}
