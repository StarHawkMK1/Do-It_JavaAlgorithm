package DoIt.JavaAlgorithm.Ch2.Example;

// 확장 for문: 배열의 모든 요소의 합을 구하여 출력
public class Ex02C_02_ArraySumForIn {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        double sum = 0;         // 합계를 저장하는 변수sum
        for (double i: a) {
            sum += i;
        }
        System.out.println("모든 요소의 합은 " + sum + "입니다.");
    }
}
