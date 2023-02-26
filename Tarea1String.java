import java.util.Scanner;

public class Tarea1String{
    public static void main(string[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce una cadena que tenga un nombre, una profesion y una nacionalidad:");
        java.lang.String  datos= teclado.nextLine();
        java.lang.String[] separado = entrada.split("");

        String nombre = separado[0];
        String profesion = separado[1];
        String nacionalidad = separado [2];

          System.out.println("Nombre : " + (separado[0].toUpperCase()));
          System.out.println("Profesion : " + (separado[1].toUpperCase()));
          System.out.println("Nacionalidad:  " + (separado[2].toUpperCase()));



        /*System.out.println("entrada : "+ datos);
        String[]arreglo =datos.split(",");
               for(i=0; i < arreglo.length ; i++){
               System.out.println("la cadena queda:" + (arreglo[i].toUpperCase()));
               
   
               }*/
    }
}