package scanner.ex;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        /*
        사용자로부터 상품의 가격(price)과 수량(quantity)을 입력받고
        총 비용을 출력하는 프로그램을 작성하세요.
        가격과 수량을 입력받은 후에는 이들의 곱을 출력하세요.
        출력 형태는 "총 비용: [곱한결과]"여야 합니다.
        -1을 입력하여 가격 입력을 종료합니다.
         */

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("가격을 입력하세요: ");
            int price = input.nextInt();

            if (price == -1) {
                break;
            }

            System.out.println("수량을 입력하세요: ");
            int quantity = input.nextInt();
            int totalPrice = price * quantity;

            System.out.println("총 비용: " + totalPrice + "\n");
        }
    }
}
