import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        Empleado empleado1 = new EmpleadoPermanente("Keity Ortega", 26, 1, 5000000, 5 );
        Empleado empleado2 = new EmpleadoTemporal("Miguel Tabares", 28, 2, 6500000, "20/06/2025");

        gestionEmpleados.anadirEmpleado(empleado1);
        gestionEmpleados.anadirEmpleado(empleado2);

        gestionEmpleados.mostrarEmpleados();
        gestionEmpleados.eliminarEmpleado(1);

        System.out.println("\nDespués de eliminar:");
        gestionEmpleados.mostrarEmpleados();
    }
}