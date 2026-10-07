public class Curso {

    // Atributos
    private String codigo;
    private String nombre;
    private int creditos;
    private String docente;
    private int cupoMaximo;

    // Constructor
    public Curso(String codigo, String nombre, int creditos,
                 String docente, int cupoMaximo) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
        this.cupoMaximo = cupoMaximo;
    }

    // Getter codigo
    public String getCodigo() {
        return codigo;
    }

    // Setter codigo
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
            System.out.println("El nombre del curso no puede estar vacío.");
        }
    }

    // Getter creditos
    public int getCreditos() {
        return creditos;
    }

    // Setter creditos
    public void setCreditos(int creditos) {
        if (creditos > 0) {
            this.creditos = creditos;
        } else {
            System.out.println("Los créditos deben ser mayores que cero.");
        }
    }

    // Getter docente
    public String getDocente() {
        return docente;
    }

    // Setter docente
    public void setDocente(String docente) {
        this.docente = docente;
    }

    // Getter cupo máximo
    public int getCupoMaximo() {
        return cupoMaximo;
    }

    // Setter cupo máximo
    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo > 0) {
            this.cupoMaximo = cupoMaximo;
        } else {
            System.out.println("El cupo debe ser mayor que cero.");
        }
    }

    // Mostrar información del curso
    public void mostrarInformacion() {

        System.out.println( "Curso: " + codigo + " - " + nombre +  " Créditos: " + creditos +"  Docente: " + docente + " Cupos: " + cupoMaximo
        );
    }

    // Verificar si tiene cupo
    public boolean tieneCupo() {

        return cupoMaximo > 0;
    }

    // toString
    @Override
    public String toString() {

        return "Curso [" +  "codigo: " + codigo + ", nombre: " + nombre + ", creditos: " + creditos + ", docente: " + docente +
                ", cupoMaximo: " + cupoMaximo +"]";
    }
}