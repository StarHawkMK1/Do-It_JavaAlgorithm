package DoIt.JavaAlgorithm.Ch2.Example;

public class Ex02_02_IntArrayInit {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};       // 배열의 생성 및 초기화를 동시에 수행

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);       // 각 요솟값 출력.
        }
    }
}
