package POO.semana4;

public class Producto {

    // Atributos
    private int codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(int codigo, String nombre, String categoria,
                    double precio, int cantidad) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para agregar productos
    public void agregarProducto(int cantidadAgregar) {

        if (cantidadAgregar > 0) {
            cantidad += cantidadAgregar;
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
        }
    }

    // Método para retirar productos
    public void retirarProducto(int cantidadRetirar) {

        if (cantidadRetirar <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");

        } else if (cantidadRetirar > cantidad) {
            System.out.println("No hay suficiente inventario.");

        } else {
            cantidad -= cantidadRetirar;
            System.out.println("Producto retirado correctamente.");
        }
    }

    // Método para mostrar información
    public String toString() {

        return "Producto [" +
                "codigo: " + codigo +
                ", nombre: " + nombre +
                ", categoria: " + categoria +
                ", precio: " + precio +
                ", cantidad: " + cantidad +
                "]";
    }
}