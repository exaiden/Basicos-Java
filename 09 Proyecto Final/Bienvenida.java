import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField textfield;
  private JLabel label_1, label_2, label_3, label_4;
  private JButton boton_1;
  public static String texto = "";
  
  public Bienvenida(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Bienvenid@");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   
   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   label_1 = new JLabel(imagen);
   label_1.setBounds(25,15,300,150);
   add(label_1);
   
   label_2 = new JLabel("Sistema de Control Vacacional");
   label_2.setBounds(35,135,300,30);
   label_2.setFont(new Font("Andale Mono", 3, 18));
   label_2.setForeground(new Color(255,255,255));
   add(label_2);
   
   label_3 = new JLabel("Ingrese su nombre");
   label_3.setBounds(45,212,200,30);
   label_3.setFont(new Font("Andale Mono", 1, 12));
   label_3.setForeground(new Color(255,255,255));
   add(label_3);
   
   label_4 = new JLabel("©2017 The Coca-Cola Company");
   label_4.setBounds(85,375,300,30);
   label_4.setFont(new Font("Andale Mono", 1, 12));
   label_4.setForeground(new Color(255,255,255));
   add(label_4);
   
   textfield = new JTextField();
   textfield.setBounds(45,240,255,25);
   textfield.setBackground(new Color(224,224,224));
   textfield.setFont(new Font("Andale Mono", 1, 14));
   textfield.setForeground(new Color(255,0,0));
   add(textfield);
   
   boton_1 = new JButton("Ingresar");
   boton_1.setBounds(125,280,100,30);
   boton_1.setBackground(new Color(255,255,255));
   boton_1.setFont(new Font("Andale Mono", 1, 14));
   boton_1.setForeground(new Color(255,0,0));
   boton_1.addActionListener(this);
   add(boton_1);
 }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton_1){
    texto = textfield.getText().trim();
    if(texto.equals("")){
     JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
   }else{
     Licencia lice = new Licencia();
     lice.setBounds(0,0,600,360);
     lice.setVisible(true);
     lice.setResizable(false);
     lice.setLocationRelativeTo(null);
     this.setVisible(false);
   }
  }
 }
  
  public static void main(String args[]){
   Bienvenida ventana = new Bienvenida();
   ventana.setBounds(0,0,350,450);
   ventana.setVisible(true);
   ventana.setResizable(false);
   ventana.setLocationRelativeTo(null);
 }
}