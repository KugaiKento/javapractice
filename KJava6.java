import java.util.*;
public class KJava6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("年を入力してください: ");
        int year = scanner.nextInt();

        System.out.print("月を入力してください: ");
        int month = scanner.nextInt();

        System.out.print("日を入力してください: ");
        int day = scanner.nextInt();

        System.out.printf("年：%d, 月：%d, 日：%d%n", year, month, day);

        scanner.close();
    }
}