

public class MainProducto {
    
    public static void main(String[] args) {
        // Crear productos

        Producto Producto1 = new Producto(2091, "laptop", 4500000, 30);
        Producto Producto2 = new Producto(3021,"teclado", 200000, 80);
        Producto producto3 = new Producto(103, "mause", 150000, 15);

        // Mostrar productos
        System.out.println(Producto1.toString());
        System.out.println(Producto2.toString());
        System.out.println(producto3.toString());

        // Realizar una venta

        System.out.println("venta");

        Producto1.vender(30);

        System.out.println(Producto1);

        // Intentar vender más productos de los disponibles

        Producto2.vender(25);

        // Reabastecer producto

        System.out.println("Rebastecer");

        Producto1.reabastecer(5);

        System.out.println(Producto1);

        // Calcular valor del inventario

        System.out.println("valor inventario");

        System.out.println( "Valor inventario Laptop: $" + Producto1.calcularValorInventario());

        System.out.println( "Valor inventario teclado: $" + Producto2.calcularValorInventario());

        System.out.println( "Valor inventario mause: $"+ producto3.calcularValorInventario());

    }




}
