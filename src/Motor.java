public class Motor {
   private  double cilindraje=0;
   private  String combustible="";

    double caballosFuerza(){
        double cf;
        if(combustible.equals("Diesel")){
            cf=10.5;

        }else{
            cf=5.2;
        }
        return cf;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
