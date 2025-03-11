package Module4;

class huisdier {
    private int gewicht;
    private int leeftijd;
    private String naam;

    public huisdier(int gewicht, int leeftijd, String naam)
    {
       this.gewicht = gewicht;
       this.leeftijd = leeftijd;
       this.naam = naam;
    }
    public int getGewicht(){return this.gewicht;}
    public void setGewicht(int gewicht){this.gewicht = gewicht;}

    public int getLeeftijd(){return this.leeftijd;}
    public void setLeeftijd(int leeftijd){this.leeftijd = leeftijd;}

    public String getNaam(){return this.naam;}
    public void setNaam(String naam){this.naam = naam;}

    public String toString()
    {
        return "Het dier weegt " + getGewicht() + "kg" +
                "\nHet dier is " + getLeeftijd() + " jaar oud" +
                "\nEn het heet " + getNaam() + ".";
    }
}

class hond extends huisdier
{
    private int stamboekNummer;

    public hond(int gewicht, int leeftijd, String naam, int stamboekNummer) {
        super(gewicht, leeftijd, naam);
        this.stamboekNummer = stamboekNummer;
    }

    public int getStamboekNummer(){return this.stamboekNummer;}
    public void setStamboekNummer(int stamboekNummer){this.stamboekNummer = stamboekNummer;}

   @Override
    public String toString()
   {
       return "De hond weegt " + getGewicht() + "kg" +
               "\nDe hond is " + getLeeftijd() + " jaar oud" +
               "\nZijn stamboek nummer is " + getStamboekNummer() + " " +
               "\nEn hij heet " + getNaam() + ".";
   }

}

public class M1 {
    public static void main(String[] args) {

        huisdier dolfijn = new huisdier(100, 12, "thomas");
        hond Pepijn = new hond(5, 10, "marsenpijn", 5);

        Pepijn.setNaam("mooiePepijn");

        System.out.println(dolfijn.toString());
        System.out.println(Pepijn.toString());


    }
}
