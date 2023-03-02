package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 1부터 n까지 정수의 합 구하기.

public class Ex1_7_SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = sc.nextInt();

        int sum = 0;            // 합을 구하기 위해 필요한 변수를 초기화.
        int i = 1;

        while(i <= n) {         // (n 대신에 sc.nextInt() 사용하면 X)
            sum += i;           // i값이 n에 도달할 때까지 sum에 값을 누적시킴. (합을 구하기 위한 식)
            i++;                // i부터 n까지의 합을 구하기 위해 i값이 n에 도달할 때까지 계속해서 1씩 증가시킴.
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
