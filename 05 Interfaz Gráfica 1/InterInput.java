import javax.swing.*;
import java.awt.event.*;

public class InterInput extends JFrame implements ActionListener{
  private JTextField textfield_1;
  private JLabel label_1;
  private JButton boton_1;
  
  public InterInput(){
   setLayout(null);
   label_1 = new JLabel("Usuario");
   label_1.setBounds(10,10,100,30);
   add(label_1);
   
   textfield_1 = new JTextField();
   textfield_1.setBounds(120,17,150,20);
   add(textfield_1);
   
   boton_1 = new JButton("Aceptar");
   boton_1.setBounds(10,80,100,30);
   add(boton_1);
   boton_1.addActionListener(this);
 }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton_1){
    String texto = textfield_1.getText();
    setTitle(texto);
  }
 }
  public static void main(String args[]){
   InterInput inter_1 = new InterInput();
   inter_1.setBounds(0,0,300,150);
   inter_1.setVisible(true);
   inter_1.setResizable(false);
   inter_1.setLocationRelativeTo(null);
 }
}