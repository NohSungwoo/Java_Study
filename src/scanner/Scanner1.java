package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 : " + str);

        System.out.println("정수를 입력하세요: ");
        int intVar = scanner.nextInt();
        System.out.println("intVar = " + intVar);

        System.out.println("실수를 입력하세요: ");
        double doubleVar = scanner.nextDouble();
        System.out.println("doubleVar = " + doubleVar);
    }
}
