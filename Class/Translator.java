package Class;

public class Translator {
    public static String translateCOlor(String color){
        if("赤".equals(color)){
            System.out.println(color);
            return "red";
        }else{
            System.out.println(color);
            return "Unknow";
        }
    }
}
