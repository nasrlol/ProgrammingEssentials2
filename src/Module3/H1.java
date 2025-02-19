package Module3;

import java.util.Scanner;


class Auto {

    private double kilometers;

    public double getKilometers()
    {
        return this.kilometers;
    }

    public void setKilometers(double kilometers){
       this.kilometers = kilometers;
    }

    private double brandstoftank; // in liters

    public double getBrandstoftank(){
        return this.brandstoftank;
    }

    public void setBrandstoftank(double brandstoftank){
       this.brandstoftank = brandstoftank;
    }
    private double verbruik; // verhouding tussen brandstoftank en kilometers

    public double getVerbruik(){
        return this.verbruik;
    }

    public void setVerbruik(double verbruik){
        this.verbruik = verbruik;
    }

    // user waarden constructer
    public Auto(double kilometers, double brandstoftank, double verbruik){
        this.kilometers = kilometers;
        this.brandstoftank = brandstoftank;
        this.verbruik = verbruik;
    }

    public void vulTank()
    {
       this.brandstoftank = 50;
    }

    public void rijden(int afstand)
    {
        afstand = Math.abs(afstand);
        for (double i = 0; i <= afstand; i++)
        {
            if (brandstoftank > 0)
            {
                this.brandstoftank -= verbruik;
                this.kilometers += i;
                System.out.println(verbruik + " verbruikt");
                System.out.println(i + " gereden");
            } else {
                System.out.printf("maar %f gereden omdat brandstof tank 0 is", i);
                break;
            }
        }
    }

    public void autoInformatie()
    {
        System.out.println("\n" + kilometers);
        System.out.println(brandstoftank);
        System.out.println(verbruik);

    }
    // default waarden constructer
    public Auto()
    {
        this.kilometers = 0;
        this.brandstoftank = 0;
        this.verbruik = 5;
    }
}

public class H1 {
    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);

       Auto mijnAuto = new Auto(1000, 40, 5);

       System.out.println("Hoe ver wil je rijden?");
       int afstand = Integer.parseInt(userInput.nextLine());
       mijnAuto.rijden(afstand);

       System.out.println("\n Auto informatie:");
       mijnAuto.autoInformatie();

    }
}
