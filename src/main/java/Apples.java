import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Apples extends FoodItems{

    private static Apples apples = new Apples();

    private Apples() {}

    public static Apples getInstance() {return apples;}

}