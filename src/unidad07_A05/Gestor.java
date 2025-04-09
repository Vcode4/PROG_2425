package unidad07_A05;

class Gestor {
    public String nombre;
    private final String telefono;  // No puede cambiar una vez asignado
    double importeMaximo;  // Solo visible para clases vecinas (mismo paquete)

    // Constructor con importe m�ximo predeterminado
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000; // Valor por defecto
    }

    // Constructor con importe m�ximo personalizado
    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    // M�todo para obtener el tel�fono (no se puede modificar)
    public String getTelefono() {
        return telefono;
    }
}