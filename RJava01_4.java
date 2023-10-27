import java.util.*;
public class RJava01_4{
    public static void main(String[] args) {
        //リソースリークを防ぐため
        try(Scanner stdin= new Scanner(System.in)){
            System.out.print("一つ目の値を入力してください");
            int num = stdin.nextInt();
            System.out.print("二つ目の値を入力してください");
            int num2 = stdin.nextInt();
        
             System.out.println(num+"+"+num2+"の答えは"+(num + num2));
        };
    }
}