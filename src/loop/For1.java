package loop;

public class For1 {
    public static void main(String[] args) {

        /*
        for문은 반복 횟수가 정해져 있는 경우 주로 사용한다.
         */

        for (int i = 1; i <= 10; i ++) {
            System.out.println(i);
        }

        int endNum = 10;

        for (int i = 1; i <= endNum; i++){
            System.out.println(i);
        }

        /*
        1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
         */
        int result = 0;
        for (int i= 1; result <= 10; i++) {
            result += i;
            if (result > 10){
                System.out.println("10보다 큰 첫 값은 " + result);
            }
        }

        /*
        이렇게 초기식, 조건식, 증감식 없이도 수행 가능하다.
         */
        int sum = 0;
        int i = 1;
        for (; ;){
            sum = sum + i;
            if (sum > 10) {
                System.out.println("10보다 큰 첫 값은 " + result);
                break;
            }
            i++;
        }
    }
}
