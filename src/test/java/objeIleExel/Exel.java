package objeIleExel;

public class Exel {

   private String ulke_Ingilizce="";
   private String ulke_Turkce="";
   private String baskent_Turkce="";
   private String baskent_Ingilizce="";

   public Exel(){}

   public Exel(String ulke_Ingilizce, String ulke_Turkce, String baskent_Turkce, String baskent_Ingilizce) {
      this.ulke_Ingilizce = ulke_Ingilizce;
      this.ulke_Turkce = ulke_Turkce;
      this.baskent_Turkce = baskent_Turkce;
      this.baskent_Ingilizce = baskent_Ingilizce;
   }

   public String getUlke_Ingilizce() {
      return ulke_Ingilizce;
   }

   public void setUlke_Ingilizce(String ulke_Ingilizce) {
      this.ulke_Ingilizce = ulke_Ingilizce;
   }

   public String getUlke_Turkce() {
      return ulke_Turkce;
   }

   public void setUlke_Turkce(String ulke_Turkce) {
      this.ulke_Turkce = ulke_Turkce;
   }

   public String getBaskent_Turkce() {
      return baskent_Turkce;
   }

   public void setBaskent_Turkce(String baskent_Turkce) {
      this.baskent_Turkce = baskent_Turkce;
   }

   public String getBaskent_Ingilizce() {
      return baskent_Ingilizce;
   }

   public void setBaskent_Ingilizce(String baskent_Ingilizce) {
      this.baskent_Ingilizce = baskent_Ingilizce;
   }

}
