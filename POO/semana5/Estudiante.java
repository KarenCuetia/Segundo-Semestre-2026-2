public class Estudiante {

    // Atributos
    private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private String programa;
    private int semestre;

    // Constructor
    public Estudiante(String nombre, String documento, int edad,
                      String correo, String programa, int semestre) {

        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.programa = programa;
        this.semestre = semestre;
    }

    // Getter nombre
    public String getNombre() {
        return nombre;
    }

    // Setter nombre
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    // Getter documento
    public String getDocumento() {
        return documento;
    }

    // Setter documento
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    // Getter edad
    public int getEdad() {
        return edad;
    }

    // Setter edad
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Getter correo
    public String getCorreo() {
        return correo;
    }

    // Setter correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Getter programa
    public String getPrograma() {
        return programa;
    }

    // Setter programa
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    // Getter semestre
    public int getSemestre() {
        return semestre;
    }

    // Setter semestre
    public void setSemestre(int semestre) {
        if (semestre >= 1) {
            this.semestre = semestre;
        } else {
            System.out.println("El semestre debe ser mayor o igual a 1.");
        }
    }

    // Método avanzar semestre
    public void avanzarSemestre() {

        if (semestre >= 1) {
            semestre++;
            System.out.println(
                nombre + " avanzó al semestre " + semestre
            );
        }
    }

    // Método verificar mayoría de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // toString
    @Override
    public String toString() {

    return "Estudiante [" + "nombre: " + nombre + ", documento: " + documento + ", edad: " + edad + ", correo: " + correo +
    ", programa: " + programa + ", semestre: " + semestre +
"]";
    }
}