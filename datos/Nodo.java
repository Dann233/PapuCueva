package datos;

public class Nodo {
     
    Personas Nodo;
    Nodo Siguiente;

    public Nodo() {
     Siguiente = null;
     Nodo = null;
    }

    public Nodo(Personas Nodo) {
        this.Nodo = Nodo;
        Siguiente = null;
    }

    
    
    @Override
    public String toString() {
        return Nodo.toString();
    }

    public Personas getNodo() {
        return Nodo;
    }

    public void setNodo(Personas Nodo) {
        this.Nodo = Nodo;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
}
