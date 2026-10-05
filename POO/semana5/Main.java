public class Main {

    public static void main(String[] args) {

        
        // CREACIÓN DE ESTUDIANTES

        Estudiante estudiante1 = new Estudiante( "Juan", "10101010", 20,"juan@gmail.com",
        "Ingeniería de Sistemas",3 );

        Estudiante estudiante2 = new Estudiante("Maria",  "20202020", 22, "maria@gmail.com",
        "Administración", 5);

        Estudiante estudiante3 = new Estudiante("Carlos","30303030",19, "carlos@gmail.com",
        "Contaduría",2 );

        Estudiante estudiante4 = new Estudiante("Laura","40404040",21,"laura@gmail.com",
        "Ingeniería Industrial",4);

        Estudiante estudiante5 = new Estudiante("Andrés","50505050",18,"andres@gmail.com",
        "Ingeniería de Sistemas",1);

        
        // MOSTRAR ESTUDIANTES

        System.out.println("ESTUDIANTES");

        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
        System.out.println(estudiante4);
        System.out.println(estudiante5);

        
        // CREACIÓN DE CURSOS

        Curso curso1 = new Curso("PROG101","Programación",3,"Carlos Gómez",
        30);

        Curso curso2 = new Curso("MAT101","Matemáticas",4,"Ana Rodríguez",
        25);

        Curso curso3 = new Curso("BD101","Bases de Datos",3,"Pedro Martínez",
        20);

        
        // MOSTRAR CURSOS
        
        System.out.println(" CURSOS ");

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        
        // MOSTRAR INFORMACIÓN
        

        System.out.println(" INFORMACIÓN DE CURSOS");

        curso1.mostrarInformacion();
        curso2.mostrarInformacion();
        curso3.mostrarInformacion();

        
        // VERIFICAR MAYORÍA DE EDAD
        

        System.out.println(" MAYORÍA DE EDAD ");

        System.out.println(estudiante1.getNombre() + " es mayor de edad: " + estudiante1.esMayorDeEdad());

        System.out.println(estudiante3.getNombre() +" es mayor de edad: " + estudiante3.esMayorDeEdad());

       
        // AVANZAR SEMESTRE

        System.out.println(" AVANCE DE SEMESTRE ");

        estudiante1.avanzarSemestre();

        System.out.println(estudiante1);

        
        // MODIFICAR INFORMACIÓN CON SETTERS
       

        System.out.println("MODIFICACIÓN DE INFORMACION");

        System.out.println("Antes:");
        System.out.println(estudiante2);

        estudiante2.setCorreo("maria.nuevo@gmail.com");
        estudiante2.setSemestre(6);

        System.out.println("Después:");
        System.out.println(estudiante2);

        
        // PROBAR VALIDACIONES
        
        System.out.println(" VALIDACIONES ");

        // Edad inválida
        estudiante1.setEdad(-5);

        // Semestre inválido
        estudiante3.setSemestre(0);

        // Nombre vacío
        estudiante4.setNombre("");

        // Crédito inválido
        curso1.setCreditos(0);

        
        // COMPROBAR CUPOS
     
        System.out.println("CUPOS DE CURSOS");

        System.out.println(curso1.getNombre() + " tiene cupo: " + curso1.tieneCupo());

        System.out.println(curso2.getNombre() + " tiene cupo: " + curso2.tieneCupo());

        System.out.println(curso3.getNombre() +" tiene cupo: " +curso3.tieneCupo());
    }
}