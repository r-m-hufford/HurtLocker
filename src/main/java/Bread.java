import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bread extends FoodItems{

    private static Bread bread = new Bread();

    private Bread() {}

    public static Bread getInstance() {return bread;}

}