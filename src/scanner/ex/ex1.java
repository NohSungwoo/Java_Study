package scanner.ex;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요");
        String name = scanner.nextLine();

        System.out.println("당신의 나이를 입력하세요");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + "이고 당신의 나이는 " + age + "살입니다.");
        System.out.println("\n" + "프로그램 종료");


        /*
        사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
         */
        System.out.println("정수를 입력해주세요");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "은 짝수입니다.");
        }else {
            System.out.println(num + "은 홀수입니다.");
        }

        System.out.println("\n" + "프로그램 종료");
    }
}
