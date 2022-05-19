/*Create a regular expression that accepts alphanumeric characters only.its length must be six characters long only.*/

package COM.BRIDGELABZ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaNumChar {
    public static Scanner sc = new Scanner(System.in);

    public void verifyingAlpNum() {

        System.out.println("Enter the AlphaNumeric:");
        String AlpNum = sc.next();
        Pattern Sri = Pattern.compile("^[A-Za-z0-9]{6}$");
        Matcher match = Sri.matcher(AlpNum);

        if (match.matches()) {
            System.out.println("Num is valid");
        }

        else {
                System.out.println("Num is invalid, Try with Another name.");

            }
        }

        public static void main(String[] args) {

        AlphaNumChar check = new AlphaNumChar();
        check.verifyingAlpNum();
    }
}
