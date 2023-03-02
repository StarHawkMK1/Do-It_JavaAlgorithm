package DoIt.JavaAlgorithm.Ch1;

public class Ex1_2_Max3Method {         // 3개의 정숫값 가운데 최댓값을 구하여 출력하기
    static int max3(int a, int b, int c) {
        int max = a;                    // 1) 우선 a값을 변수 max에 저장
        if (b > max) {                  // 2) max에 저장한 a값과 b값을 비교하여 b가 큰 경우, b를 max값으로 대체.
            max = b;
        }
        if (c > max) {                  // 3) 2)와 마찬가지로 이번엔 max에 저장된 b값과 c값을 비교하여 c가 큰 경우, c를 max값으로 대체.
            max = c;
        }
        return max;                     // 4) 최종적으로 가장 큰 max값 반환
    }

    public static void main(String[] args) {
        System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
        System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
        System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
        System.out.println("max3(3, 2, 3) = " + max3(3, 2, 3));
        System.out.println("max3(3, 3, 2) = " + max3(3, 3, 2));
        System.out.println("max3(3, 3, 3) = " + max3(3, 3, 3));
        System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
        System.out.println("max3(2, 2, 3) = " + max3(2, 2, 3));
        System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
        System.out.println("max3(2, 3, 3) = " + max3(2, 3, 3));
        System.out.println("max3(2, 3, 2) = " + max3(2, 3, 2));
        System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2));
        System.out.println("max3(1, 2, 3) = " + max3(1, 2, 3));
    }
}

// Q. a와 c의 비교는 어떻게 하는가?
// A. a와 b를 비교해서 이미 b가 크다는 결론이 나왔고, b와 c를 비교해서 c가 크다는 결론이 나왔다면, c는 비교할 필요 없이 a보다 크다
// (1, 2, 3을 놓고 잘 생각해보자. 전형적인 삼단논법이다)