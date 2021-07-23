import javax.swing.*;

public class Interfaz extends JFrame{
  private JLabel label_1;
  public Interfaz(){ 
   setLayout(null);
   label_1 = new JLabel("Wena Wena Loh Kbros");
   label_1.setBounds(0,0,200,300);
   add(label_1);
 }

  public static void main(String args[]){
   Interfaz interfaz_1 = new Interfaz();
   interfaz_1.setBounds(0,0,400,300);
   interfaz_1.setVisible(true);
   interfaz_1.setLocationRelativeTo(null);
 }
}