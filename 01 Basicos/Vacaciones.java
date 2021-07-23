import java.util.Scanner;

public class Vacaciones{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String Nombre = "";
   int clave = 0, old = 0;
   
   System.out.println("");
   System.out.println("**************************************************");
   System.out.println("*Bienvenido al sistema de vacaciones de X-Company*");
   System.out.println("**************************************************");
   System.out.println("");
   System.out.println("Deberas introducir los datos del empleado para saber cuantos dias de vacaciones merece");
   System.out.println("");
   System.out.println("");
   System.out.println("");
   
   System.out.println("¿Cual es el nombre del trabajador?");
   Nombre = in.nextLine();
   System.out.println("");
   
   System.out.println("¿Cuantos años de servicio tiene el trabajador?");
   old = in.nextInt();
   System.out.println("");
   
   System.out.println("Introdusca la clave de area del trabajador");
   clave = in.nextInt();
   System.out.println("");
   
   
   
   
   if(clave == 1){
    if(old == 1){
     System.out.println(Nombre + " tiene derecho a 6 dias de vacaciones");
     System.out.println("");
   } else if(old >= 2 && old <= 6){
     System.out.println(Nombre + " tiene derecho a 14 dias de vacaciones");
     System.out.println("");
   } else if(old >= 7){
     System.out.println(Nombre + " tiene derecho a 20 dias de vacaciones");
     System.out.println("");
   } 
  } 
    
   else if(clave == 2){
    if(old == 1){
     System.out.println(Nombre + " tiene derecho a 7 dias de vacaciones");
     System.out.println("");
   } else if(old >= 2 && old <= 6){
     System.out.println(Nombre + " tiene derecho a 15 dias de vacaciones");
     System.out.println("");
   } else if(old >= 7){
     System.out.println(Nombre + " tiene derecho a 22 dias de vacaciones");
     System.out.println("");
   } 
  } 
    
   else if(clave == 3){
    if(old == 1){
     System.out.println(Nombre + " tiene derecho a 10 dias de vacaciones");
     System.out.println("");
   } else if(old >= 2 && old <= 6){
     System.out.println(Nombre + " tiene derecho a 20 dias de vacaciones");
     System.out.println("");
   } else if(old >= 7){
     System.out.println(Nombre + " tiene derecho a 30 dias de vacaciones");
     System.out.println("");
   } 
  } 
    
   else{
    System.out.println("ERROR!, no existe esa area de trabajo");
    System.out.println("");
  }
 }
}