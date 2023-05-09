// https://www.acmicpc.net/problem/5597

package Step_04;

import java.util.Scanner;

public class Step_04_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[30];

        for (int i = 0; i < 28; i++) {
            int s = sc.nextInt()-1;
            students[s] = 1;
        }

        method5597(students);
    }
    static void method5597(int[] a) {
        for(int i = 0; i < 30; i++) {
            if (a[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
