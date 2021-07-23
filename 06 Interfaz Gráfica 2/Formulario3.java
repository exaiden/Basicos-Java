import javax.swing.*;
import java.awt.event.*;

public class Formulario3 extends JFrame implements ActionListener{
  
  private JTextField field;
  private JScrollPane scroll;
  private JTextArea area;
  private JButton boton;
  
  String texto = "";
  
  public Formulario3(){
   setLayout(null);
   field = new JTextField();
   field.setBounds(10,10,200,30);
   add(field);
   
   boton = new JButton("Agregar");
   boton.setBounds(250,10,100,30);
   add(boton);
   boton.addActionListener(this);
   
   area = new JTextArea();
   scroll = new JScrollPane(area);
   scroll.setBounds(10,50,400,300);
   add(scroll);
 }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton){
    texto += field.getText() + "\n";
    area.setText(texto);
    field.setText("");
  }
 }
  
  public static void main (String args[]){
   Formulario3 formu = new Formulario3();
   formu.setBounds(0,0,540,400);
   formu.setVisible(true);
   formu.setResizable(false);
   formu.setLocationRelativeTo(null);
 }
}