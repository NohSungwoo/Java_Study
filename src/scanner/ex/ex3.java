package scanner.ex;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        /*
        변수 a = 10이 들어있고
        b = 20이 들어있다.
        변수 a와 b의 값을 서로 바꾸어라.

        다음 코드에서 시작과 종료 부분 사이에
        변수의 값을 교환하는 코드를 작성하면 된다.
         */

        int a = 10;
        int b = 20;
        int temp;

        temp = b;

        b = a;
        a = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();


        /*
        사용자로부터 두 개의 정수를 입력받고,
        이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.

        - 사용자에게 첫 번째 숫자를 입력받으세요. 변수의 이름은 num1이어야 합니다.
        - 사용자에게 두 번째 숫자를 입력받으세요. 변수의 이름은 num2이어야 합니다.
        - 만약 첫 번째 숫자 num1이 두 번째 숫자 num2보다 크다면, 두 숫자를 교환하세요.
        - num1 부터 num2까지의 각 숫자를 출력하세요.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("num1이 num2보다 큽니다. num2와 num1의 값이 바뀌게 됩니다.");
            System.out.println("num1: " + num1);
            System.out.println("num2: " + num2);
        }else {
            System.out.println("num1: " + num1);
            System.out.println("num2: " + num2);
        }

        System.out.print("두 숫자 사이의 모든 정수: ");

        for (int i = num1 + 1; i < num2; i++){
            System.out.print(i);

            if (i != num2 - 1) {
                System.out.print(", ");
            }
        }

    }
}
