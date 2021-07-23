import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bbbbbb extends JFrame implements ActionListener{
  private JLabel label_1, label_2, label_3;
  private JComboBox box_1, box_2, box_3;
  private JButton boton;
  
  public Bbbbbb(){
   setLayout(null);
   label_1 = new JLabel("rojo:");
   label_1.setBounds(10,10,100,10);
   add(label_1);
   
   box_1 = new JComboBox();
   box_1.setBounds(120,10,50,30);
    for(int i = 0; i <=255; i++){
     box_1.addItem(String.valueOf(i));
   }
   add(box_1);
   
   label_2 = new JLabel("verde:");
   label_2.setBounds(10,50,100,10);
   add(label_2);
   
   box_2 = new JComboBox();
   box_2.setBounds(120,50,50,30);
    for(int i = 0; i <=255; i++){
     box_2.addItem(String.valueOf(i));
   }
   add(box_2);
   
   label_3 = new JLabel("azul:");
   label_3.setBounds(10,90,100,10);
   add(label_3);
   
   box_3 = new JComboBox();
   box_3.setBounds(120,90,50,30);
    for(int i = 0; i <=255; i++){
     box_3.addItem(String.valueOf(i));
   }
   add(box_3);
   
   boton = new JButton("Fijar color");
   boton.setBounds(10,130,100,30);
   add(boton);
   boton.addActionListener(this);
 }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton){
    String cad_1 = box_1.getSelectedItem().toString();
    String cad_2 = box_2.getSelectedItem().toString();
    String cad_3 = box_3.getSelectedItem().toString();
    
    int rojo = Integer.parseInt(cad_1);
    int verde = Integer.parseInt(cad_2);
    int azul = Integer.parseInt(cad_3);
    
    Color color_1 = new Color(rojo,verde,azul);
    boton.setBackground(color_1);
  }
 }
  
  public static void main(String args[]){
   Bbbbbb bbb = new Bbbbbb();
   bbb.setBounds(0,0,200,230);
   bbb.setVisible(true);
   bbb.setResizable(false);
   bbb.setLocationRelativeTo(null);
 }
}