import java.util.Scanner;

public class RJava04 {
    public static void main(String[] args) {
        String Name;
        int Age;
        try(Scanner stdin= new Scanner(System.in)){
        System.out.printf("氏名を入力してください-->");
        Name = stdin.nextLine();
        System.out.printf("年齢を入力してください-->");
        Age = stdin.nextInt();
        System.out.println(Name + "さんは来年" + (Age + 1 + "歳になります"));
        }
    }
}
