package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값을 구하여 출력하기

public class Ex1_1_Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");

        System.out.print("a의 값: ");
        int a = sc.nextInt();

        System.out.print("b의 값: ");
        int b = sc.nextInt();

        System.out.print("c의 값: ");
        int c = sc.nextInt();

        int max = a;            // 1) 우선 a값을 변수 max에 저장
        if (b > max) {          // 2) max에 저장한 a값과 b값을 비교하여 b가 큰 경우 b를 max값으로 대체.
            max = b;
        }
        if (c > max) {          // 3) 2)와 마찬가지로 이번엔 max에 저장된 b값과 c값을 비교하여 c가 큰 경우, c를 max값으로 대체.
            max = c;
        }

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
