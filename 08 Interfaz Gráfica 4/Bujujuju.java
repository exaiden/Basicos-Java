import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Bujujuju extends JFrame implements ActionListener, ChangeListener{
  private JLabel label;
  private JCheckBox check;
  private JButton boton;
  
  public Bujujuju(){
   setLayout(null);
   label = new JLabel("Aceptar terminos y condiciones");
   label.setBounds(10,10,400,30);
   add(label);
   
   check = new JCheckBox("Acepto");
   check.setBounds(10,50,100,30);
   check.addChangeListener(this);
   add(check);
   
   boton = new JButton("Continuar");
   boton.setBounds(10,100,100,30);
   add(boton);
   boton.addActionListener(this);
   boton.setEnabled(false);
 }
  
 public void stateChanged(ChangeEvent e){
   if(check.isSelected() == true){
    boton.setEnabled(true);
  }else{
    boton.setEnabled(false);
  }
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton){
    System.exit(0);
  }
 }
  
  public static void main(String args[]){
   Bujujuju buju = new Bujujuju();
   buju.setBounds(0,0,350,200);
   buju.setVisible(true);
   buju.setResizable(false);
   buju.setLocationRelativeTo(null);
 }
}