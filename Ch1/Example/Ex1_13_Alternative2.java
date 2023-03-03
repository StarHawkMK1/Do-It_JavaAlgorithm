package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// +와 -를 줄 바꿈 없이 번갈아가면서 출력하기.(반복 과정에서 조건 판단하기2.)
// 예제 1-12와 비교하기


public class Ex1_13_Alternative2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n의 값: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n / 2; i++) {
            System.out.print("+-");
        }
        if (n % 2 != 0) {
            System.out.print("+");
        }
    }
}
