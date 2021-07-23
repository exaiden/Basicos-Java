import javax.swing.*;

public class Formulario2 extends JFrame{
  private JTextField field;
  private JScrollPane scroll;
  private JTextArea area;
  
  public Formulario2(){
   setLayout(null);
   field = new JTextField();
   field.setBounds(10,10,200,30);
   add(field);
   
   area = new JTextArea();
   scroll = new JScrollPane(area);
   scroll.setBounds(10,50,400,300);
   add(scroll);
 }
  
  public static void main(String args[]){
   Formulario2 formu = new Formulario2();
   formu.setBounds(0,0,540,400);
   formu.setVisible(true);
   formu.setResizable(false);
   formu.setLocationRelativeTo(null);
 }
}