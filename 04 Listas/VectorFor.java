import java.util.Scanner;

public class VectorFor{
  public static void main(String args[]){
   
   int longitud = 0;
   Scanner enter = new Scanner(System.in);
   
   System.out.print(" ¿Cuantos numeros vas a ingresar?");
   longitud = enter.nextInt();
   
   int numeros[] = new int[longitud];
   
   for(int i = 0; i < numeros.length; i++){
    System.out.println(" Dame el valor #" + (i + 1));
    numeros[i] = enter.nextInt();
  } 
   for(int i = 0; i < numeros.length; i++){
    System.out.print("[" + numeros[i] + "]");
  }
 }
}