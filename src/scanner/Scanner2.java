package scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("두 숫자의 합은: " + sum);


        /*
        사용자로부터 두 개의 정수를 입력받고,
        더 큰 수를 출력하는 프로그램을 작성해보자.
        두 숫자가 같은 경우 두 숫자는 같다고 출력하면 된다.
         */
        if (num1 > num2) {
            System.out.println("더 큰 수는: " + num1);
        } else if (num1 < num2) {
            System.out.println("더 큰 수는: " + num2);
        } else {
            System.out.println("두 숫자는 같다");
        }


    }
}
