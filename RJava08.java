import java.util.Scanner;

public class RJava08 {
    public static void main(String[] args) {
        int [][] Data; //二次元配列
        int[] Count;//配列の宣言
        try(Scanner stdin = new Scanner(System.in);) {
        // stdin.close();
        Data = new int[4][];
        for (int i = 0; i < 4; i++) {
            Data[i] = new int[4];
        }

        Count = new int[3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                do{
                    System.out.printf("%d行%d列の値を入力してください-->",i,j);
                    Data[i][j] = stdin.nextInt();
                } while((Data[i][j] < -1) || (Data[i][j] > 1));
            }
        }
        for(int i = 0; i < 3; i++) {
            Count[i] = 0;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5", Data[i][j]);
                Count[Data[i][j] + 1]++;
            }
            System.out.printf("%n");
            System.out.printf("%3d | ", i - 1);
            for (int j = 0; j < Count[i]; j++) {
                System.out.printf("*");
            }
            System.out.printf("%n");
        }
        }
        
        
    }
}
