package Vista;



import Controlador.Funcion;
import Vista.Menu;
import Vista.VerGrafica;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SecuenciaPeriodica extends javax.swing.JFrame
{
  private final Funcion secuenciaXn = new Funcion();
  private final Funcion secuenciaHn = new Funcion();
  private final Funcion secuenciaResultado = new Funcion();
  
  VerGrafica gra = new VerGrafica();
  Controlador.Grafica dibuja = new Controlador.Grafica();
  Funcion funcion = new Funcion();
  private JButton Calcular;
  
  public SecuenciaPeriodica() { initComponents();
    setLocation(10, 265); }
  
  private JButton Graficar;
  private JTextField Hn;
  private JTextField Resultado;
  private JTextField Xn;
  private JButton jButton1;
  private JLabel jLabel10;
  private JLabel jLabel11;
  private JLabel jLabel12;
  private JLabel jLabel13;
  
  private void initComponents() { jPanel1 = new javax.swing.JPanel();
    jLabel6 = new JLabel();
    jLabel12 = new JLabel();
    jLabel13 = new JLabel();
    jLabel14 = new JLabel();
    jLabel7 = new JLabel();
    Xn = new JTextField();
    Hn = new JTextField();
    Calcular = new JButton();
    jLabel10 = new JLabel();
    jLabel11 = new JLabel();
    Resultado = new JTextField();
    Graficar = new JButton();
    jLabel15 = new JLabel();
    jLabel8 = new JLabel();
    jLabel9 = new JLabel();
    jButton1 = new JButton();
    
    setDefaultCloseOperation(3);
    
    jPanel1.setBackground(new Color(102, 0, 0));
    
    jLabel6.setFont(new Font("Monotype Corsiva", 1, 36));
    jLabel6.setForeground(new Color(102, 153, 255));
    jLabel6.setText("Convolución entre Secuencias Periódicas");
    
    jLabel12.setBackground(new Color(255, 255, 255));
    jLabel12.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel12.setForeground(new Color(204, 204, 204));
    jLabel12.setText("Secuencia Periódica");
    
    jLabel13.setBackground(new Color(255, 255, 255));
    jLabel13.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel13.setForeground(new Color(204, 204, 204));
    jLabel13.setText("Secuencia Periódica");
    
    jLabel14.setBackground(new Color(255, 255, 255));
    jLabel14.setFont(new Font("Monotype Corsiva", 1, 14));
    jLabel14.setForeground(new Color(204, 204, 204));
    jLabel14.setText("x(n)= ");
    
    jLabel7.setBackground(new Color(255, 255, 255));
    jLabel7.setFont(new Font("Monotype Corsiva", 1, 14));
    jLabel7.setForeground(new Color(204, 204, 204));
    jLabel7.setText("h(n)= ");
    
    Xn.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(106, 146, 212)));
    
    Hn.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(106, 146, 212)));
    
    Calcular.setBackground(new Color(0, 0, 0));
    Calcular.setFont(new Font("Monotype Corsiva", 1, 18));
    Calcular.setForeground(new Color(255, 255, 255));
    Calcular.setText("Generar Convolución");
    Calcular.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        SecuenciaPeriodica.this.CalcularActionPerformed(evt);
      }
      
    });
    jLabel10.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel10.setForeground(new Color(204, 204, 204));
    jLabel10.setText("Convolución");
    
    jLabel11.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel11.setForeground(new Color(204, 204, 204));
    jLabel11.setText("g(n) = x(n) * h(n) = ");
    
    Resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(106, 146, 212)));
    
    Graficar.setBackground(new Color(0, 0, 0));
    Graficar.setFont(new Font("Monotype Corsiva", 1, 18));
    Graficar.setForeground(new Color(255, 255, 255));
    Graficar.setText("Graficar");
    Graficar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        SecuenciaPeriodica.this.GraficarActionPerformed(evt);
      }
      
    });
    jLabel15.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel15.setForeground(new Color(255, 255, 255));
    jLabel15.setText("TEORÍA DE COMUNICACIONES Y SEÑALES");
    
    jLabel8.setBackground(new Color(255, 255, 255));
    jLabel8.setFont(new Font("Century Gothic", 0, 16));
    jLabel8.setForeground(new Color(204, 204, 204));
    jLabel8.setText("Ingrese las secuencias separando con coma cada pulso, indicando el origen con un * ");
    
    jLabel9.setBackground(new Color(255, 255, 255));
    jLabel9.setFont(new Font("Century Gothic", 0, 16));
    jLabel9.setForeground(new Color(204, 204, 204));
    jLabel9.setText("después del valor del pulso.");
    
    jButton1.setBackground(new Color(0, 0, 0));
    jButton1.setFont(new Font("Monotype Corsiva", 1, 18));
    jButton1.setForeground(new Color(255, 255, 255));
    jButton1.setText("Regresar a Menú");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        SecuenciaPeriodica.this.jButton1ActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel15).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jButton1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(244, 244, 244).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Xn, -2, 300, -2).addComponent(Hn, -2, 300, -2).addComponent(Calcular).addComponent(Resultado, -2, 303, -2).addComponent(Graficar)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(45, 45, 45).addComponent(jLabel6)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel8)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel12).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel14)).addComponent(jLabel9).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel10).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel13).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel7)).addComponent(jLabel11))))).addGap(14, 14, 14))).addGap(0, 3, 32767)));
    












































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel6).addGap(18, 18, 18).addComponent(jLabel8).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel9).addGap(26, 26, 26).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel12).addComponent(jLabel14).addComponent(Xn, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel13).addComponent(jLabel7).addComponent(Hn, -2, -1, -2)).addGap(18, 18, 18).addComponent(Calcular).addGap(9, 9, 9).addComponent(jLabel10).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel11).addComponent(Resultado, -2, -1, -2)).addGap(18, 18, 18).addComponent(Graficar).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel15).addComponent(jButton1)).addContainerGap()));
    


































    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1, -1, -1, 32767));
    


    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
    



    pack();
  }
  
  private void CalcularActionPerformed(ActionEvent evt) {
    secuenciaResultado.destruir();
    secuenciaXn.destruir();
    secuenciaHn.destruir();
    Hn.setEnabled(true);
    String secXn = Xn.getText();
    String secHn = Hn.getText();
    String[] x = funcion.arreglo(secXn);
    String[] y = funcion.arreglo(secHn);
    System.out.println(secXn + "\n" + secHn);
    int tam = x.length + y.length - 1;
    funcion.secu(secXn, secuenciaXn);
    funcion.secu(secHn, secuenciaHn);
    funcion.creaSecuencia(secuenciaXn);
    funcion.creaSecuencia(secuenciaHn);
    int N1 = x.length;
    int N2 = y.length;
    double[][] vacia = funcion.creaMatriz(tam);
    double[][] matriz = funcion.creaMatriz(tam, y);
    double[][] matrizz = funcion.llenaMatriz(vacia, x, tam);
    int indXN = funcion.regresaIndice(secXn);
    int indHN = funcion.regresaIndice(secHn);
    int indiceConv = indXN + indHN;
    String convolucion = funcion.multiplicar(matrizz, matriz, tam);
    if (N1 >= N2) {
      convolucion = funcion.agrupar(convolucion, N1);
    }
    else {
      convolucion = funcion.agrupar(convolucion, N2);
    }
    convolucion = funcion.secu(convolucion, secuenciaResultado, indiceConv);
    Resultado.setText(convolucion);
    funcion.creaPeriodos(secuenciaXn);
    funcion.creaPeriodos(secuenciaHn);
    funcion.creaPeriodos(secuenciaResultado);
    Graficar.setEnabled(rootPaneCheckingEnabled);
    secuenciaResultado.imprimirLista();
    gra.repaint();
  }
  
  private void GraficarActionPerformed(ActionEvent evt) {
    gra.show();
    dibuja.setEjes();
    dibuja.graficarSecuencia(secuenciaResultado, secuenciaXn, secuenciaHn);
  }
  

  private void jButton1ActionPerformed(ActionEvent evt)
  {
    Menu ventana = new Menu();
    ventana.setVisible(true);
    ventana.setLocation(150, 150);
    setVisible(false);
  }
  
  private JLabel jLabel14;
  private JLabel jLabel15;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  public static void main(String[] args)
  {
    
    


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new SecuenciaPeriodica().setVisible(true);
      }
    });
  }
}
