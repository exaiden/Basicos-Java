import javax.swing.*;
import javax.swing.event.*;

public class Caaaaaa extends JFrame implements ChangeListener{
  private JRadioButton radio_1, radio_2, radio_3;
  private ButtonGroup bg;
  
  public Caaaaaa(){
   setLayout(null);
   bg = new ButtonGroup();
   
   radio_1 = new JRadioButton("640*480");
   radio_1.setBounds(10,20,100,30);
   radio_1.addChangeListener(this);
   add(radio_1);
   bg.add(radio_1);
   
   radio_2 = new JRadioButton("800*600");
   radio_2.setBounds(10,70,100,30);
   radio_2.addChangeListener(this);
   add(radio_2);
   bg.add(radio_2);
   
   radio_3 = new JRadioButton("1024*768");
   radio_3.setBounds(10,120,100,30);
   radio_3.addChangeListener(this);
   add(radio_3);
   bg.add(radio_3);
 }
  
  public void stateChanged(ChangeEvent e){
   if(radio_1.isSelected()){
    setSize(640,480);
  }
   if(radio_2.isSelected()){
    setSize(800,600);
  }
   if(radio_3.isSelected()){
    setSize(1024,768);
  }
 }
  
  public static void main(String args[]){
   Caaaaaa caa = new Caaaaaa();
   caa.setBounds(0,0,350,230);
   caa.setVisible(true);
   caa.setResizable(false);
 }
}