package datos;
public class estudiantes extends Personas {
    String carne;
    
    public estudiantes(String nombre,String Cedula, String carne) {
        super(nombre, Cedula);
        this.carne = carne;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
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
        return super.toString() + "Carne: "+ carne; 
    }
}
