package datos;

public class ListasEstudiantes {
    Nodo Inicio;

    public ListasEstudiantes() {
        Inicio = null;
    }

    void AgregarEstudiante(estudiantes Est) {

        if (Inicio == null) {

            Inicio = new Nodo(Est);
        } else {

            Nodo lista = Inicio;

            while (lista.getSiguiente() != null) {
                lista = lista.getSiguiente();
            }

            lista.setSiguiente(new Nodo(Est));

        }
        //buscar el ultimo dato

    }

    void imprimirLista() {

        Nodo lista = Inicio;
        String Datos = "";
        if (Inicio.getSiguiente() == null) {
            System.out.println(Inicio.toString());
        } else {
            while (lista.getSiguiente() != null) {
                Datos += "\n" + lista.getNodo().toString();
                lista = lista.getSiguiente();
            }
            System.out.println(Datos + "\n" + lista);
        }
    }

    String buscarName(String nombre) {
        Nodo lista = Inicio;
        

        if (Inicio.getSiguiente() == null) {

            if (Inicio.getNodo().getNombre().equals(nombre)) {
                return Inicio.toString();
            } else {
                return "No exite";
            }

        } else {
            while (lista.getSiguiente() != null) {
                if (lista.getNodo().getNombre().equals(nombre)) {
                    return lista.getNodo().toString();
                } else {
                    lista = lista.getSiguiente();
                }

            }
            if (lista.getNodo().getNombre().equals(nombre)) {
                return lista.getNodo().toString();
            } else {
                return "no existe";
            }

        }
    }
}
