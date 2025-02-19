package Module1;
import java.util.Scanner;

public class H1 {

    public static void main (String[] args) {


        int grootsteGemeenschappelijkeDeler = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Voer het eerste getal in: ");
        String eerstGetalString = userInput.nextLine();
        int eersteGetal = Integer.parseInt(eerstGetalString);

        System.out.println("Voer het tweede getal in: ");
        String tweedeGetalString = userInput.nextLine();
        int tweedeGetal = Integer.parseInt(tweedeGetalString);

        int grootsteGetal = 0;

        if (eersteGetal > tweedeGetal)
            grootsteGetal = eersteGetal;
        else
            grootsteGetal = tweedeGetal;

        for (int i = 1; i < grootsteGetal; i++)
        {
            if((eersteGetal % i == 0 ) && (tweedeGetal % i == 0))
            {
               grootsteGemeenschappelijkeDeler = i;
            }
        }

        System.out.println(grootsteGemeenschappelijkeDeler);

    }
}
