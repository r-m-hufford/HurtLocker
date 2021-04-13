import com.sun.javafx.binding.StringFormatter;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class FoodItems {
    Display d = new Display();

    private Integer count;
    private Set<String> prices = new TreeSet<String>();


    public FoodItems() {}

    public Integer getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
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
            }
        }
        return count;
    }

    public void priceAccumulator(List<String> lines, String patternToFind) {
        Pattern pattern = Pattern.compile(patternToFind, Pattern.CASE_INSENSITIVE);

        for (int i = 0; i < lines.size(); i++) {
            Matcher matcher = pattern.matcher(lines.get(i));
            if (lines.get(i).contains(":;"))
                continue;
            else if (matcher.find()) {
                prices.add(matcher.group());
            }
        }
    }

    @Override
    public String toString() {
        String toString = String.format("name:%8s%sseen: %d times\n%s%s%s" +
                        "\n"
                ,this.getClass().getName(), d.middleSpace(),getCount(),
                d.doubleleBreak(),d.middleSpace(),d.doubleleBreak());
        return toString;
    }
}
