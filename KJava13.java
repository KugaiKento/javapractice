import java.util.Scanner;
import Class.Calculator;
public class KJava13 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("一つ目の実数地を入力してください");
        double value1 = Scanner.nextDouble();
        System.out.println("二つ目の実数地を入力してください");
        double value2 = Scanner.nextDouble();
        Calculator Calculator = new Calculator(value1, value2);
        double result = Calculator.getResult();
        System.out.println("和"+result);
        result = Calculator.subtract();
        System.out.println("差"+result);
        result = Calculator.multiply();
        System.out.println("積"+result);
        result = Calculator.division();
        System.out.println("商"+result);

        Scanner.close();
    }
}