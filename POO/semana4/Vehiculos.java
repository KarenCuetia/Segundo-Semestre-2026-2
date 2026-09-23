package POO.semana4;

public class Vehiculos {
    // atributos
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    // constructor
    public Vehiculos(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String toString() {
        return "Vehiculos [ marca:" + marca + " modelo: " + modelo + " año: " + año +
                " precio: " + precio + "]";
    }

    // creacion de metodos
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
    }
}