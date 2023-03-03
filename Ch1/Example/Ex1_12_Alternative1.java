package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// +와 -를 줄 바꿈 없이 번갈아가면서 출력하기.(반복 과정에서 조건 판단하기2.)
// 예제 1-13과 비교하기

public class Ex1_12_Alternative1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n의 값: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            if (i % 2 ==0) {
                System.out.print("+");      // 입력값이 짝수인 경우, '+' 출력
            } else {
                System.out.print("-");      // 입력값이 홀수인 경우, '-' 출력
            }
        }
    }
}
