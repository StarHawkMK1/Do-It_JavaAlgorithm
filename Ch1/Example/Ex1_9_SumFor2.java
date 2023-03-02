package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

public class Ex1_9_SumFor2 {            // 양수만 입력받아 1부터 n까지의 합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);               // 입력한 n값이 0보다 클 때까지 do-while문 반복. 즉, 사용자가 양의 정수값을 입력할 때까지 다음 단계로 넘어가지 않도록 하는 것.
                                        // (사용자가 입력한 값이 0 또는 음의 정숫값이면 계속해서 do-while문 반복)
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
