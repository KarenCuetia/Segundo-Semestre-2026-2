package POO.Semana4;

public class MainVehiculos {
    public static void main(String[] args) {
        // creacion de objeto
        Vehiculos objVehiculos1 = new Vehiculos("KIA", "Picanto", 2020, 80000000.0);
        Vehiculos objVehiculos2 = new Vehiculos("Honda", "Civic", 2019, 18000000.0);
        System.out.println(objVehiculos1.toString());
        System.out.println(objVehiculos2.toString());

        objVehiculos1.mostrarInformacion();
        objVehiculos2.mostrarInformacion();
    }
}
