import javax.swing.*;

public class InterfazUWU extends JFrame{
  
  private JLabel label_1;
  private JLabel label_2;

  public InterfazUWU(){
   setLayout(null);
   label_1 = new JLabel("Pico pal");
   label_1.setBounds(10,20,300,30);
   add(label_1);
   label_2 = new JLabel("ke lee");
   label_2.setBounds(10,100,100,30);
   add(label_2);
 }
  public static void main(String args[]){
   InterfazUWU interfaz_1 = new InterfazUWU();
   interfaz_1.setBounds(0,0,300,200);
   interfaz_1.setResizable(false);
   interfaz_1.setVisible(true);
   interfaz_1.setLocationRelativeTo(null);
 }
}