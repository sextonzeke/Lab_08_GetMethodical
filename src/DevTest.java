import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Test getNonZeroLenString
        String name = getNonZeroLenString(input, "Enter your name: ");
        System.out.println("Hello, " + name + "!");

        //2nd test for library
         name = SafeInput.getNonZeroLenString(input, "Enter your name: ");
        System.out.println("Hello, " + name + "!");

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
}
