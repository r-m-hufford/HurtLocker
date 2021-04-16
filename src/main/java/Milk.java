import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Milk extends FoodItems{

    private static Milk milk = new Milk();

    private Milk() {}

    public static Milk getInstance() {return milk;}

}
