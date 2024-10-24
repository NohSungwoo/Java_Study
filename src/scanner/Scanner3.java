package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("문자열을 입력하세요. exit: 종료: ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println(str);
        }


        while (true){
            System.out.println("숫자를 두 개 입력하세요.");

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;

            if(num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println(sum);
        }


        int sum = 0;

        while (true){
            System.out.println("숫자를 입력하세요. 0을 입력하면 프로그램이 종료됩니다.");

            int num = scanner.nextInt();
            sum += num;

            if (num == 0) {
                System.out.println("입력한 수의 총 합은: " + sum);
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
