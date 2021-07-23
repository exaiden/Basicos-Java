import javax.swing.*;

public class InterfazXD extends JFrame{
  public InterfazXD(){
   setLayout(null);
 }
  public static void main(String args[]){
   InterfazXD interfaz_1 = new InterfazXD();
   interfaz_1.setBounds(0,0,400,550);
   interfaz_1.setVisible(true);
   interfaz_1.setLocationRelativeTo(null);
   interfaz_1.setResizable(false);
 }
}