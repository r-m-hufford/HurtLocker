public class Milk {

    private static Integer milkCount;


    public Milk() {}

    public static Integer getMilkCount() {
        return milkCount;
    }

    public void incrementMilkCount() {
        this.milkCount++;
    }

    public static void setMilkCount(Integer newMilkCount) {
        milkCount = newMilkCount;
    }
}
