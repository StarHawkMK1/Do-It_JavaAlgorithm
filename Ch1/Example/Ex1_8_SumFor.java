package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 1부터 n까지 정수의 합 구하기.

public class Ex1_8_SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        int n = sc.nextInt();

        int sum = 0;        // 합을 구하기 위해 필요한 변수를 초기화.
        for (int i = 1; i <= n; i++) {
            sum += i;       // i값이 1부터 n에 도달할 때까지 sum에 누적해서 더해 나감. (합을 구하기 위한 식)
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
