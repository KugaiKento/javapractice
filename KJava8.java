import java.util.Scanner;

public class KJava8 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("体重を入力してください");
        double bweight = Scanner.nextDouble();
        System.out.print("身長を入力してください");
        double height = Scanner.nextDouble();

        double bmi = 0;
        bmi = bweight / (height * 2);
        bmi = bmi * 100;

        System.out.printf("%.2f",bmi);

        Scanner.close();

    }
}
