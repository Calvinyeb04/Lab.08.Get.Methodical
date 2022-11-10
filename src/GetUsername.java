
import java.util.Scanner;

public class GetUsername {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       String firstName = "";
       String lastname = "";

        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");

        lastname = SafeInput.getNonZeroLenString(in,"Enter your last name");

        System.out.println("\nYour full name is: " + firstName + " " + lastname);


    }
}
