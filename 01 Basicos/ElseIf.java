public class ElseIf{
  public static void main(String args[]){
   int op = 2;
   int num1 = 8;
   int num2 = 4;
   int result = 0;

   if(op == 1){
    result = num1 + num2;
    System.out.println("El resultado de la suma es: " + result);
  }
   else if(op == 2){
    result = num1 - num2;
    System.out.println("El resultado de la resta es: " + result);
  }
   else if(op == 3){
    result = num1 * num2;
    System.out.println("El resultado de la multiplicacion es: " + result);
  }
   else if(op == 4){
    result = num1 / num2;
    System.out.println("El resultado de la division es: " + result);
  }
   else{
    System.out.println ("La operacion no existe");
  }
 }
}