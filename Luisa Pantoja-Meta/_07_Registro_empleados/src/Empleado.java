public class Empleado extends Persona {

    private int idEmpleado;
    private double salario;

    //Constructor

    public Empleado(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public Empleado(int idEmpleado, String nombre, int edad, double salario) {
        super(nombre, edad);
    }

    //Getter and setter

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
    /*//toString

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", salario=" + salario +
                '}';
   }
}
     */
