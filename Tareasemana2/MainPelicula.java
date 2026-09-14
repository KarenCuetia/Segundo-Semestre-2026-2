package Tareasemana2;

public class MainPelicula {
       public static void main(String[] args) {
         
        //creacion de objeto de la clase de pelicula
        Pelicula objPelicula1 = new pelicula();
        pelicula objPelicula2 = new pelicula();

        objPelicula1 .titulo = "El increible castillo vagabundo";
        objPelicula1 .director = "Hayao Miyazaki";
        objPelicula1 .duracion = 199;
        objPelicula1 .genero = "Animacion";

        objPelicula2 .titulo = "Your Name";
        objPelicula2 .director = "Makoto Shinkai";
        objPelicula2 .duracion = 106;
        objePelicula2 .genero = "Animacion";

        objPelicula1 .mostrarInformacio();
        objPelicula2 .mostrarInfromacion();

       }