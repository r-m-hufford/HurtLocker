import static java.lang.String.format;

public class Display {
    Milk milk = Milk.getInstance();
    Bread bread = Bread.getInstance();
    Cookies cookies = Cookies.getInstance();
    Apples apples = Apples.getInstance();


    public String doubleBreak() {
        String doubleBreak = "=============";
        return doubleBreak;
    }

    public String singleBreak() {
        String singleBreak = "-------------";
        return singleBreak;
    }

    public String middleSpace() {
        String middleSpace= "       ";
        return middleSpace;
    }

    @Override
    public String toString() {
        String toString = format(
                "name:%8s%sseen: %d times" +
                        "\n%s%s%s" +
                        "\nPrice:%7d%sseen: %d times" +
                        "\n%s%s%s" +
                        "\n" +
                        "\nname:%8s%sseen: %d times" +
                        "\n%s%s%s" +
                        "\nPrice:%7d%sseen: %d times" +
                        "\n%s%s%s" +
                        "\n" +
                        "\nname:%8s%sseen: %d times" +
                        "\n%s%s%s" +
                        "\nPrice:%7d%sseen: %d times" +
                        "\n%s%s%s" +
                        "\n" +
                        "\nname:%8s%sseen: %d times" +
                        "\n%s%s%s" +
                        "\nPrice:%7d%sseen: %d times" +
                        "\n%s%s%s" +
                        "\n",

                milk.getClass().getName(), middleSpace(),milk.getCount(),
                doubleBreak(),middleSpace(),doubleBreak(),
                milk.typeLines.size(), middleSpace(),milk.typeLines.size(),
                singleBreak(),middleSpace(),singleBreak(),

                bread.getClass().getName(), middleSpace(),bread.getCount(),
                doubleBreak(),middleSpace(),doubleBreak(),
                bread.typeLines.size(), middleSpace(),bread.typeLines.size(),
                singleBreak(),middleSpace(),singleBreak(),

                cookies.getClass().getName(), middleSpace(),cookies.getCount(),
                doubleBreak(),middleSpace(),doubleBreak(),
                cookies.typeLines.size(), middleSpace(),cookies.typeLines.size(),
                singleBreak(),middleSpace(),singleBreak(),

                apples.getClass().getName(), middleSpace(),apples.getCount(),
                doubleBreak(),middleSpace(),doubleBreak(),
                apples.typeLines.size(), middleSpace(),apples.typeLines.size(),
                singleBreak(),middleSpace(),singleBreak()
                );

        return toString;
    }
}
