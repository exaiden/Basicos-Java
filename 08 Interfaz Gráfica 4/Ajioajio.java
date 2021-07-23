import javax.swing.*;
import javax.swing.event.*;

public class Ajioajio extends JFrame implements ChangeListener{
  
  private JCheckBox check_1, check_2, check_3;
  
  public Ajioajio(){
   setLayout(null);
   check_1 = new JCheckBox("Ingles");
   check_1.setBounds(10,10,150,30);
   check_1.addChangeListener(this);
   add(check_1);
   
   check_2 = new JCheckBox("Frances");
   check_2.setBounds(10,50,150,30);
   check_2.addChangeListener(this);
   add(check_2);
   
   check_3 = new JCheckBox("Aleman");
   check_3.setBounds(10,90,150,30);
   check_3.addChangeListener(this);
   add(check_3);
 }
  
  public void stateChanged(ChangeEvent e){
   String cad = "";
   if(check_1.isSelected() == true){
    cad = cad + "Ingles-";
    setTitle(cad);
  }
   if(check_2.isSelected() == true){
    cad = cad + "Frances-";
    setTitle(cad);
  }
   if(check_3.isSelected() == true){
    cad = cad + "Aleman-";
    setTitle(cad);
  }
 }
  
  public static void main(String args[]){
   Ajioajio ajio = new Ajioajio();
   ajio.setBounds(0,0,350,200);
   ajio.setVisible(true);
   ajio.setResizable(false);
   ajio.setLocationRelativeTo(null);
 }
}