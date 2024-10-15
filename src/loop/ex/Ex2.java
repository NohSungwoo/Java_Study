package loop.ex;

public class Ex2 {

    public static void main(String[] args) {

        /*
        중첩 for문을 사용해서 구구단을 완성해라.
         */

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        System.out.println();

        /*
        int rows를 선언해라.
        이 수만큼 다음과 같은 피라미드를 출력하면 된다.

        참고: println()은 출력 후 다음라인으로 넘어간다.
        라인을 넘기지 않고 출력하려면 print()를 사용하면 된다.
         */

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int star_count = 1; star_count <= i; star_count++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
