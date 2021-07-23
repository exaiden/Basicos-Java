import java.util.Scanner;

public class LogIn{
  public static void main(String args[]){
   
   String user = "", pass = "";
   Scanner login = new Scanner(System.in);
   
   System.out.print("Ingresa tu usuario: ");
   user = login.nextLine();
   
   System.out.print("Ingresa tu contraseña: ");
   pass = login.nextLine();
   
   if(user.equals("Sacowea") && pass.equals("123456")){
    System.out.println("Inicio Correcto");
  }else{
    System.out.println("Nombre de usuario o contraseña incorrectos");
  }
 }
}