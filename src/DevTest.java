import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
/**
        //Test getNonZeroLenString
        String name = getNonZeroLenString(input, "Enter your name: ");
        System.out.println("Hello, " + name + "!");

        //2nd test for library
    //     name = SafeInput.getNonZeroLenString(input, "Enter your name: ");
    //    System.out.println("Hello, " + name + "!");

        double salary = getDouble(input, "Enter your salary: ");
        System.out.println("Your salary is: " + salary);
        //2nd test
     //   salary = SafeInput.getDouble(input, "Enter your salary: ");
     //   System.out.println("Your salary is: " + salary);

        double price =  getRangedDouble(input, "Enter your price: ", .01, 10.01);
        System.out.println("Your price is: " + price);
        //2nd test
      //  price = SafeInput.getRangedDouble(input, "Enter your price: ", .01, 10.01);
      //  System.out.println("Your price is: " + price);

        int favNum = getRangedInt(input, "Enter your favorite number", 1, 10);
        System.out.println("Your favorite number is: " + favNum);

      //  favNum = SafeInput.getRangedInt(input, "Enter your favorite number", 1, 10);
      //  System.out.println("Your favorite number is: " + favNum);

        boolean confirm = getYNConfirm(input, "Do you want to continue?");
        System.out.println("User response: " + confirm);

        confirm = SafeInput.getYNConfirm(input, "Do you want to continue?");
       System.out.println("User response: " + confirm);
 */
        String email = getRegExString(input, "Enter your email address", "^[\\w.]+@[\\w.]+$");
        System.out.println("Your email address is: " + email);

        //2nd test
        email = SafeInput.getRegExString(input, "Enter your email address", "^[\\w.]+@[\\w.]+$");
        System.out.println("Your email address is: " + email);


    }
    //  all method defs go here

    /**
     * Get a non-zero length string from the user
     * @param pipe - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - a non-empty String
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print(prompt);
            retString = pipe.nextLine();
             if (retString.isEmpty());
             {
                 System.out.println("You must enter at least one character. Please try again.");
             }


        }while (retString.isEmpty());

        return retString;
    }
    /**
     * Get a non-zero length string from the user
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - to display to the user to indicate what to enter
     * @return - any integer
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt  = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print(prompt);
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer. You entered: " + trash);
            }
        }while (!done);
        return retInt;
    }

    /**
     * Get a non-zero length string from the user
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - any double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal  = 0.0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print(prompt);
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer. You entered: " + trash);
            }
        }while (!done);
        return  retVal;
    }

    /**
     * Get a non-zero length string from the user
     * @param pipe - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @param low - lowest acceptable value
     * @param high - highest acceptable value
     * @return - an integer within the specified range
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal < low || retVal > high) {
                    System.out.println("Your input is out of range. Please try again.");
                } else {
                    done = true;
                }
            }else
            {
                trash = pipe.nextLine();
            }
        }while (!done);
        return retVal;
    }

    /**
     * Get a non-zero length string from the user
     *
     * @param pipe   - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @param low    - lowest acceptable value
     * @param high   - highest acceptable value
     * @return - an integer within the specified range
     */

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal < low || retVal > high) {
                    System.out.println("Your input is out of range. Please try again.");
                } else {
                    done = true;
                }
            }else
            {
                trash = pipe.nextLine();
            }
        }while (!done);
        return retVal;
    }
    /**
     * Get a yes/no confirmation from the user
     * Zeke Sexton sextonej@mail.uc.edu
     * @param pipe - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @return - true for Y/y, false for N/n
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean retVal = false;
        boolean done = false;

        do
        {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine().toUpperCase();
            if (response.equals("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (response.equals("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter Y or N. Please try again.");
            }
        }while (!done);

        return retVal;
    }

    /**
     * Get a string that matches the provided regular expression
     * @param pipe - Scanner to use for input
     * @param prompt - prompt to display to the user to indicate what to enter
     * @param regEx - the regular expression the input must match
     * @return - a String that matches the provided regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";
        boolean done = false;

        do
        {
            System.out.print(prompt +  "[" +regEx+"]: ");
            retString = pipe.nextLine();
            if (retString.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Your input does not match the required format." + regEx + " Please try again.");
            }
        }while (!done);

        return retString;

    }
}
