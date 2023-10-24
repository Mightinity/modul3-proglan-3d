package modul3.latihan2;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String text = "Bimo Yudistira Ariel";
        String replaceText = StringUtils.replace(text, "Yudistira", "Ariel");
        System.out.println("Replaced Text: " + replaceText);
    }
}
