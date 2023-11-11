import java.util.Scanner;
import Class.AbsoluteValueCalculator;
public class KJava12 {
    public static void main(String[] args) {
        System.out.println("数値を入力してください");
        Scanner Scanner = new Scanner(System.in);
        int value = Scanner.nextInt();
        AbsoluteValueCalculator absolute = new AbsoluteValueCalculator(value);
        int result = absolute.getresult();
        System.out.println(result);
        Scanner.close();
    }
}