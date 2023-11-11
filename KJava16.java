import Class.SeasonDetector;
import java.util.Scanner;
public class KJava16 {
    public static void main(String[] args) {
        System.out.println("月の入力してください");
        Scanner Scanner = new Scanner(System.in);
        int month = Scanner.nextInt();
        SeasonDetector season = new SeasonDetector(month);
        season.month();
    }
}