// 複合代入演算子
// +=（加算代入）
// -=（減算代入）
// *=（乗算代入）
// /=（除算代入）
// %=（剰余算代入
// ++（インクリメント）
// –（デクリメント）

import java.util.Scanner;

public class KJava10 {
    public static void main(String[] args) {
        int num;
        Scanner Scanner =  new Scanner(System.in);
        System.out.println("一つ目の値を入力してください");
        int mc1 = Scanner.nextInt();
        System.out.println("二つ目の値を入力してください");
        int mc2 = Scanner.nextInt();
        num = mc1 * mc2;
        System.out.println(num);
    }
}
