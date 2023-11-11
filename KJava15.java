import java.util.Scanner;
import Class.ValueComparator;
public class KJava15 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("一つ目の数値を入力してください");
        int value1 = Scanner.nextInt();
        System.out.println("二つ目の数値を入力してください");
        int value2 = Scanner.nextInt();
        ValueComparator Comparator = new ValueComparator(value1,value2);
        Comparator.Comparator();
        Scanner.close();
    }
}