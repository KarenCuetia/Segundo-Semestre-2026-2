package POO.semana4;

public class MainProducto {

    public static void main(String[] args) {

        // Creación del objeto
        Producto producto1 = new Producto(101, "Laptop", "Tecnología", 2500000.0,
         10 );

        // Mostrar información inicial
        System.out.println(producto1);

        // Agregar productos
        producto1.agregarProducto(5);

        // Mostrar información
        System.out.println(producto1);

        // Retirar productos
        producto1.retirarProducto(3);

        // Mostrar información
        System.out.println(producto1);

        // Intentar retirar más productos de los disponibles
        producto1.retirarProducto(20);

        // Mostrar información final
        System.out.println(producto1);
    }
}