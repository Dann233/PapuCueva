package datos;

public abstract class Personas {
    String Nombre;
    String Cedula;

    public Personas(String nombre,String ced) {
    this. Nombre = nombre;
    this.Cedula = ced;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Nombre:"+ Nombre + "\nCedula: " + Cedula + "\n";
    }
    
}
