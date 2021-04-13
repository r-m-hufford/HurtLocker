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
        Milk milk = new Milk();
        Bread bread = new Bread();
        Cookies cookies = new Cookies();
        Apples apples = new Apples();
        String output = (new Main()).readRawDataToString();
        //Milk.setMilkCount(parser.testPatternFind(output,"M\\w+k\\b"));
        parser.capturingGroups(output);

        milk.setCount(milk.counter(parser.lines, "m\\w+k"));
        System.out.println(milk.getCount());

        bread.setCount(bread.counter(parser.lines, "b\\w+d"));
        System.out.println(bread.getCount());

        cookies.setCount(cookies.counter(parser.lines, "c\\w+s"));
        System.out.println(cookies.getCount());

        apples.setCount(apples.counter(parser.lines, "a\\w+s"));
        System.out.println(apples.getCount());

        System.out.println(milk.toString());

    }
}
