import javax.swing.*;
import java.awt.event.*;

public class Aaaaaa extends JFrame implements ItemListener{
  
  private JComboBox box;
  
  public Aaaaaa(){
   setLayout(null);
   box = new JComboBox();
   box.setBounds(10,10,80,20);
   add(box);
   
   box.addItem("rojo");
   box.addItem("verde");
   box.addItem("azul");
   box.addItem("amarillo");
   box.addItem("negro");
   box.addItemListener(this);
 }
  
  public void itemStateChanged(ItemEvent e){
   if(e.getSource() == box){
    String seleccion = box.getSelectedItem().toString();
    setTitle(seleccion);
  }
 }
  
  public static void main(String args[]){
   Aaaaaa  aaa = new Aaaaaa();
   aaa.setBounds(0,0,500,450);
   aaa.setVisible(true);
   aaa.setResizable(false);
   aaa.setLocationRelativeTo(null);
 }
}