import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
  private JLabel label_1, label_2;
  private JCheckBox check;
  private JButton boton_1, boton_2;
  private JScrollPane scroll;
  private JTextArea area;
  String nombre = "";
  
  public Licencia(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombre = ventanaBienvenida.texto;
   
   label_1 = new JLabel("TERMINOS Y CONDICIONES");
   label_1.setBounds(215,5,200,30);
   label_1.setFont(new Font("Andale Mono", 1, 14));
   label_1.setForeground(new Color(0,0,0));
   add(label_1);
   
   area = new JTextArea();
   area.setEditable(false);
   area.setFont(new Font("Andale Mono", 0, 9));
   area.setText("\n\n          TERMINOS Y CONDICIONES" +
                "\n aaaaaaaaaaaaaaaaaaaaaaaaaaa");
   scroll = new JScrollPane(area);
   scroll.setBounds(10,40,575,200);
   add(scroll);
   
   check = new JCheckBox("Yo " + nombre + " Acepto");
   check.setBounds(10,250,300,30);
   check.addChangeListener(this);
   add(check);
   
   boton_1 = new JButton("Continuar");
   boton_1.setBounds(10,290,100,30);
   boton_1.addActionListener(this);
   boton_1.setEnabled(false);
   add(boton_1);
   
   boton_2 = new JButton("No Acepto");
   boton_2.setBounds(120,290,100,30);
   boton_2.addActionListener(this);
   boton_2.setEnabled(true);
   add(boton_2);
   
   ImageIcon imagen = new ImageIcon("images/coca-cola.png");
   label_2 = new JLabel(imagen);
   label_2.setBounds(315,135,300,300);
   add(label_2);
 }
  
  public void stateChanged(ChangeEvent e){
   if(check.isSelected() == true){
    boton_1.setEnabled(true);
    boton_2.setEnabled(false);
  }else{
    boton_1.setEnabled(false);
    boton_2.setEnabled(true);
  }
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton_1){
    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(0,0,640,535);
    ventanaPrincipal.setVisible(true);
    ventanaPrincipal.setResizable(false);
    ventanaPrincipal.setLocationRelativeTo(null);
    this.setVisible(false);
  }else if(e.getSource() == boton_2){
    Bienvenida ventana = new Bienvenida();
    ventana.setBounds(0,0,350,450);
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
    this.setVisible(false);
  }
 }
  
  public static void main(String args[]){
   Licencia lice = new Licencia();
   lice.setBounds(0,0,600,360);
   lice.setVisible(true);
   lice.setResizable(false);
   lice.setLocationRelativeTo(null);
 }
}