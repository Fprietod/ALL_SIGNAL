package Vista;



import Vista.VerGrafica;
import Controlador.Funcion;
import Vista.Menu;
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

public class PeriodicaFinita extends javax.swing.JFrame
{
  private final Funcion secuenciaXn = new Funcion();
  private final Funcion secuenciaHn = new Funcion();
  private final Funcion secuenciaResultado = new Funcion();
  
  VerGrafica gra = new VerGrafica();
  Controlador.Grafica dibuja = new Controlador.Grafica();
  Funcion funcion = new Funcion();
  private JButton Calcular;
  private JButton Graficar;
  
  public PeriodicaFinita() {
    initComponents();
    setLocation(10, 265); }
  
  private JTextField Hn;
  private JTextField Resultado;
  private JTextField Xn;
  private JButton jButton1;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel11;
  private JLabel jLabel2;
  private JLabel jLabel3;
  
  private void initComponents() { jPanel1 = new javax.swing.JPanel();
    jLabel1 = new JLabel();
    jLabel10 = new JLabel();
    jLabel6 = new JLabel();
    jLabel7 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    Xn = new JTextField();
    Hn = new JTextField();
    Calcular = new JButton();
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    Resultado = new JTextField();
    Graficar = new JButton();
    jLabel11 = new JLabel();
    jLabel8 = new JLabel();
    jLabel9 = new JLabel();
    jButton1 = new JButton();
    
    setDefaultCloseOperation(3);
    
    jPanel1.setBackground(new Color(102, 0, 0));
    
    jLabel1.setFont(new Font("Monotype Corsiva", 1, 36));
    jLabel1.setForeground(new Color(102, 153, 255));
    jLabel1.setText("Convolución entre Secuencia Finita y");
    
    jLabel10.setFont(new Font("Monotype Corsiva", 1, 36));
    jLabel10.setForeground(new Color(102, 153, 255));
    jLabel10.setText("una Secuencia Periódica");
    
    jLabel6.setBackground(new Color(255, 255, 255));
    jLabel6.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel6.setForeground(new Color(204, 204, 204));
    jLabel6.setText("Secuencia Periódica");
    
    jLabel7.setBackground(new Color(255, 255, 255));
    jLabel7.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel7.setForeground(new Color(204, 204, 204));
    jLabel7.setText("Secuencia Finita");
    
    jLabel2.setBackground(new Color(255, 255, 255));
    jLabel2.setFont(new Font("Monotype Corsiva", 1, 14));
    jLabel2.setForeground(new Color(204, 204, 204));
    jLabel2.setText("x(n)= ");
    
    jLabel3.setBackground(new Color(255, 255, 255));
    jLabel3.setFont(new Font("Monotype Corsiva", 1, 14));
    jLabel3.setForeground(new Color(204, 204, 204));
    jLabel3.setText("h(n)= ");
    
    Xn.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(106, 146, 212)));
    
    Hn.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(106, 146, 212)));
    
    Calcular.setBackground(new Color(0, 0, 0));
    Calcular.setFont(new Font("Monotype Corsiva", 1, 18));
    Calcular.setForeground(new Color(255, 255, 255));
    Calcular.setText("Generar Convolución");
    Calcular.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        PeriodicaFinita.this.CalcularActionPerformed(evt);
      }
      
    });
    jLabel4.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel4.setForeground(new Color(204, 204, 204));
    jLabel4.setText("Convolución");
    
    jLabel5.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel5.setForeground(new Color(204, 204, 204));
    jLabel5.setText("y(n) = x(n) * h(n) = ");
    
    Resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(106, 146, 212)));
    
    Graficar.setBackground(new Color(0, 0, 0));
    Graficar.setFont(new Font("Monotype Corsiva", 1, 18));
    Graficar.setForeground(new Color(255, 255, 255));
    Graficar.setText("Graficar");
    Graficar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        PeriodicaFinita.this.GraficarActionPerformed(evt);
      }
      
    });
    jLabel11.setFont(new Font("Monotype Corsiva", 1, 18));
    jLabel11.setForeground(new Color(255, 255, 255));
    jLabel11.setText("TEORÍA DE COMUNICACIONES Y SEÑALES");
    
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
        PeriodicaFinita.this.jButton1ActionPerformed(evt);
      }
      
    });
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(63, 63, 63).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addGap(156, 156, 156).addComponent(jLabel10)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel8)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel9).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel4).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel3)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2))).addComponent(jLabel5))))).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel11).addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(Graficar).addGap(121, 121, 121).addComponent(jButton1)).addComponent(Calcular).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(Hn, -2, 328, -2).addComponent(Xn, -2, 328, -2)).addComponent(Resultado, -2, 328, -2)).addContainerGap()))));
    














































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel8).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel9).addGap(28, 28, 28).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(jLabel6).addComponent(Xn, -2, -1, -2)).addGap(16, 16, 16).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(jLabel7).addComponent(Hn, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGap(48, 48, 48).addComponent(jLabel4).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Resultado, -2, -1, -2).addComponent(jLabel5)).addGap(18, 18, 18).addComponent(Graficar).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(Calcular).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jButton1).addContainerGap()))));
    







































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
    double[][] vacia = funcion.creaMatriz(tam);
    double[][] matriz = funcion.creaMatriz(tam, y);
    double[][] matrizz = funcion.llenaMatriz(vacia, x, tam);
    int indXN = funcion.regresaIndice(secXn);
    int indHN = funcion.regresaIndice(secHn);
    int indiceConv = indXN + indHN;
    int N = x.length;
    String convolucion = funcion.multiplicar(matrizz, matriz, tam);
    convolucion = funcion.agrupar(convolucion, N);
    
    convolucion = funcion.secu(convolucion, secuenciaResultado, indiceConv);
    
    Resultado.setText(convolucion);
    funcion.creaPeriodos(secuenciaXn);
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
  
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  public static void main(String[] args)
  {
 
    


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PeriodicaFinita().setVisible(true);
      }
    });
  }
}
