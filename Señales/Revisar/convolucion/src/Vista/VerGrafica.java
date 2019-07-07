package Vista;



import javax.swing.GroupLayout;

public class VerGrafica extends javax.swing.JFrame
{
  public static javax.swing.JPanel Grafica;
  public static javax.swing.JPanel GraficaHN;
  public static javax.swing.JPanel GraficaXN;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  
  public VerGrafica() {
    initComponents();
  }
  







  private void initComponents()
  {
    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    GraficaXN = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    Grafica = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    GraficaHN = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    
    setDefaultCloseOperation(2);
    
    jPanel1.setBackground(new java.awt.Color(102, 0, 0));
    
    jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
    jLabel3.setForeground(new java.awt.Color(204, 204, 204));
    jLabel3.setText("x(n)");
    
    GraficaXN.setBackground(new java.awt.Color(153, 153, 153));
    GraficaXN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
    GraficaXN.setPreferredSize(new java.awt.Dimension(300, 300));
    
    GroupLayout GraficaXNLayout = new GroupLayout(GraficaXN);
    GraficaXN.setLayout(GraficaXNLayout);
    GraficaXNLayout.setHorizontalGroup(GraficaXNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 236, 32767));
    


    GraficaXNLayout.setVerticalGroup(GraficaXNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 246, 32767));
    



    jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
    jLabel4.setForeground(new java.awt.Color(204, 204, 204));
    jLabel4.setText("x(n) * h(n)");
    
    Grafica.setBackground(new java.awt.Color(153, 153, 153));
    Grafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
    Grafica.setForeground(new java.awt.Color(102, 153, 255));
    
    GroupLayout GraficaLayout = new GroupLayout(Grafica);
    Grafica.setLayout(GraficaLayout);
    GraficaLayout.setHorizontalGroup(GraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 246, 32767));
    


    GraficaLayout.setVerticalGroup(GraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 376, 32767));
    



    jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
    jLabel2.setForeground(new java.awt.Color(204, 204, 204));
    jLabel2.setText("h(n)");
    
    GraficaHN.setBackground(new java.awt.Color(153, 153, 153));
    GraficaHN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
    GraficaHN.setPreferredSize(new java.awt.Dimension(500, 180));
    
    GroupLayout GraficaHNLayout = new GroupLayout(GraficaHN);
    GraficaHN.setLayout(GraficaHNLayout);
    GraficaHNLayout.setHorizontalGroup(GraficaHNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 246, 32767));
    


    GraficaHNLayout.setVerticalGroup(GraficaHNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 246, 32767));
    



    jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36));
    jLabel1.setForeground(new java.awt.Color(102, 153, 255));
    jLabel1.setText("Graficas");
    
    jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 18));
    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
    jLabel11.setText("TEORÍA DE COMUNICACIONES Y SEÑALES");
    
    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(GraficaXN, -2, 240, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(109, 109, 109).addComponent(jLabel3, -2, 44, -2))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel2, -2, 46, -2).addGap(111, 111, 111)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(67, 67, 67).addComponent(jLabel1)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(GraficaHN, -2, 250, -2))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, 32767)))).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel11).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(Grafica, -2, -1, -2).addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel4, -2, 107, -2).addGap(80, 80, 80)))));
    




































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(jLabel2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(GraficaXN, -2, 250, -2).addComponent(GraficaHN, -2, 250, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel11)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(Grafica, -2, -1, -2))).addContainerGap(12, 32767)));
    






















    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, -1, -1, 32767));
    


    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, -1, -1, 32767));
    



    pack();
  }
  






  public static void main(String[] args)
  {
   
    


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VerGrafica().setVisible(true);
      }
    });
  }
}
