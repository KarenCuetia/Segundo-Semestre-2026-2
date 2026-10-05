
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

        // Constructor
    public Producto(int codigo, String nombre, double precio, int stock) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

     // Setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    // Método vender
    public void vender(int cantidad) {

        if (cantidad <= 0) {

            System.out.println("La cantidad debe ser mayor que cero.");

        } else if (cantidad > stock) {

            System.out.println("No hay suficiente stock.");

        } else {

            stock -= cantidad;

            System.out.println(
                "Venta realizada correctamente: "
                + cantidad + " unidad(es) de " + nombre
            );
        }
    }

    // Método reabastecer
    public void reabastecer(int cantidad) {

        if (cantidad > 0) {

            stock += cantidad;

            System.out.println( "Producto reabastecido correctamente." );

        } else {

            System.out.println( "La cantidad debe ser mayor que cero." );
        }
    }

    // Método calcular valor del inventario
    public double calcularValorInventario() {

        return precio * stock;
    }

    // Método toString
    @Override
    public String toString() {return "Producto [codigo: " + codigo + ", nombre: " + nombre+ ", precio: " + precio
     + ", stock: " + stock + "]";
    }
}
    

