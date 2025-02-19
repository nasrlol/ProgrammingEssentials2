package Module3;

class Adress {

    private String straatNaam;

    public String getStraatNaam() {return this.straatNaam;};
    public void setStraatNaam(String newStraatNaam) {this.straatNaam = newStraatNaam;}

    private int huisNummer;

    public int getHuisNummer(){return this.huisNummer;}
    public void setHuisNummer(int newHuisNummer){this.huisNummer = newHuisNummer;};

    private int bus;

    public int getBus(){return this.bus;};
    public void setBus(int newBus){this.bus = newBus;};

    private int[] postcode = new int[4]; // Maakt een array met 4 elementen (standaard gevuld met 0)

    public int[] getPostcode() {postcode = new int[]{9,9,9,9}; return postcode;}
    public void setPostcode(int[] postcode) {this.postcode = postcode;}

    private String woonPlaats;

    public String getWoonPlaats() {return woonPlaats;}
    public void setWoonPlaats(String woonPlaats) {this.woonPlaats = woonPlaats;}

    public Adress(String straatnaam, int huisnummer,int bus, int[] postcode, String woonPlaats)
    {
        this.straatNaam = straatnaam;
        this.huisNummer = huisnummer;
        this.bus = bus;
        this.postcode = postcode;
        this.woonPlaats = woonPlaats;
    }

}
public class M1 {
    public static void main(String[] args) {



    }
}
