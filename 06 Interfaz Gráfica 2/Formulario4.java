import javax.swing.*;
import java.awt.event.*;

public class Formulario4 extends JFrame implements ActionListener{
  
  private JTextField field_1, field_2;
  private JLabel label_1, label_2, label_3;
  private JButton boton;
  
  public Formulario4(){
   setLayout(null);
   label_1 = new JLabel("Valor 1:");
   label_1.setBounds(50,5,100,30);
   add(label_1);
   
   label_2 = new JLabel("Valor 2:");
   label_2.setBounds(50,35,100,30);
   add(label_2);
   
   label_3 = new JLabel("Resultado:");
   label_3.setBounds(120,80,100,30);
   add(label_3);
   
   field_1 = new JTextField();
   field_1.setBounds(120,10,150,20);
   add(field_1);
   
   field_2 = new JTextField();
   field_2.setBounds(120,40,150,20);
   add(field_2);
   
   boton = new JButton("Sumar");
   boton.setBounds(10,80,100,30);
   add(boton);
   boton.addActionListener(this);
 }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton){
    int valor_1 = 0, valor_2 = 0, resultado = 0;
    valor_1 = Integer.parseInt(field_1.getText()); 
    valor_2 = Integer.parseInt(field_2.getText());
    
    resultado = valor_1 + valor_2;
    
    label_3.setText("Resultado: " + resultado);
  }
 }
  public static void main(String args[]){
   Formulario4 formu = new Formulario4();
   formu.setBounds(0,0,300,150);
   formu.setVisible(true);
   formu.setResizable(false);
   formu.setLocationRelativeTo(null);
 }
}