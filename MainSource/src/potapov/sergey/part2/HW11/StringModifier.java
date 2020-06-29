package potapov.sergey.part2.HW11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringModifier {
    public static String stringModifier(String incString) {

        String regex = "\\b(?i)бяка\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(incString);
        StringBuilder builder = new StringBuilder();

        while (matcher.find()){
            matcher.appendReplacement(builder, "\"вырезано цензурой\"");
        }

        return matcher.appendTail(builder).toString();
    }
}
