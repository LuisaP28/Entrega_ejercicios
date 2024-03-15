import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {
    private ArrayList<Empleado>empleados;
   // private String nombre;

    //Método
    //Constructor
    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

    //Añadir un empleado
    
   public void anadirEmpleado(Empleado empleado) {
       empleados.add(empleado);
   }

   //Eliminar un empleado
   public boolean eliminarEmpleado(int idEmpleado){
        return empleados.removeIf(emp -> emp.getIdEmpleado() == idEmpleado);
   }
   public void mostrarEmpleados(){
        for (Empleado emp : empleados){
            System.out.println("ID Empleado: " + emp.getIdEmpleado() + ", Nombre: " + emp.getNombre() + ", Salario: " + emp.getSalario());
        }
   }
}
