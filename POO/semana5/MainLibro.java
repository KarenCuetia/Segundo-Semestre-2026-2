package POO.semana5;

public class MainLibro {

    public static void main(String[] args){

    //ceacion de 5 libros 

        Libro libro1 = new Libro("978-0-123456-47-2", "El principito", "Antoine de Saint-Exupéry", 1943, true);
        Libro libro2 = new Libro("978-0-123456-48-9", "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, true);
        Libro libro3 = new Libro("978-0-123456-49-6", "Cien años de soledad", "Gabriel García Márquez", 1967, true);
        Libro libro4 = new Libro("978-0-123456-50-2", "Rayuela", "Julio Cortázar", 1963, true);
        Libro libro5 = new Libro("978-0-123456-51-9", "La sombra del viento", "Carlos Ruiz Zafón", 2001, true);
    

    //mostrat informacion
     System.out.println(libro1.toString());
     System.out.println(libro2.toString());
     System.out.println(libro3.toString());
     System.out.println(libro4.toString());
     System.out.println(libro5.toString());

     // mostrar sol el titulo del libro2
     System.out.println("nombre del libro2: " + libro2.getTitulo());

     //cambiar el isbn del libro 5
     libro5.setIsbn("0000-00");
     System.out.println("nuevo Isbn del libro5:" + libro5.getisbn());

     // verifiacar si el libro 3 esta disponible
     System.out.println("el libro3 esta disponible:" + libro3.estaDisponible() ); //true

     //prestar el libro3
     libro3.prestar();
     //verifiacar si eñ libro3 esta disponible
     System.out.println("libro3 no esta disponible:" + libro3.estaDisponible()); //false

     //devlver el libro 3
     libro3.devolver();

     System.out.println("el libro 3 esta dsipoble:" + libro3.estaDisponible());
    



    }

    
}
