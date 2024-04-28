package datos;
import javax.swing.JOptionPane;

public class puteros {

public static void main(String[] args) {
   
    estudiantes est = new estudiantes("pepe", "123", "c123");
    estudiantes est1 = new estudiantes("juan", "1223", "c2123");
    estudiantes est2 = new estudiantes("pepeche", "112323", "c123123");

    
    ListasEstudiantes lista = new ListasEstudiantes();
    
    lista.AgregarEstudiante(est);
    lista.AgregarEstudiante(est1);
    lista.AgregarEstudiante(est2);
    
    lista.imprimirLista();
    
    String n = JOptionPane.showInputDialog(null, "nombre del degenerado:");
    
    String a = lista.buscarName(n);
    JOptionPane.showMessageDialog(null, a);

}


}