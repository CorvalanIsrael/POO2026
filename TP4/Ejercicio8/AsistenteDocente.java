public class AsistenteDocente extends Docente {
    private Alumno alumno;

    public AsistenteDocente(String nombre, String dni, String numeroEmpleado, 
                            String departamento, String matricula, int semestre) {
        super(nombre, dni, numeroEmpleado, departamento);
        this.alumno = new Alumno(nombre, dni, matricula, semestre);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Asistente Docente: " + getNombre());
        System.out.println("  - Como Docente: Empleado " + getNumeroEmpleado() + ", Departamento: " + getDepartamento());
        System.out.println("  - Como Alumno: Matrícula " + alumno.getMatricula() + ", Semestre: " + alumno.getSemestre());
    }

    // Método para simular la graduación: el alumno se recibe y pasa a ser solo docente
    public Docente recibirseComoDocente() {
        System.out.println("\n[Transición] " + getNombre() + " se ha recibido y ahora es solo Docente");
        return new Docente(getNombre(), getDni(), getNumeroEmpleado(), getDepartamento());
    }
}
