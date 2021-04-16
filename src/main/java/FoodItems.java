import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.format;

public abstract class FoodItems {
    Display d = new Display();

    public Integer count;
    public List<String> typeLines = new ArrayList<String>();
    Set<String> prices = new TreeSet<String>();

    public FoodItems() {}

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer updatedCount) {
        count = updatedCount;
    }

    public Integer counter(List<String> lines, String patternToFind) {
        Integer count = 0;
        Pattern pattern = Pattern.compile(patternToFind, Pattern.CASE_INSENSITIVE);

        for (int i = 0; i < lines.size(); i++) {
            Matcher matcher = pattern.matcher(lines.get(i));

            if (lines.get(i).contains(":;"))
                continue;
            else if (matcher.find()) {
                count++;
                typeLines.add(lines.get(i));
            }
        }
        return count;
    }

    public void priceAccumulator() {
        Pattern pattern = Pattern.compile("[0-9][.][0-9]{2}", Pattern.CASE_INSENSITIVE);

        for (int i = 0; i < typeLines.size(); i++) {
            Matcher matcher = pattern.matcher(typeLines.get(i));
            if (matcher.find()) {
                prices.add(matcher.group());
            }
        }
    }

    public String priceFormatter(Set<String> priceSet) {
        return null;
    }

    @Override
    public String toString() {
        String toString = format(
                        "name:%8s%sseen: %d times" +
                        "\n%s%s%s" +
                        "\nPrice:%7d%sseen: %d times" +
                        "\n%s%s%s\n"
                ,this.getClass().getName(), d.middleSpace(),getCount(),
                d.doubleBreak(),d.middleSpace(),d.doubleBreak(),
                typeLines.size(), d.middleSpace(),typeLines.size(),
                d.singleBreak(),d.middleSpace(),d.singleBreak()
                );
        return toString;
    }
}
