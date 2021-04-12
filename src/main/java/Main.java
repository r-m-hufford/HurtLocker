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
        String output = (new Main()).readRawDataToString();
        System.out.println(output);
        Milk.setMilkCount(parser.testPatternFind(output,"M\\w+k\\b"));
        System.out.println(Milk.getMilkCount());

    }
}
