package scanner.ex;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        /*
        사용자로부터
        음식의 이름(foodName),
        가격(foodPrice),
        수량(foodQuantity)를 입력받아
        주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.

        음식의 총 가격을 계산하세요.
        총 가격은 각 음식의 가격(foodPrice)과 수량(foodQuantity)을 곱한 값이며
        이를 totalPrice 라는 이름의 변수에 저장하세요.

        주문 정보와 총 가격을 출력하세요.
        출력 형태는 "[음식 이름][수량]개를 주문하셨습니다. 총 가격은 [총 가격]원입니다."이어야 합니다.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("음식의 이름을 입력하세요: ");
        String foodName = scanner.nextLine();

        System.out.print("주문하신 음식의 가격을 입력하세요: ");
        int foodPrice = scanner.nextInt();

        System.out.println("주문하실 수량을 입력하세요: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");

    }
}