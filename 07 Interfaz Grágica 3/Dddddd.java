import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dddddd extends JFrame implements ActionListener{
  private JMenuBar bar;
  private JMenu menu_1, menu_2, menu_3;
  private JMenuItem item_1, item_2, item_3, item_4;
  
  public Dddddd(){
   setLayout(null);
   bar = new JMenuBar();
   setJMenuBar(bar);
   
   menu_1 = new JMenu("Opciones");
   bar.add(menu_1);
   
   menu_2 = new JMenu("Tamaño de la ventana");
   menu_1.add(menu_2);
   
   menu_3 = new JMenu("Color de fondo");
   menu_1.add(menu_3);
   
   item_1 = new JMenuItem("300*200");
   menu_2.add(item_1);
   item_1.addActionListener(this);
   
   item_2 = new JMenuItem("640*480");
   menu_2.add(item_2);
   item_2.addActionListener(this);
   
   item_3 = new JMenuItem("Rojo");
   menu_3.add(item_3);
   item_3.addActionListener(this);
   
   item_4 = new JMenuItem("Verde");
   menu_3.add(item_4);
   item_4.addActionListener(this);
 }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == item_1){
    setSize(300,200);
  }
   if(e.getSource() == item_2){
    setSize(640,480);
  }
   if(e.getSource() == item_3){
    getContentPane().setBackground(new Color(255,0,0));
  }
   if(e.getSource() == item_4){
    getContentPane().setBackground(new Color(0,255,0));
  }
 }
  
  public static void main(String args[]){
   Dddddd ddd = new Dddddd();
   ddd.setBounds(0,0,300,200);
   ddd.setVisible(true);
   ddd.setResizable(false);
   ddd.setLocationRelativeTo(null);
 }
}