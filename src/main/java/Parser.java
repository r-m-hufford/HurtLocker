import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public Integer testPatternFind(String dataToRead, String patternToFind) {
        Integer count = 0;
        Pattern pattern = Pattern.compile(patternToFind, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(dataToRead);

        while (matcher.find()) {
            System.out.println(matcher.toString());
            count++;
        }
        return count;
    }

}
