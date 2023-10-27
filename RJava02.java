import java.util.*;

public class RJava02 {
    public static void main(String[] args){
        int K = 100;
        boolean b = false;
        char c1 = 'a', c2 = 'A';
        String s = "AbCd";
        float f = 123.456f;
        Date d = new Date();
        System.out.printf("01:%dn",K);
        System.out.printf("02:%8dn",K);
        System.out.printf("03:%08dn",K);
        System.out.printf("04:%x%n",K);
        System.out.printf("05:%#x%n",K);
        System.out.printf("06:%o%n",K);
        System.out.printf("07:%#o%n",K);
        System.out.printf("08:%c%n",c1);
        System.out.printf("09:%C%n",c1);
        System.out.printf("010:%c%n",c2);
        System.out.printf("011:%C%n",c2);
        System.out.printf("012:%s%n",s);
        System.out.printf("013:%S%n",s);
        System.out.printf("014:%f%n",f);
        System.out.printf("015:%12.5f%n",f);
        System.out.printf("016:%12.1f%n",f);
        System.out.printf("017:%e%n",f);
        System.out.printf("018:%b%n",b);
        System.out.printf("019:%8B%n",b);
        b = !b;
        System.out.printf("20:%8b%n",b);
        System.out.printf("21:%tY 年%tm月%td 日%tA%n",d,d,d,d);
        System.out.printf("22:%tY 年%tm月%td 日%ta%n",d,d,d,d);
        System.out.printf("23:%tH 時%tM分%tS 秒%tL%n",d,d,d,d);
        System.out.printf("24:%tl 時%tM分%tS 秒%tN%n",d,d,d,d);
        System.out.printf("25:%tR%n",d);
        System.out.printf("26:%tT%n",d);
        System.out.printf("27:%tr%n",d);
        System.out.printf("28:%tD%n",d);
         System.out.printf("28:%tF%n",d);
          System.out.printf("28:%tT%n",d);
    }
}
