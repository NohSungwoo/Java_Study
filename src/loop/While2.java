package loop;

public class While2 {
    public static void main(String[] args) {
        int num = 1;
        int result = 0;

        while (num < 4){
            result += num;
            num ++;
        }

        System.out.println(result);


        num = 1;
        result = 0;
        int endNum = 100;

        while (num != endNum + 1){
            result += num;
            num ++;
        }

        System.out.println(result);

    }
}
