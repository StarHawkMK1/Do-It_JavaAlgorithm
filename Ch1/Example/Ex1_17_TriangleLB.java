package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 이중 루프를 활용하여 왼쪽 아래가 직각인 직각이등변삼각형 출력하기.
public class Ex1_17_TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        do {    // 직각이등변삼각형의 단 수 입력/출력하기
            System.out.print("몇 단 삼각형입니까?: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {          // 행 루프(세로 방향 반복).
            for (int j = 1; j <= i; j++) {      // 열 루프(가로 방향 반복).
                System.out.print("*");
            }
            System.out.println();
        }                          // 이 삼각형을 위에서부터 1~n행이라고 하면, i행에는 *를 i개 출력하고, 마지막 n행에는 *를 n개 출력.
    }
}

