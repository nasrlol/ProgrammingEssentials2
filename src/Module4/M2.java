package Module4;

import java.sql.SQLOutput;

class persoon
{
    private String voornaam;
    private String achternaam;

    persoon(String voornaam, String achternaam)
    {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}


class lokaal
{
    private String adres;
    private String gebouw;
    private int    verdieping;
    private int    lokaalNummer;

    lokaal(String adres, String gebouw, int verdieping, int lokaalNummer)
    {
        this.adres = adres;
        this.gebouw = gebouw;
        this.verdieping = verdieping;
        this.lokaalNummer = lokaalNummer;
    }
    public String getAdres()
    {
        return this.adres;
    }
    public void setAdres(String adres)
    {
        this.adres = adres;
    }


    public String getGebouw() {
        return gebouw;
    }

    public void setGebouw(String gebouw) {
        this.gebouw = gebouw;
    }

    public int getVerdieping() {
        return verdieping;
    }

    public void setVerdieping(int verdieping) {
        this.verdieping = verdieping;
    }

    public int getLokaalNummer() {
        return lokaalNummer;
    }

    public void setLokaalNummer(int lokaalNummer) {
        this.lokaalNummer = lokaalNummer;
    }
}

abstract class personeelsLeden extends persoon
{
    lokaal Lokaal;

    personeelsLeden(String voornaam, String achternaam, lokaal _Lokaal) {
        super(voornaam, achternaam);
        this.Lokaal = _Lokaal;
    }
}

class student extends persoon
{
    private int studentennummer;
    private String specialisatie;

    public student(String voornaam, String achternaam, int studentennummer, String specialisatie)
    {
        super(voornaam, achternaam);
    }
}

class docent extends personeelsLeden
{
    private String specialisatie;
    private String[] studenten;

    docent(String voornaam, String achternaam, lokaal lokaal, String specialisatie)
    {
        super(voornaam, achternaam, lokaal);
        this.specialisatie = specialisatie;
    }
    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }


    public String[] getStudenten() {
        return studenten;
    }

    public void setStudenten(String[] studenten) {
        this.studenten = studenten;
    }
}

class bedienden extends personeelsLeden
{
    bedienden(String voornaam, String achternaam, lokaal Lokaal)
    {
        super(voornaam, achternaam, Lokaal);
    }


}

public class M2 {
    public static void main(String[] args)
    {
        docent hubert = new docent("Hubert", "Roels", new lokaal("Mechelenstraat","C", 5, 3),"Wiskunde");

        System.out.println(hubert.Lokaal.getAdres());
        System.out.println(hubert.getVoornaam());
    }
}
