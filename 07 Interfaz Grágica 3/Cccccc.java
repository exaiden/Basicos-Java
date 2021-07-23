import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cccccc extends JFrame implements ActionListener{
  
  private JMenuBar bar;
  private JMenu menu;
  private JMenuItem item_1, item_2, item_3;
  
  public Cccccc(){
   setLayout(null);
   bar = new JMenuBar();
   setJMenuBar(bar);
   
   menu = new JMenu("Opciones");
   bar.add(menu);
   
   item_1 = new JMenuItem("Rojo");
   item_1.addActionListener(this);
   menu.add(item_1);
   
   item_2 = new JMenuItem("Verde");
   item_2.addActionListener(this);
   menu.add(item_2);
   
   item_3 = new JMenuItem("Azul");
   item_3.addActionListener(this);
   menu.add(item_3);
 }
  
  public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane();
   
   if(e.getSource() == item_1){
    fondo.setBackground(new Color(255,0,0));
    setTitle("Rojo");
  }
   if(e.getSource() == item_2){
    fondo.setBackground(new Color(0,255,0));
    setTitle("Verde");
  }
   if(e.getSource() == item_3){
    fondo.setBackground(new Color(0,0,255));
    setTitle("Azul");
  }
 }
  
  public static void main(String args[]){
   Cccccc ccc = new Cccccc();
   ccc.setBounds(0,0,400,300);
   ccc.setVisible(true);
   ccc.setLocationRelativeTo(null);
 }
}