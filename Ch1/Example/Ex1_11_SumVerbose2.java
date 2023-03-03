package DoIt.JavaAlgorithm.Ch1;

import java.util.Scanner;

public class Ex1_11_SumVerbose2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n의 값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.println(i + " + ");
            sum += i;
        }
        System.out.println(n + " = ");
        sum += n;
        System.out.println(sum);
    }
}
