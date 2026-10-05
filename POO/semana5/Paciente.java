public class Paciente {
    private String nombre;
    private String documento;
    private int edad;
    private String telefono;
    private String correo;
    private String enfermedad;

    // Constructor
    public Paciente(String nombre, String documento, int edad, String telefono, String correo, String enfermedad) {

        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.enfermedad = enfermedad;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    // Getter y Setter para documento
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    // Getter y Setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    // Getter y Setter para telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // Getter y Setter para correo
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Getter y Setter para enfermedad
    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    // Método 1
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método 2
    public void actualizarTelefono(String nuevoTelefono) {
        if (nuevoTelefono != null && !nuevoTelefono.trim().isEmpty()) {
            telefono = nuevoTelefono;
            System.out.println("Teléfono actualizado correctamente.");
        } else {
            System.out.println("El teléfono no puede estar vacío.");
        }
    }

    // Método 3
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Enfermedad: " + enfermedad);
    }

    // toString
    @Override
    public String toString() {
        return "Paciente [" + "documento: " + documento + ", nombre: " + nombre + ", edad: " + edad +
        ", telefono: " + telefono +", correo: " + correo +
        ", enfermedad: " + enfermedad + "]";
    }
}