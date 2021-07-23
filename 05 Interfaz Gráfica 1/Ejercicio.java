import javax.swing.*;
import java.awt.event.*;

public class Ejercicio extends JFrame implements ActionListener{
  JButton boton_1;
  public Ejercicio(){
   setLayout(null);
   boton_1 = new JButton("cerrar");
   boton_1.setBounds(300,250,100,30);
   add(boton_1);
   boton_1.addActionListener(this);
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton_1){
    System.exit(0);
  }
 }
  public static void main(String args[]){
   Ejercicio interfaz_1 = new Ejercicio();
   interfaz_1.setBounds(0,0,450,350);
   interfaz_1.setVisible(true);
   interfaz_1.setResizable(false);
   interfaz_1.setLocationRelativeTo(null);
 }
}