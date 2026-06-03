public class Alumno extends Persona {
    private String matricula;
    private int semestre;

    public Alumno(String nombre, String dni, String matricula, int semestre) {
        super(nombre, dni);
        this.matricula = matricula;
        this.semestre = semestre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alumno: " + getNombre() + ", Matrícula: " + matricula + ", Semestre: " + semestre);
    }
}
