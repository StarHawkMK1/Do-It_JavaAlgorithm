//package DoIt.JavaAlgorithm.Ch2.Example;
//
//// 1000이하의 소수를 나열하기1.
//public class Ex02_07_PrimeNum1 {
//    public static void main(String[] args) {
//        int counter = 0;        // 나눗셈의 횟수
//
//        for (int n = 2; n <= 1000; n++) {
//            int i;
//            for (int i = 2; i < n; i++) {
//                counter++;
//                if (n % i == 0)     // 나누어 떨어지면 소수가 아님.
//                    break;          // 반복은 더 이상 불필요
//            }
//            if (n == 1)             // 마지막까지 나누어 떨어지지 않음
//                System.out.println(n);
//        }
//        System.out.println("나눗셈을 수행한 횟수: " + counter);
//    }
//}
