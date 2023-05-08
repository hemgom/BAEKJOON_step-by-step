// https://www.acmicpc.net/problem/10818

package Step_04;

import java.util.Scanner;

public class Step_04_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method10818 userM = new Method10818();

        int count = sc.nextInt();
        int[] nums = new int[count];

        if (count >= 1 && count <= 1_000_000) {
            for (int i = 0; i < nums.length; i++) {
                int iNum = sc.nextInt();
                if (iNum >= -1_000_000 && iNum <= 1_000_000) {
                    nums[i] = iNum;
                } else {
                    break;
                }
            }
            userM.sortNum(nums);
            System.out.printf("%d %d", userM.minResult, userM.maxResult);
        } else {
            System.out.println("입력 가능한 범위 : 1 <= n <= 1,000,000");
        }
    }
}

class Method10818 {
    int maxResult, minResult;
    void sortNum(int[] a) {
        maxResult = a[0];
        minResult = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i-1]) {
                if (maxResult < a[i]) {
                    maxResult = a[i];
                }
            } else if (a[i] < a[i-1]) {
                if (minResult > a[i]) {
                    minResult = a[i];
                }
            }
        }
    }
}