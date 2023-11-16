import java.nio.charset.Charset;

public class KJava20 {
        public static void main(String[] args) {
          Charset defaultCharset = Charset.defaultCharset();
        System.out.println("Default Encoding: " + defaultCharset.displayName());
        }
}