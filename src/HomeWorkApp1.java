public class HomeWorkApp1 {
    public static void main(String[] args)
    {

        System.out.println();
        int a = 0;
        int b = 1;
        boolean isBetween = isSumBetween10And20(a, b);
System.out.println(isBetween);

        System.out.println();
        printSignOf(2);

        System.out.println();
        boolean isBad = isBad (-4);
        System.out.println(isBad);

        System.out.println();
        print("Let it be....", 8);

        System.out.println("Задание 5");
        boolean isHappy = isHappyYear(2021);
        System.out.println(isHappy);

    }


    public static boolean isSumBetween10And20(int left, int right)
    {
        int sum = left + right;
        return 10 < sum && sum <= 20;
    }

    public static void printSignOf(int number)
    {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isBad(int number)
    {
        return number < 0;
    }

    public static void print(String message,int count)
    {
        for (int i=0; i < count; i++)
        {
            System.out.println(message);
        }
    }
public static boolean isHappyYear(int year)
{
    return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
}
}


