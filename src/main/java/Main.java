import org.apache.commons.io.IOUtils;
import java.io.IOException;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        Parser parser = new Parser();
        Milk milk = Milk.getInstance();
        Bread bread = Bread.getInstance();
        Cookies cookies = Cookies.getInstance();
        Apples apples = Apples.getInstance();
        String output = (new Main()).readRawDataToString();
        parser.capturingGroups(output);

        Display display = new Display();

        milk.setCount(milk.counter(parser.lines, "m\\w+k"));
        bread.setCount(bread.counter(parser.lines, "b\\w+d"));
        cookies.setCount(cookies.counter(parser.lines, "c\\w+s"));
        apples.setCount(apples.counter(parser.lines, "a\\w+s"));


        System.out.println(display.toString());

    }
}
