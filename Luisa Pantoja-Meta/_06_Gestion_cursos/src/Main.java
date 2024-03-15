import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Ejercicio 3: Sistema de Gestión de Cursos
        Objetivo: Implementar un sistema para gestionar cursos y estudiantes, aplicando
        abstracción y polimorfismo, y utilizando ArrayList para manejar las inscripciones.

        Principios de POO aplicados: Abstracción, Polimorfismo.

                Requisitos:

        Clase Curso: Con propiedades como codigo, nombre, y listaEstudiantes, donde
        listaEstudiantes es un ArrayList de objetos Estudiante.
                Clase Estudiante: Con propiedades como id, nombre, y email.

                Clase GestionCursos: Encargada de administrar los cursos, incluyendo métodos para
        agregar cursos, inscribir estudiantes en cursos y listar estudiantes inscritos en un curso
        específico.*/


        //Instancias
        Scanner objScanner = new Scanner(System.in);
        GestionCurso objGestion = new GestionCurso();

        int option = 0;

        do{
            System.out.println("""
                    MENU DE OPCIONES
                    1. Administrar cursos.
                    2. Administrar estudiantes.
                    3. Salir
                    """);
            option = objScanner.nextInt();
            switch (option){
                case 1:
                    int option2 = 0;
                    do {
                        System.out.println("""
                            MENU DE CURSOS
                            1. Crear un curso.
                            2. Buscar curso por código
                            3. Listar cursos.
                            4. Salir.
                            """);
                        option2 = objScanner.nextInt();
                        switch (option2){
                            case 1:
                                objGestion.guardarCurso(objScanner);
                                break;
                            case 2:
                                System.out.println("Ingresa el código del curso: ");
                                String codigo = objScanner.next();
                                System.out.println(objGestion.buscarPorCodigo(codigo).toString());
                                break;
                            case 3:
                               objGestion.listarCursos();
                                break;
                        }
                    }while (option2 != 4);
                    break;
                case 2:
                    int option3 = 0;
                    do {
                        System.out.println("""
                                MENU DE GESTION DE ESTUDIANTES
                                1. Agregar un estudiante.
                                2. Eliminar un estudiante
                                3. Listar estudiantes.
                                4. Salir.
                                """);
                        option3 = objScanner.nextInt();
                        switch (option3){
                            case 1:
                                objGestion.listarCursos();

                                System.out.println("Ingrese el código del curso donde desea inscribir al estudiante");
                                String codigo = objScanner.next();
                                Curso curso = objGestion.buscarPorCodigo(codigo);

                                if(curso == null){
                                    System.out.println("Curso no encontrado");
                                }else {
                                    curso.guardarEstudiante(objScanner);
                                }
                                break;
                            case 2: //Caso para eliminar un estudiante
                                //1. Listar todos los cursos
                                objGestion.listarCursos();

                                //2. Preguntar al usuario de cuál es el curso del estudiante a eliminar
                                System.out.println("Ingrese el código del curso del estudiante a eliminar");
                                codigo = objScanner.next();

                                //3. Llamar al método que elimina
                                Curso objCurso = objGestion.buscarPorCodigo(codigo);
                                if (objCurso == null) {
                                    System.out.println("Código no válido");
                                } else {
                                    //Eliminar
                                    objCurso.eliminarEstudiante(objScanner);
                                }
                                break;

                            case 3:
                                System.out.println("Ingrese el código del curso donde desea inscribir al estudiante");
                                codigo = objScanner.next();
                                curso = objGestion.buscarPorCodigo(codigo);

                                if(curso == null){
                                    System.out.println("Curso no encontrado");
                                }else {
                                    curso.listarEstudiantes();
                                }
                                break;
                        }
                    }while (option3 != 4);
                        break;
            }
        }while (option != 3);
    }
}
