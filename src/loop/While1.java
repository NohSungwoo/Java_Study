package loop;

public class While1 {
    public static void main(String[] args) {
        int count = 0;

        count += 1;
        System.out.println("현재 숫자는: " + count);
        count += 1;
        System.out.println("현재 숫자는: " + count);
        count += 1;
        System.out.println("현재 숫자는: " + count);

        count = 0;

        while (count < 3){
            count += 1;
        }

        System.out.println(count);
    }
}
