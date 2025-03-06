package Module4;
import java.util.Scanner;

class PERSOON {

    public static int persoonCount;

    private String voornaam;
    private String achternaam;
    private String email;

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }
    public String getVoornaam() {
        return this.voornaam;
    }

    public void setAchternaam(String achternaam) {this.achternaam = achternaam;}
    public String getAchternaam() {return this.achternaam;}

    public String getEmail() {return this.email;}
    public void setEmail(String email) {
        this.email = email;
    }

    PERSOON(String voornaam, String achternaam, String email) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;

        persoonCount++;
    }

    PERSOON() {
        persoonCount++;
    }
}

class ADRES extends PERSOON {

    private String straatNaam;
    private int huisNummer;
    private int bus;
    private int postcode;
    private String woonPlaats;

    public String getStraatNaam() {
        return this.straatNaam;
    }
    public void setStraatNaam(String newStraatNaam) {
        this.straatNaam = newStraatNaam;
    }

    public int getHuisNummer() {
        return this.huisNummer;
    }
    public void setHuisNummer(int newHuisNummer) {
        this.huisNummer = newHuisNummer;
    }

    public int getBus() {
        return this.bus;
    }
    public void setBus(int newBus) {
        this.bus = newBus;
    }

    public int getPostcode() {
        return postcode;
    }
    public void setPostcode(int postcode) {
        if (postcode >= 999 && postcode <= 9999) {
            this.postcode = postcode;
        } else {
            this.postcode = 9999;
        }
    }

    public String getWoonPlaats() {
        return woonPlaats;
    }
    public void setWoonPlaats(String woonPlaats) {
        this.woonPlaats = woonPlaats;
    }

    public void drukGegevensAf() {
        System.out.println(this.straatNaam);
        System.out.println(this.huisNummer);
        System.out.println(this.bus);
        System.out.println(this.postcode);
        System.out.println(woonPlaats);
    }

    ADRES(String straatnaam, int huisnummer, int bus, int postcode, String woonPlaats) {
        super();
        this.straatNaam = straatnaam;
        this.huisNummer = huisnummer;
        this.bus = bus;
        this.postcode = postcode;
        this.woonPlaats = woonPlaats;
    }

    ADRES()
    {
        super();
    }
}

public class E1 {

    public static void main(String[] args) {

       ADRES persoon1 = new ADRES();
       persoon1.setVoornaam("THOMAS");
       System.out.println(persoon1.getVoornaam());

        ADRES persoon2 = new ADRES();
        persoon2.setVoornaam("HANS");
        System.out.println(persoon2.getVoornaam());

        ADRES persoon3 = new ADRES();
        persoon3.setVoornaam("SIMBA");
        System.out.println(persoon3.getVoornaam());

       System.out.println(PERSOON.persoonCount);

    }
}