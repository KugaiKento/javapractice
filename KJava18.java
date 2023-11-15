import java.util.Scanner;
import Class.Translator;
public class KJava18 {
    //連想配列
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("色名の入力してください");
        String input = Scanner.nextLine();
        String output = Translator.translateCOlor(input);
        System.out.println(output);

        Scanner.close();
    }
}