package Module4;

class zwembad
{
   private int straalZwembad;
   private int breedtePad;
   private int prijsPadVM; // de prijs van een pad is 50euro/m^2
   private int omheiningVM; // prijs van de omheining is 100euro/m^2

   public void setStraalZwembad(int straalZwembad){this.straalZwembad = straalZwembad;};
   public int getStraalZwembad(){return this.straalZwembad;};

   public int setBreedtePad(){return this.breedtePad;};
   public void getBreedtePad(int breedtePad){this.breedtePad = breedtePad;};

   public void setPrijsPadVM(int prijsPadVM)
   {
      this.prijsPadVM = prijsPadVM;
   }

   public int berekenPrijsPad()
   {
      return breedtePad * 50;
   }

   public void setPrijsPad()
   {

   }
   public int getPrijsPad()
   {
       return berekenPrijsPad();
   }
}



public class E2 {
    public static void main(String[] args) {
    }
}