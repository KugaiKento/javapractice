import Class.SeasonDetector;
import java.util.Scanner;
public class KJava17 {
    public static void main(String[] args) {
        System.out.println("月を入力してください");
        Scanner Scanner = new Scanner(System.in);
        int month = Scanner.nextInt();
        SeasonDetector season = new SeasonDetector(month);
        String result = season.month2();
        System.out.println(result);
        Scanner.close();
    }
}