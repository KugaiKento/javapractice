import java.util.Scanner;

public class KJava9 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("数値を入力してください");
        double num = Scanner.nextDouble();
        System.out.println(num);
        
        double roundNum = Math.round(num / 100) * 100;
        System.out.println(roundNum);
        Scanner.close();
    }
}
