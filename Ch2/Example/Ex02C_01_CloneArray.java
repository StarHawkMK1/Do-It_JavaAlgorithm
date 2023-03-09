package DoIt.JavaAlgorithm.Ch2.Example;

// 배열의 복제

import java.util.Arrays;

public class Ex02C_01_CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();        // '배열이름.clone()': clone()메서드를 호출하여 배열을 복제 -> b는 a의 복제를 참조

        b[3] = 0;       // 한 요소에만 0을 대입

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
