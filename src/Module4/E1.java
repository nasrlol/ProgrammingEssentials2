package Module4;
import java.util.Scanner;

class PERSOON {

    private String voornaam;
    private String achternaam;
    private String email;

    public void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;
    }

    public String getVoornaam()
    {
        return this.voornaam;
    }

    public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;
    }

    public String getAchternaam()
    {
        return this.achternaam;
    }

    public void makePersoon()
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("voer de voornaam in");
        String voornaam = userInput.nextLine();

        System.out.println("voer de achternaam in");
        String achternaam = userInput.nextLine();
    }

    public String toString()
    {
        System.out.println(this.voornaam + this.achternaam);
        return null;
    }
}

class ADRES extends PERSOON {

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

    public ADRES(String straatnaam, int huisnummer, int bus, int postcode, String woonPlaats) {
        this.straatNaam = straatnaam;
        this.huisNummer = huisnummer;
        this.bus = bus;
        this.postcode = postcode;
        this.woonPlaats = woonPlaats;
    }
}

public class E1 {

    public static void main(String[] args) {

        System.out.println("testing the code...");
    }
}
