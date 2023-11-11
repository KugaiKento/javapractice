import java.util.Scanner;
import Class.DivisibilityChecker;
public class KJava14 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("一つ目の整数値を入力して下さい");
        int value1 = Scanner.nextInt();
        System.out.println("二つ目の整数値を入力して下さい");
        int value2 = Scanner.nextInt();
        DivisibilityChecker Check = new DivisibilityChecker(value1, value2);
        double result = Check.result();
        if (result == 0) {
            System.out.println(value1+"は"+value2+"の約数である");
        }else{
            System.out.println(value1+"は"+value2+"の約数ではない");
        }
        
        Scanner.close();
    }
}