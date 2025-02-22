import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane;
  private JTextArea textarea;
  String nombreAdministrador = "";
  
  public Principal(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Pantalla principal");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombreAdministrador = ventanaBienvenida.texto;
   
   mb = new JMenuBar();
   mb.setBackground(new Color(255,0,0));
   setJMenuBar(mb);
   
   menuOpciones = new JMenu("Opciones");
   menuOpciones.setBackground(new Color(255,0,0));
   menuOpciones.setFont(new Font("Andale Mono", 1, 14));
   menuOpciones.setForeground(new Color(255,255,255));
   mb.add(menuOpciones);
   
   menuCalcular = new JMenu("Calcular");
   menuCalcular.setBackground(new Color(255,0,0));
   menuCalcular.setFont(new Font("Andale Mono", 1, 14));
   menuCalcular.setForeground(new Color(255,255,255));
   mb.add(menuCalcular);
   
   menuAcercaDe = new JMenu("Acerca de");
   menuAcercaDe.setBackground(new Color(255,0,0));
   menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
   menuAcercaDe.setForeground(new Color(255,255,255));
   mb.add(menuAcercaDe);
   
   menuColorFondo = new JMenu("Color de fondo");
   menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
   menuColorFondo.setForeground(new Color(255,0,0));
   menuOpciones.add(menuColorFondo);
   
   miCalculo = new JMenuItem("Vacaciones");
   miCalculo.setFont(new Font("Andale Mono", 1, 14));
   miCalculo.setForeground(new Color(255,0,0));
   menuCalcular.add(miCalculo);
   miCalculo.addActionListener(this);
   
   miRojo = new JMenuItem("Rojo");
   miRojo.setFont(new Font("Andale Mono", 1, 14));
   miRojo.setForeground(new Color(255,0,0));
   menuColorFondo.add(miRojo);
   miRojo.addActionListener(this);
   
   miNegro = new JMenuItem("Negro");
   miNegro.setFont(new Font("Andale Mono", 1, 14));
   miNegro.setForeground(new Color(255,0,0));
   menuColorFondo.add(miNegro);
   miNegro.addActionListener(this);
   
   miMorado = new JMenuItem("Morado");
   miMorado.setFont(new Font("Andale Mono", 1, 14));
   miMorado.setForeground(new Color(255,0,0));
   menuColorFondo.add(miMorado);
   miMorado.addActionListener(this);
   
   miNuevo = new JMenuItem("Nuevo");
   miNuevo.setFont(new Font("Andale Mono", 1, 14));
   miNuevo.setForeground(new Color(255,0,0));
   menuOpciones.add(miNuevo);
   miNuevo.addActionListener(this);
   
   miElCreador = new JMenuItem("El creador");
   miElCreador.setFont(new Font("Andale Mono", 1, 14));
   miElCreador.setForeground(new Color(255,0,0));
   menuAcercaDe.add(miElCreador);
   miElCreador.addActionListener(this);
   
   miSalir = new JMenuItem("Salir");
   miSalir.setFont(new Font("Andale Mono", 1, 14));
   miSalir.setForeground(new Color(255,0,0));
   menuOpciones.add(miSalir);
   miSalir.addActionListener(this);
   
   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   labelLogo = new JLabel(imagen);
   labelLogo.setBounds(5,5,250,100);
   add(labelLogo);
   
   labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
   labelBienvenido.setBounds(280,30,300,50);
   labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
   labelBienvenido.setForeground(new Color(255,255,255));
   add(labelBienvenido);
   
   labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
   labelTitle.setBounds(45,140,900,25);
   labelTitle.setFont(new Font("Andale Mono", 0, 24));
   labelTitle.setForeground(new Color(255,255,255));
   add(labelTitle);
   
   labelNombre = new JLabel("Nombre completo:");
   labelNombre.setBounds(25,188,180,25);
   labelNombre.setFont(new Font("Andale Mono", 1, 12));
   labelNombre.setForeground(new Color(255,255,255));
   add(labelNombre);
   
   txtNombreTrabajador = new JTextField();
   txtNombreTrabajador.setBounds(25,213,150,25);
   txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
   txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
   add(txtNombreTrabajador);
   
   labelAPaterno = new JLabel("Apellido Paterno:");
   labelAPaterno.setBounds(25,248,180,25);
   labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
   labelAPaterno.setForeground(new Color(255,255,255));
   add(labelAPaterno);
   
   txtAPaternoTrabajador = new JTextField();
   txtAPaternoTrabajador.setBounds(25,273,150,25);
   txtAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
   txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
   add(txtAPaternoTrabajador);
   
   labelAMaterno = new JLabel("Apellido Materno:");
   labelAMaterno.setBounds(25,308,180,25);
   labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
   labelAMaterno.setForeground(new Color(255,255,255));
   add(labelAMaterno);
   
   txtAMaternoTrabajador = new JTextField();
   txtAMaternoTrabajador.setBounds(25,334,150,25);
   txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
   txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
   add(txtAMaternoTrabajador);
   
   labelDepartamento = new JLabel("Selecciona el Departamento:");
   labelDepartamento.setBounds(220,188,180,25);
   labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
   labelDepartamento.setForeground(new Color(255,255,255));
   add(labelDepartamento);
   
   comboDepartamento = new JComboBox();
   comboDepartamento.setBounds(220,213,220,25);
   comboDepartamento.setBackground(new java.awt.Color(224,224,224));
   comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
   comboDepartamento.setForeground(new java.awt.Color(255,0,0));
   add(comboDepartamento);
   comboDepartamento.addItem("");
   comboDepartamento.addItem("Atencion al Cliente");
   comboDepartamento.addItem("Departamento de Logistica");
   comboDepartamento.addItem("Departamento de Gerencia");
   
   labelAntiguedad = new JLabel("Selecciona la Antiguedad:");
   labelAntiguedad.setBounds(220,248,180,25);
   labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
   labelAntiguedad.setForeground(new Color(255,255,255));
   add(labelAntiguedad);
   
   comboAntiguedad = new JComboBox();
   comboAntiguedad.setBounds(220,273,220,25);
   comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
   comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
   comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
   add(comboAntiguedad);
   comboAntiguedad.addItem("");
   comboAntiguedad.addItem("1 año de servicio");
   comboAntiguedad.addItem("2 a 6 años de servicio");
   comboAntiguedad.addItem("7 o más años de servicio");
   
   labelResultado = new JLabel("Resultado del Calculo:");
   labelResultado.setBounds(220,307,180,25);
   labelResultado.setFont(new Font("Andale Mono", 1, 12));
   labelResultado.setForeground(new Color(255,255,255));
   add(labelResultado);
   
   textarea = new JTextArea();
   textarea.setEditable(false);
   textarea.setBackground(new Color(224,224,224));
   textarea.setFont(new Font("Andale Mono", 1, 11));
   textarea.setForeground(new Color(255,0,0));
   textarea.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
   scrollpane = new JScrollPane(textarea);
   scrollpane.setBounds(220,333,385,90);
   add(scrollpane);
   
   labelfooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
   labelfooter.setBounds(135,445,500,30);
   labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
   labelfooter.setForeground(new java.awt.Color(255,255,255));
   add(labelfooter);
 }
  
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == miCalculo){
    String nombreTrabajador = txtNombreTrabajador.getText();
    String AP = txtAPaternoTrabajador.getText();
    String AM = txtAMaternoTrabajador.getText();
    String Departamento = comboDepartamento.getSelectedItem().toString();
    String Antiguedad = comboAntiguedad.getSelectedItem().toString();
    
    if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")){
     JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
   }else{
     if(Departamento.equals("Atencion al Cliente")){
      if(Antiguedad.equals("1 año de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 6 dias de vacaciones");
     }
      if(Antiguedad.equals("2 a 6 años de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 14 dias de vacaciones");
     }
      if(Antiguedad.equals("7 o más años de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 20 dias de vacaciones");
     }
    }
     if(Departamento.equals("Departamento de Logistica")){
      if(Antiguedad.equals("1 año de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 7 dias de vacaciones");
     }
      if(Antiguedad.equals("2 a 6 años de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 15 dias de vacaciones");
     }
      if(Antiguedad.equals("7 o más años de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 22 dias de vacaciones");
     }
    }
     if(Departamento.equals("Departamento de Gerencia")){
      if(Antiguedad.equals("1 año de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 10 dias de vacaciones");
     }
      if(Antiguedad.equals("2 a 6 años de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 20 dias de vacaciones");
     }
      if(Antiguedad.equals("7 o más años de servicio")){
       textarea.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                        "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                        "\n   recibe 30 dias de vacaciones");
     }
    }
   }
  }
   if(e.getSource() == miRojo){
    getContentPane().setBackground(new Color(255,0,0));
  }
   if(e.getSource() == miNegro){
    getContentPane().setBackground(new Color(0,0,0));
  }
   if(e.getSource() == miMorado){
    getContentPane().setBackground(new Color(51,0,51));
  }
   if(e.getSource() == miNuevo){
    txtNombreTrabajador.setText("");
    txtAPaternoTrabajador.setText("");
    txtAMaternoTrabajador.setText("");
    comboDepartamento.setSelectedIndex(0);
    comboAntiguedad.setSelectedIndex(0);
    textarea.setText("\n   Aquí aparece el resultado del calculo de las vacaciones");
  }
   if(e.getSource() == miSalir){
    Bienvenida ventana = new Bienvenida();
    ventana.setBounds(0,0,350,450);
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);
    this.setVisible(false);
  }
   if(e.getSource() == miElCreador){
    JOptionPane.showMessageDialog(null, "Copie esta wea de YouTube\n" +
                                        "       www.youtube.com/ErnestoPerezM");
  }
 }
  
  public static void main(String args[]){
   Principal ventanaPrincipal = new Principal();
   ventanaPrincipal.setBounds(0,0,700,595);
   ventanaPrincipal.setVisible(true);
   ventanaPrincipal.setResizable(false);
   ventanaPrincipal.setLocationRelativeTo(null);
 }
}