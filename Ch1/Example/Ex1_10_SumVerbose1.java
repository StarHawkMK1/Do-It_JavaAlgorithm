package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

// 1부터 n까지의 합과 그 값을 구하는 과정 출력하기.(반복 과정에서 조건 판단하기1)
// 예제 1-10과 1-11 비교하기

public class Ex1_10_SumVerbose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n의 값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i < n) {
                System.out.print(i + " + ");            // i가 n보다 작을 때 반복할 과정 (변수 i값 뒤에 '+'를 출력)
            } else {
                System.out.print(i + " = ");            // i와 n이 같아지면 출력할 문장 (변수 i값 뒤에 '='를 출력)
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
