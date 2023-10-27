import java.util.*;

public class RJava06 {
    public static void main(String[] args) {
        int Data;
        try(Scanner stdin = new Scanner(System.in)){
         System.out.println("整数値を入力してください");   
         Data = stdin.nextInt();
         if(Data < 0) {
            System.out.println("負の整数です");
         } else if (Data > 0) {
            System.out.println("生の整数です");
            if ((Data % 7) == 0) {
                System.out.println("7の倍数です");
            } else {
                System.out.println("7の倍数ではありません");
            }
         } else {
            System.out.print("0です");
         }

        }
    }
}
