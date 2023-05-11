// https://www.acmicpc.net/problem/2908

package Step_05;

import java.util.Scanner;

public class Step_05_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();
        char[] newN1 = num1.toCharArray();
        char[] newN2 = num2.toCharArray();

        method2908(newN1);
        method2908(newN2);

        int sangsuN1 = method2908_2(newN1);
        int sangusN2 = method2908_2(newN2);
        int sangsuAnswer = sangsuN1 > sangusN2 ? sangsuN1 : sangusN2;

        System.out.println(sangsuAnswer);
    }
    static char[] method2908(char[] a) {
        char tmp;

        tmp = a[0];
        a[0] = a[2];
        a[2] = tmp;

        return a;
    }

    static int method2908_2(char[] a) {
        int result;
        int num100 = Character.getNumericValue(a[0]);
        int num10 = Character.getNumericValue(a[1]);
        int num = Character.getNumericValue(a[2]);

        result = (num100*100)+(num10*10)+num;

        return result;
    }
}
