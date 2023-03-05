package DoIt.JavaAlgorithm.Ch2.Example;

public class Ex02_01_IntArray {
    public static void main(String[] args) {
        int[] a = new int[5];       // 배열의 길이가 5인 int타입 배열 a 생성.

        a[1] = 37;          // a[1]에 37 저장.
        a[2] = 51;          // a[2]에 51 저장.
        a[4] = a[1] * 2;    // a[1]에 2를 곱한 값을 a[4]에 저장.

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);       // 각 요솟값 출력.
        }
    }
}
