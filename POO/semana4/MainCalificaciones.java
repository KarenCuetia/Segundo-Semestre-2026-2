package POO.semana4;

public class MainCalificaciones {

   
    public static void main(String[] args) {
        
        // creacion de objeto
        Calificaciones objCalificaciones1 = new Calificaciones("1098765456","Daniela","022014","2do semestre",4.0,4.2,5.0);
        
        System.out.println(objCalificaciones1.toString());
        
        double p = objCalificaciones1.promedio();
        
        System.out.println(objCalificaciones1.toString());
        
        objCalificaciones1.calcularpromedio(p);
        
        System.out.println("El promedio es: " + objCalificaciones1.promedio());
    
       

    }
    
}
