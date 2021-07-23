import java.util.Scanner;

public class Inputs{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int num1 = 0, num2 = 0, result = 0;
   
   System.out.println("¿Cual es tu nombre?");
   nombre = in.nextLine();

   System.out.println("Dame el primer valor para tu suma:");
   num1 = in.nextInt();
   
   System.out.println("Dame el segundo valor para tu suma:");
   num2 = in.nextInt();
   
   result = num1 + num2;
   
   System.out.println("Hola " + nombre + ", " + " El resultado de tu suma es: " + result);
 }
}