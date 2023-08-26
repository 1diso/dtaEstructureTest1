public class vectorAlumno {

    private int tamañoTotal;
    private int numeroInsertados;
    private alumno[] vectorAlumnos;

    public vectorAlumno(int tamañoTotal) {
        this.tamañoTotal = tamañoTotal;
        vectorAlumnos = new alumno[tamañoTotal];
        numeroInsertados = 0;
    }
    //metodo para meter alumnos
    public void agregarAlumno(alumno alumno) {
        if (numeroInsertados < tamañoTotal) {
            vectorAlumnos[numeroInsertados] = alumno;
            numeroInsertados++;
        } else {
            System.out.println("El vector de alumnos está lleno.");
        }
    }
        //mostrar alumnosss
    public void mostrarAlumnos() {
        System.out.println("Lista de Alumnos:");
        for (int i = 0; i < numeroInsertados; i++) {
            System.out.println("Número de Control: " + vectorAlumnos[i].getNumeroControl());
            System.out.println("Nombre: " + vectorAlumnos[i].getNombreAlumno());
            System.out.println("Carrera: " + vectorAlumnos[i].getCarrera());
            System.out.println("Semestre: " + vectorAlumnos[i].getSemestre());
            System.out.println();
        }
    }
        //mostar alumnos pero por carrera, se compara cadena
    public void mostrarAlumnosPorCarrera(String carrera) {
        System.out.println("Alumnos de la Carrera " + carrera + ":");
        for (int i = 0; i < numeroInsertados; i++) {
            if (vectorAlumnos[i].getCarrera().equalsIgnoreCase(carrera)) {
                System.out.println("Número de Control: " + vectorAlumnos[i].getNumeroControl());
                System.out.println("Nombre: " + vectorAlumnos[i].getNombreAlumno());
                System.out.println("Semestre: " + vectorAlumnos[i].getSemestre());
                System.out.println();
            }
        }
    }
    //mostrarlo por semestre same shyyy
    public void mostrarAlumnosPorSemestre(int semestre) {
        System.out.println("Alumnos del Semestre " + semestre + ":");
        for (int i = 0; i < numeroInsertados; i++) {
            if (vectorAlumnos[i].getSemestre() == semestre) {
                System.out.println("Número de Control: " + vectorAlumnos[i].getNumeroControl());
                System.out.println("Nombre: " + vectorAlumnos[i].getNombreAlumno());
                System.out.println("Carrera: " + vectorAlumnos[i].getCarrera());
                System.out.println();
            }
        }
    }
}
