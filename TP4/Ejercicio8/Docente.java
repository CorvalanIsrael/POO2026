public class Docente extends Persona {
    private String numeroEmpleado;
    private String departamento;

    public Docente(String nombre, String dni, String numeroEmpleado, String departamento) {
        super(nombre, dni);
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + getNombre() + ", Empleado: " + numeroEmpleado + ", Departamento: " + departamento);
    }
}
