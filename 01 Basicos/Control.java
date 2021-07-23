import java.util.Scanner;

public class Control{
  public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   int num1 = 10, num2 = 5, result = 0;
   int parametro = 0;

   System.out.println("Dame el parametro:");
   parametro = in.nextInt();
      
   switch(parametro){
    
    case 1: result = num1 + num2;
            System.out.println("");
            System.out.println("El resultado de la suma es: " + result);
            System.out.println("");
            break;
            
    case 2: result = num1 - num2;
            System.out.println("");
            System.out.println("El resultado de la resta es: " + result);
            System.out.println("");
            break;
            
    case 3: result = num1 * num2;
            System.out.println("");
            System.out.println("El resultado de la multiplicacion es: " + result);
            System.out.println("");
            break;
            
    case 4: result = num1 / num2;
            System.out.println("");
            System.out.println("El resultado de la divicion es: " + result);
            System.out.println("");
            break;

   default: System.out.println("");
            System.out.println("ERROR, no se puede usar ese parametro");
            System.out.println("");
            break;
  }
 }
}