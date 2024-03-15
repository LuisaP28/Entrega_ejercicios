public class EmpleadoPermanente extends Empleado{
    private int anosAntiguedad;
    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario, int anosAntiguedad) {
        super(nombre, edad, idEmpleado, salario);
        this.anosAntiguedad = anosAntiguedad;
    }

    //Getters and setters

    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }

    public void setAnosAntiguedad(int anosAntiguedad) {
        this.anosAntiguedad = anosAntiguedad;
    }
}
