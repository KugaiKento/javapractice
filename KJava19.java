import java.util.HashMap;
public class KJava19 {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("りんご", 100);
        hmap.put("バナナ", 200);
        hmap.put("ぶどう", 300);

        //      取得
        System.out.println(hmap.get("りんご"));
    }
}