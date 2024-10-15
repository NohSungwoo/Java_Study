package loop.ex;

public class Ex1 {

    public static void main(String[] args) {

        /*
        처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요.
        이 때 count라는 변수를 사용해야 합니다.
        while문, for문 2가지 버전의 정답을 만들어야 합니다.
         */

        int count = 1;

        while (count <= 10) {
            System.out.println("while: " + count ++);
        }

        System.out.println();

        count = 1;

        for (; count <= 10; count ++) {
            System.out.println("for: " + count);
        }

        System.out.println();

        /*
        반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요.
        이 때, num 이라는 변수를 사용하여 수를 표현해야 합니다.
        while문, for문 2가지 버전의 정답을 만들어야 합니다.
         */
        count = 1;
        int num = 0;
        while (count <= 10) {
            num += 2;
            System.out.println("while문 " + count + "짝수: " + num);
            count ++;
        }

        System.out.println();

        /*
        이것도 가능은 한데 보기 지저분해서
        동작 조건과 관련이 있는 게 아니면
        변수를 밖으로 빼는 게 낫다.
         */
        for (count = 1, num = 0; count <= 10; count ++, num += 4) {
            System.out.println("for문 " + count + "짝수: " + num);
        }

        System.out.println();

        /*
        반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요.
        이 때, sum이라는 변수를 사용하여 누적합을 표현하고,
        i라는 변수를 사용하여 카운트 (1부터 max까지 증가하는 변수)를 수행해야 합니다.
        while문, for문 2가지 버전의 정답을 만들어야 합니다.
         */

        int max = 10;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            System.out.println("while문 " + sum);
            i++;
        }

        System.out.println();

        max = 10;
        sum = 0;
        for (i = 1; i <= max; i++) {
            sum += i;
            System.out.println("for문 " + sum);
        }
    }
}
