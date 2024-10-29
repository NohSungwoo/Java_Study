package scanner.ex;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        /*
        사용자로부터 상품 정보 (상품명, 가격, 수량)을 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요.
        사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.

        사용자에게 다음 세 가지 옵션을 제공해야 합니다.
        1. 상품 입력
        2. 결제
        3. 프로그램 종료

        옵션은 정수로 입력받으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.

        상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.

        결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0으로 초기화하세요.
        (사용자가 총 비용을 확인하고, 결제를 완료했다고 가정합니다.
        따라서 다음 사용자를 위해 총 비용을 다시 0으로 초기화 해야합니다.)

        프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다." 라는 메세지를 출력하고 프로그램을 종료하세요.

        위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요." 라는 메세지를 출력하세요.
         */
        Scanner input = new Scanner(System.in);

        String name;
        int price;
        int quantity;
        int totalPrice;
        int sum = 0;



        while (true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    input.nextLine();
                    name = input.nextLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    price = input.nextInt();

                    System.out.print("구매 수량을 입력하세요: ");
                    quantity = input.nextInt();

                    totalPrice = price * quantity;

                    sum += totalPrice;

                    System.out.println("상품명: " + name + ", 가격: " + price + ", 수량: " + quantity + ", 합계: " + totalPrice + "\n");
                    break;

                case 2:
                    System.out.println("총 비용은 " + sum + "원입니다." + "\n");
                    sum = 0;
                    break;

                case 3:
                    System.out.println("프로그램이 종료되었습니다." + "\n");
                    break;

                default:
                    System.out.println("올바른 옵션을 선택해주세요." + "\n");
                    break;
            }
        }
    }
}
