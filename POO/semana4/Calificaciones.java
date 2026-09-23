 package POO.semana4;

class Calificaciones {
    private String cedula;
    private String nombre;
    private String codigo;
    private String curso;
    private double nota1;
    private double nota2;
    private double nota3;




 public Calificaciones(String cedula, String nombre, String codigo, String curso, double nota1, double nota2, double nota3){

    this.cedula = cedula;
    this.nombre = nombre;
    this.codigo = codigo;
    this.curso = curso;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
 }
 public String toString(){
   return  "Calificaciones [ cedula:" + cedula + "nombre:" + nombre + "codigo:" + codigo + "curso:" + curso + "nota1:" + nota1 + "nota2" + nota2 + "nota3" + nota3 + "[]";
 }

 public double promedio () {
     return  (nota1+nota2+nota3) /3;
 }
 
 public void calcularpromedio (double  promedio){
    if (promedio >= 3.0)
      System.out.println ( "APROVADO");
 }
     {
      System.out.println ( "NO APROVO");
   } 

}