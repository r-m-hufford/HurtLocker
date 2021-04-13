import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    List<String> lines = new ArrayList<String>();

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

    public void capturingGroups(String dataToRead) {
        Pattern pattern = Pattern.compile("name.*?##", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(dataToRead);
        while(matcher.find()) {
            lines.add(matcher.group());
        }
    }
}
