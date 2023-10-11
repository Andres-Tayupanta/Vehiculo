public class Auto {
    private int numeroRuedas=0;
    private String color="";
    private int puertas=0;

    private Motor motor;
    private Dueno dueno;

    public Auto(){

    }

    public Auto(int numeroRuedas, String color, int puertas){
        this.numeroRuedas=numeroRuedas;
        this.color=color;
        this.puertas=puertas;
    }

    public Auto(int numeroRuedas, String color, int puertas, Motor motor, Dueno dueno) {
        this.numeroRuedas = numeroRuedas;
        this.color = color;
        this.puertas = puertas;
        this.motor = motor;
        this.dueno = dueno;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    public void imprimirColorPuertas(){
        System.out.println("El color del vehículo es: "+color+" y el numero de puertas es: "+puertas);
    }

    public void imprimirColorPuertas(int numAuto){
        System.out.println("El color del vehículo "+numAuto+"es: "+color+" y el numero de puertas es: "+puertas);
    }
}
