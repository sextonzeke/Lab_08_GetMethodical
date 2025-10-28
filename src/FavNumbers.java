import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0.0;

        favInt = SafeInput.getInt(in, "Enter your favorite integer between 1 and 100");
        System.out.println("Your favorite integer is: " + favInt);
        favDouble = SafeInput.getDouble(in, "Enter your favorite double between 0.0 and 100.0");
        System.out.println("Your favorite double is: " + favDouble);

    }
}
