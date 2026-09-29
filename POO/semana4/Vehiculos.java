package POO.semana4;

public class Vehiculos {
    // atributos
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private boolean disponible;


    // constructor
    public Vehiculos(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.disponible = true;
    }

    public String toString() {
        return "Vehiculos [ marca:" + marca + " modelo: " + modelo + " año: " + año +
                " precio: " + precio + "disponible:" + disponible + "]";
    }

    // Método vender
    // Si está disponible se confirma la venta,
    // si no, se deniega
    public void vender() {

        if (disponible) {

        disponible = false;

            System.out.println(
                "Venta confirmada: "  + marca + " " + modelo + " por " + precio );

        } else {

            System.out.println("Venta denegada: " + marca + " " + modelo + " no está disponible" );
        }
}
}
