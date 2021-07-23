import javax.swing.*;
import java.awt.event.*;

public class Ejercicio2 extends JFrame implements ActionListener{
  private JButton boton_1, boton_2, boton_3;
  private JLabel label_1;
  
  public Ejercicio2(){
   setLayout(null);
   boton_1 = new JButton("1");
   boton_1.setBounds(10,100,90,30);
   add(boton_1);
   boton_1.addActionListener(this);
   
   boton_2 = new JButton("2");
   boton_2.setBounds(110,100,90,30);
   add(boton_2);
   boton_2.addActionListener(this);
   
   boton_3 = new JButton("3");
   boton_3.setBounds(210,100,90,30);
   add(boton_3);
   boton_3.addActionListener(this);
   
   label_1 = new JLabel("En Espera...");
   label_1.setBounds(10,10,300,30);
   add(label_1);
 }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton_1){
    label_1.setText("Has presionado el boton 1");
  }
   if(e.getSource() == boton_2){
    label_1.setText("Has presionado el boton 2");
  }
   if(e.getSource() == boton_3){
    label_1.setText("Has presionado el boton 3");
  }
 }
  
  public static void main(String args[]){
   Ejercicio2 ejercicio_1 = new Ejercicio2();
   ejercicio_1.setBounds(0,0,350,200);
   ejercicio_1.setVisible(true);
   ejercicio_1.setResizable(false);
   ejercicio_1.setLocationRelativeTo(null);
 }
}