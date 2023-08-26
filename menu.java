import javax.swing.*;

public class menu {

    public static void main(String[] args) {
        //  aqui se establece el tamaño máximo del vector hardcodeado :P
        vectorAlumno vectorAlumno = new vectorAlumno(100); 

        int respuesta;
        do {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog(
                "[1] Agregar Alumno\n" +
                "[2] Mostrar Alumnos\n" +
                "[3] Salir"
            ));


            switch (respuesta) {
                //ingresar personita
                case 1:
                    int numeroControl = Integer.parseInt(JOptionPane.showInputDialog("Número de Control:"));
                    String nombreAlumno = JOptionPane.showInputDialog("Nombre:");
                    String carrera = JOptionPane.showInputDialog("Carrera:");
                    int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre:"));
                    alumno alumno = new alumno(numeroControl, nombreAlumno, carrera, semestre);
                    vectorAlumno.agregarAlumno(alumno);
                    break;
                    //submenu dentro de la opcion mostrar
                    case 2:
                    int opcionMostrar = Integer.parseInt(JOptionPane.showInputDialog(
                        "Seleccione una opción:\n" +
                        "[1] Mostrar todos los alumnos\n" +
                        "[2] Mostrar por Carrera\n" +
                        "[3] Mostrar por Semestre\n" +
                        "[4] Regresar"
                    ));

                    switch (opcionMostrar) {
                        case 1:
                            vectorAlumno.mostrarAlumnos();
                            break;
                        //busca a alumnos por carrera y los muestra
                        case 2:
                            String carreraBuscar = JOptionPane.showInputDialog("Ingrese la carrera a buscar:");
                            vectorAlumno.mostrarAlumnosPorCarrera(carreraBuscar);
                            break;
                        //busqueda por smstre
                        case 3:
                            int semestreBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el semestre a buscar:"));
                            vectorAlumno.mostrarAlumnosPorSemestre(semestreBuscar);
                            break;
                        //volver al menu principal
                        case 4:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Hasta luego.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (respuesta != 3);
    }
}