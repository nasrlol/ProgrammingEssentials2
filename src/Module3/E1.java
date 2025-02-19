package Module3;
import java.util.Scanner;
import static java.lang.Integer.parseInt;


class Circle
{
    final double pi = Math.PI;
    private int straal;
    private String kleur;

    public int getStraal(){
        return this.straal;
    }

    public String getKleur(){
        return this.kleur;
    }

    public void setStraal(int nieuweStraal)
    {
        this.straal = nieuweStraal;
    }

    public void setKleur(String nieuweKleur)
    {
        this.kleur = nieuweKleur;
    }

    public Circle (int straal, String kleur) {
        this.straal = straal;
        this.kleur = kleur;
    }

    void print() {System.out.println("de straal van de cirkel is " + getStraal() + " de kleur is " + getKleur());}

    double omtrek() { return 2 * pi * straal;}
    double oppervlakte(){return (int) pi *  straal^2;}


}
public class E1 {
    public static void main (String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Geef de start kleur van de cirkel");
        String circleColor;
        circleColor = userInput.nextLine();

        System.out.println("Geef de start straal van de cirkel");
        int circleStraal;
        circleStraal = parseInt(userInput.nextLine());

        Circle rond = new Circle(circleStraal, circleColor);

        System.out.println("even de waarden veranderen naar groen en 10");
        rond.setKleur("groen");
        rond.setStraal(10);

        rond.print();

        System.out.println("de omtrek van de cirkel is " + rond.omtrek());
        System.out.println("de oppervlakte van de cirkel is " + rond.oppervlakte());


    }
}
