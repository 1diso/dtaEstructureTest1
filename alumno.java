public class alumno {
    private int numeroControl;
    private String nombreAlumno;
    private String carrera;
    private int semestre;

    public alumno(int numeroControl, String nombreAlumno, String carrera, int semestre) {
        this.numeroControl = numeroControl;
        this.nombreAlumno = nombreAlumno;
        this.carrera = carrera;
        this.semestre = semestre;

    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setNumero(int numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombre(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;

    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
