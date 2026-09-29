package POO.semana4;

public class MainVehiculos {
   public static void main(String[] args) {

        // Crear el objeto
        Vehiculos objvehiculos1 = new Vehiculos("KIA", "picanto", 2020, 90000000);
        Vehiculos objvehiculos2 = new Vehiculos("TOYOTA", "prado", 2022,120000000 );
        // Mostrar información
        System.out.println(objvehiculos1.toString());
        System.out.println(objvehiculos2.toString());
        
        
        // Primera venta
        objvehiculos1.vender();

        // Intentar vender nuevamente
        objvehiculos1.vender();

        objvehiculos2.vender();

        objvehiculos2.vender();

        // Mostrar información final
        System.out.println(objvehiculos1);
        System.out.println(objvehiculos2);
    }
}
