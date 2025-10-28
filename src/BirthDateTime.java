import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year [1900-2015]", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month [1-12]", 1, 12);
        int birthDay = 0;

        switch (birthMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day [1-31]", 1, 31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day [1-30]", 1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day [1-28]", 1, 28);
                break;
            default:
                System.out.println("Invalid month entered.");
                return;
        }
        int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour [1-12]", 1, 12);
        int birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.printf("You were born on %02d/%02d/%d at %02d:%02d\n", birthMonth, birthDay, birthYear, birthHour, birthMinute);
    }
}