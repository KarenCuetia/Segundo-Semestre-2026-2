public class Medico {
    private String nombre;
    private String documento;
    private String telefono;
    private String correo;
    private String especialidad;
    private String consultorio;

    // Constructor
    public Medico(String nombre, String documento,
                  String telefono, String correo, String especialidad, String consultorio) {

        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
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

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        if (especialidad != null && !especialidad.trim().isEmpty()) {
            this.especialidad = especialidad;
        } else {
            System.out.println("La especialidad no puede estar vacía.");
        }
    }

    public String getConsultorio() {
        return consultorio;
    }
    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }
      // Método 1
    public void mostrarInformacion() {
        System.out.println("Médico: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Consultorio: " + consultorio);
        System.out.println("Teléfono: " + telefono);
    }

    // Método 2
    public boolean esEspecialista() {
        return especialidad != null && !especialidad.equalsIgnoreCase("Medicina General");
    }

    // Método 3
    public void cambiarConsultorio(String nuevoConsultorio) {
        if (nuevoConsultorio != null && !nuevoConsultorio.trim().isEmpty()) {
            consultorio = nuevoConsultorio;
            System.out.println("Consultorio actualizado correctamente.");
        } else {
            System.out.println("El consultorio no puede estar vacío.");
        }
    }

    // toString
    @Override
    public String toString() {
    return "Medico ["+ ", nombre: " + nombre + "documento: " + documento + ", telefono: " + telefono + ", correo: " + correo +
     ", especialidad: " + especialidad + ", consultorio: " + consultorio + "]";
    }
}

