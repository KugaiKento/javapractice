import java.util.Scanner;

public class KJava7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        System.out.printf("学籍番号を入力");
        int stnumber = scan.nextInt();
        
        System.out.printf("名前を入力してください");
        String stname = scan.next();

        System.out.printf("学籍番号: %d, 名前: %s", stnumber , stname);

        scan.close();
    }
}
