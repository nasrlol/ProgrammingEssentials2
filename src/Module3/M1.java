package Module3;
import java.util.Scanner;

class Adress {

    private String straatNaam;

    public String getStraatNaam() {
        return this.straatNaam;
    }

    public void setStraatNaam(String newStraatNaam) {
        this.straatNaam = newStraatNaam;
    }

    private int huisNummer;

    public int getHuisNummer() {
        return this.huisNummer;
    }

    public void setHuisNummer(int newHuisNummer) {
        this.huisNummer = newHuisNummer;
    }

    private int bus;

    public int getBus() {
        return this.bus;
    }

    public void setBus(int newBus) {
        this.bus = newBus;
    }

    private int postcode;

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        if (postcode >= 999 && postcode <= 9999)
        {
            this.postcode = postcode;
        } else{
            this.postcode = 9999;
        }
    }

    private String woonPlaats;

    public String getWoonPlaats() {
        return woonPlaats;
    }

    public void setWoonPlaats(String woonPlaats) {
        this.woonPlaats = woonPlaats;
    }

    public void drukGegevensAf()
    {
        System.out.println(this.straatNaam);
        System.out.println(this.huisNummer);
        System.out.println(this.bus);
        System.out.println(this.postcode);
        System.out.println(woonPlaats);
    }

    public Adress(String straatnaam, int huisnummer, int bus, int postcode, String woonPlaats) {
        this.straatNaam = straatnaam;
        this.huisNummer = huisnummer;
        this.bus = bus;
        this.postcode = postcode;
        this.woonPlaats = woonPlaats;
    }
}

public class M1 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Adress mijnAdress = new Adress("Nijverheidskaai", 100, 120, 9999, "Zele");

        mijnAdress.drukGegevensAf();

        mijnAdress.setWoonPlaats("nieuwe woonplaats");
        System.out.println(mijnAdress.getWoonPlaats());

        mijnAdress.setBus(3);
        System.out.println(mijnAdress.getBus());


        // zet een nieuwe postcode
        System.out.println("zet een nieuwe postcode");
        String newPostcodeS = userInput.nextLine();
        int newPostcode = Integer.parseInt(newPostcodeS);
        mijnAdress.setPostcode(newPostcode);

       System.out.println("POSTCODE " + mijnAdress.getPostcode());
    }
}
