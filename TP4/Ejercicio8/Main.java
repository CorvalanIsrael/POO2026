public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema Universitario - Modelado con Herencia ===\n");

        // Caso 1: Una persona solo como Alumno
        System.out.println("1. Estado inicial - Solo Alumno:");
        Alumno alumno1 = new Alumno("Juan Pérez", "12345678", "ALU-2024-001", 5);
        alumno1.mostrarInfo();

        // Caso 2: El alumno avanzado es contratado como Docente auxiliar (ahora es ambas cosas)
        System.out.println("\n2. Alumno contratado como Asistente Docente (AMBOS ROLES):");
        AsistenteDocente asistente = new AsistenteDocente(
            "Juan Pérez", "12345678", "DOC-2024-050", "Informática",
            "ALU-2024-001", 5
        );
        asistente.mostrarInfo();

        // Caso 3: Se recibe y pasa a ser solo Docente
        System.out.println("\n3. Transición: Recibimiento y cambio de rol:");
        Docente docenteFinal = asistente.recibirseComoDocente();
        docenteFinal.mostrarInfo();

        // Caso 4: Ejemplo adicional - otro alumno
        System.out.println("\n4. Otro ejemplo - Solo Docente:");
        Docente docente = new Docente("María García", "87654321", "DOC-2024-051", "Matemáticas");
        docente.mostrarInfo();
    }
}
