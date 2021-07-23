import javax.swing.*;

public class Formulario extends JFrame{
  private JTextField textfield_1;
  private JTextArea textarea_1;
  
  public Formulario(){
   setLayout(null);
   textfield_1 = new JTextField();
   textfield_1.setBounds(10,10,200,30);
   add(textfield_1);
   
   textarea_1 = new JTextArea();
   textarea_1.setBounds(10,50,400,300);
   add(textarea_1);
 }
  
  public static void main(String args[]){
   Formulario formulario_1 = new Formulario();
   formulario_1.setBounds(0,0,540,400);
   formulario_1.setVisible(true);
   formulario_1.setResizable(false);
   formulario_1.setLocationRelativeTo(null);
 }
}