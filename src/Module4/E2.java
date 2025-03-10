package Module4;

class zwembad
{
   private int straalZwembad;
   private int breedtePad;
   private int prijsPadVierkantMeter; // de prijs van een pad is 50euro/m^2
   private int omheiningVierkantMeter; // prijs van de omheining is 100euro/m^2

   zwembad(int straalZwembad, int breedtePad, int prijsPadVierkantMeter, int omheiningVierkantMeter)
   {
     this.straalZwembad = straalZwembad;
     this.breedtePad = breedtePad;
     this.prijsPadVierkantMeter = prijsPadVierkantMeter;
     this.omheiningVierkantMeter = omheiningVierkantMeter;
   }

   public void setStraalZwembad(int straalZwembad){this.straalZwembad = straalZwembad;}
   public int getStraalZwembad(){return this.straalZwembad;}

   public int getBreedtePad(){return this.breedtePad;}
   public void setBreedtePad(int breedtePad){this.breedtePad = breedtePad;}

   public void setPrijsPadVM(int prijsPadVM)
   {
      this.prijsPadVierkantMeter = prijsPadVM;
   }
   public int getPrijsPadVM(){return this.prijsPadVierkantMeter;}

   private int getOmheiningVierkantMeter(){return this.omheiningVierkantMeter;}
   private void setOmheiningVierkantMeter(int omheiningVM){this.omheiningVierkantMeter = omheiningVM;}

   public int getPrijsPad()
   {
      int OCirkelMetPad = (int) (((getStraalZwembad() + getBreedtePad()) ^ 2)  * Math.PI);
      int OCirkelZonderPad =  (int) ((getStraalZwembad() ^ 2) * Math.PI);

      int OPad = OCirkelMetPad - OCirkelZonderPad;
      return OPad * prijsPadVierkantMeter;
   }

   public int getPrijsOmheining()
   {
      return (int) ((((getStraalZwembad() + breedtePad) * 2) * Math.PI) * getOmheiningVierkantMeter());
   }

   public int getTotalePrijs()
   {
      return getPrijsPad() + getPrijsOmheining();
   }


}



public class E2 {
    public static void main(String[] args) {
       zwembad nieuwZwembad = new zwembad(10, 10, 50, 30);
       System.out.println(nieuwZwembad.getTotalePrijs());
    }
}
