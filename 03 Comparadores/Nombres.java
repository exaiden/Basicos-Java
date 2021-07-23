import java.util.Scanner;

public class Nombres{
  public static void main(String args[]){
   
   String nombre1 = "", nombre2 = "";
   Scanner entrada = new Scanner(System.in);
   
   System.out.print("Ingresa el primer nombre: ");
   nombre1 = entrada.nextLine();
   
   System.out.print("Ingresa el segundo nombre: ");
   nombre2 = entrada.nextLine();
   
   if(nombre1.equals(nombre2) ){
    System.out.println("Los nombre son iguales");
  }else{
    System.out.println("Los nombres son diferentes");
  }
 }
}