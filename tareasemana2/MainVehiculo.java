package tareasemana2;

public class MainVehiculo {
   
    public static void main(String[] args) {
        //crecion de objeto de la clase de vehiculo
        Vehiculo  objVehiculo1 = new Vehiculo();
        Vehiculo  objVehiculo2 = new Vehiculo();

        objVehiculo1 .marca =  "KIA";
        objVehiculo1 .modelo =  "Picanto";
        objVehiculo1 .año =   2020;
        objVehiculo1 .velocidad =   180;

        objVehiculo2 .marca =  "Toyota";
        objVehiculo2 .modelo =  "Corolla";
        objVehiculo2 .año =  2026;
        objVehiculo2 .velocidad = 180;

        objVehiculo1 .mostrarInformacio();
        objVehiculo2 .mostrarInformacio();
    }
}