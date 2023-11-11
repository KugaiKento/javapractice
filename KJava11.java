import java.util.Scanner;
import Class.TenfoldShifter;
public class KJava11 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("整数値を入力してください");
        int value = Scanner.nextInt();
        TenfoldShifter shifter = new TenfoldShifter(value);
        int result = shifter.getResult();
        System.out.println("10倍した結果"+result);

        Scanner.close();
    }
}
