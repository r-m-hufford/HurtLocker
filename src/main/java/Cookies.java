import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cookies extends FoodItems{

    private static Cookies cookies = new Cookies();

    private Cookies() {}

    public static Cookies getInstance() {return cookies;}
}