import java.util.Scanner;

public class Cadena{
  public static void main(String args[]){
   
   String original = "", sustraccion = "";
   int num_caracteres = 0, desde = 0, hasta = 0;
   Scanner in = new Scanner(System.in);
   
   System.out.print("Introduce un texto: ");
   original = in.nextLine();
   
   num_caracteres = original.length();
   
   System.out.println("El texto " + original + " posee " + num_caracteres + " caracteres");
   
   System.out.print("¿Desde que caracter deseas obtener el nuevo texto?: ");
   desde = in.nextInt();
   System.out.print("¿Hasta que caracter deseas obtener el nuevo texto?: ");
   hasta = in.nextInt();
   
   sustraccion = original.substring(desde, hasta);
   System.out.println("El nuevo texto es: " + sustraccion);
 }
}