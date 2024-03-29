import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {

    private ArrayList<Curso> listaCursos;

    //Métodos
    //Constructor
    public GestionCurso(){
        this.listaCursos = new ArrayList<>();
    }


    public void guardarCurso(Scanner objScanner){
        System.out.println("Agregar curso");

        System.out.println("Ingresa el nombre del curso: ");
        String nombre = objScanner.next();

        System.out.println("Ingresa el código del curso: ");
        String codigo = objScanner.next();
        //Si el método buscar no devuelve null, quiere decir que ese código ya existe
        if (this.buscarPorCodigo(codigo) != null){
            System.out.println("El código ya existe");
        }else{ //Creamos el curso
            Curso objCurso = new Curso(codigo,nombre);
            this.listaCursos.add(objCurso);
        }
    }

    public Curso buscarPorCodigo(String codigoBuscar){
        for (Curso cursoTemp : this.listaCursos){
            if (cursoTemp.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return cursoTemp;
            }
        }
        return null;
    }

    public void listarCursos(){
        if (this.listaCursos.isEmpty()){
            System.out.println("No hay cursos registrados");
        }else {
            System.out.println("Lista de cursos.");
            for (Curso temp : this.listaCursos) {
                System.out.println(temp.toString());
            }
        }
    }

    //Getter and setter
    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
}
