
import java.util.Scanner;



public class FavNumber {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int favourite_int = SafeInput.getInt(in, "Enter your favorite integer");

        double favourite_Double = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("Your favorite Integer recieved: " + favourite_int);

        System.out.println("Your favorite Double recieved: " + favourite_Double);



    }



}
    ///Favorite Numbers (FavNumbers.java)
   /// Prompt the user to enter their favorite integer and then their favorite double.  Use the
     //   unconstrained getInt and getDouble methods for this.
     //   Really you only have two tests here, non-numeric input and valid numeric input for
     //   each method.
      //  Paste your output results here: