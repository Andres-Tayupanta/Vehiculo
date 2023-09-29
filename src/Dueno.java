public class Dueno {
    private int edad;
    private String nombre;
    private String cedula;
    private char genero;


    public String edadMayor() {
        String my = "";
        if (edad >= 18) {
            my = "Es mayor de edad";
            System.out.println(my);
        } else {
            my = "Es menor de edad";
            System.out.println(my);
        }
        return my;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
