import java.util.Scanner;

public class RJava05 {
    public static void main(String[] args) {
        int Data1, Data2;
        try(Scanner stdin = new Scanner(System.in)) {
            System.out.println("一つ目の整数を入力してください");
            Data1 = stdin.nextInt();
            System.out.println("二つ目の整数を入力してください");
            Data2 = stdin.nextInt();
            System.out.printf("%d+%d=%d%n", Data1,Data2, Data1 + Data2);
            System.out.printf("%d+%d=%d%n", Data1,Data2, Data1 - Data2);
            System.out.printf("%d+%d=%d%n", Data1,Data2, Data1 * Data2);
            System.out.printf("%d+%d=%d%n", Data1,Data2, Data1 / Data2);
            System.out.printf("%d+%d=%d%n", Data1,Data2, Data1 % Data2);
        }
    }
}
