public class HomeWorkApp1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        System.out.println(a + b);
        System.out.println("Сумма положительная");
    }

    public static void printColor() {
        int value = 34;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else if (100 < value) {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers()
    {

        int a = 17;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
}
