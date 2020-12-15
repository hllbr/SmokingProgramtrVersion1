
public class Sigara {
    private String marka ;
    private String model ;
    private double fiyat ;

    public Sigara(String marka, String model) {
        this.marka = marka;
        this.model = model;
        if(marka.equals("Winston Slender")){
            this.fiyat = 15;
        }else if(marka.equals("Winston Deep Blue & Dark Blue")){
            this.fiyat = 15;
        }else if(marka.equals("Winston")){
            this.fiyat = 15;
        }else if(marka.equals("Camel Slender")){
            this.fiyat = 14.50;
        }else if(marka.equals("Camel Rework")){
            this.fiyat = 15;
        }else if(marka.equals("Camel")){
            this.fiyat = 15;
        }else if(marka.equals("Monte Carlo Slender")){
            this.fiyat = 14;
        }else if(marka.equals("Monte Carlo")){
            this.fiyat = 14.50;
        }else if(marka.equals("LD")){
            this.fiyat = 14;
        }else if(marka.equals("Kent")){
            this.fiyat = 15;
        }else if(marka.equals("Kent D-Range")){
            this.fiyat = 15;
        }else if(marka.equals("Kent Swicth")){
            this.fiyat = 16;
        }else if(marka.equals("Kent N-Range")){
            this.fiyat = 18;
        }else if(marka.equals("Rothmans")){
            this.fiyat = 14;
        }else if(marka.equals("Viceroy")){
            this.fiyat = 14.50;
        }else if(marka.equals("Pall Mall")){
            this.fiyat = 14.50;
        }else if(marka.equals("Tekel 2000")){
            this.fiyat = 14;
        }else if(marka.equals("Tekel 2001")){
            this.fiyat = 14;
        }else if(marka.equals("Samsun")){
            this.fiyat = 14;
        }else if(marka.equals("Samsun 216")){
            this.fiyat = 14;
        }else if(marka.equals("Maltepe")){
            this.fiyat = 14;
        }else{
            this.fiyat = fiyat ;
        }
        
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    
    public void bilgileriGoster(){
        System.out.println("Kamu Spotu\n"
                + "Sigara öldürür....");
    }
    
}
