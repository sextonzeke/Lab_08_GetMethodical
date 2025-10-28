

import java.util.Scanner;



public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title = SafeInput.getNonZeroLenString(in, "Enter header text: ");
        int minWidth = title.length() + 4;
        int width = SafeInput.getInt(in, "Enter total width (>= " + minWidth + "): ");
        while (width < minWidth) {
            System.out.println("Width must be at least " + minWidth + ".");
            width = SafeInput.getInt( in,  "Enter total width (>= " + minWidth + "): ");
        }
        String border = "*".repeat(width);
        int inner = width - 2;
        int leftPad = (inner - title.length()) / 2;
        int rightPad = inner - title.length() - leftPad;
        String middle = "*" + " ".repeat(leftPad) + title + " ".repeat(rightPad) + "*";
        System.out.println(border);
        System.out.println(middle);
        System.out.println(border);
    }
}