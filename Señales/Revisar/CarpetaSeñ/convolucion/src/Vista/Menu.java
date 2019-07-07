package Vista;

import javax.swing.JLabel;

public class Menu extends javax.swing.JFrame
{
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel11;
  private JLabel jLabel12;
  private JLabel jLabel2;
  
  public Menu()
  {
    initComponents();
  }
  
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private void initComponents() {
    jPanel1 = new javax.swing.JPanel();
    jLabel6 = new JLabel();
    jLabel8 = new JLabel();
    jLabel9 = new JLabel();
    jLabel10 = new JLabel();
    jLabel7 = new JLabel();
    jLabel5 = new JLabel();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    jButton3 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jLabel11 = new JLabel();
    jLabel12 = new JLabel();
    
    setDefaultCloseOperation(3);
    setBackground(new java.awt.Color(102, 0, 0));
    setCursor(new java.awt.Cursor(0));
    setForeground(new java.awt.Color(102, 0, 0));
    
    jPanel1.setBackground(new java.awt.Color(102, 0, 0));
    jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
    
    jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 14));
    jLabel6.setForeground(new java.awt.Color(204, 204, 204));
    jLabel6.setText("3CV1");
    
    jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 14));
    jLabel8.setForeground(new java.awt.Color(204, 204, 204));
    jLabel8.setText("Luis Cebada Velazquez");
    
    jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 14));
    jLabel9.setForeground(new java.awt.Color(204, 204, 204));
    jLabel9.setText("Diego Ramirez");
    
  
    
    jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 36));
    jLabel7.setForeground(new java.awt.Color(102, 153, 255));
    jLabel7.setText("Practica 2: Convolución");
    
    jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
    jLabel5.setForeground(new java.awt.Color(102, 153, 255));
    jLabel5.setText("Convolución de Secuencias Discretas");
    
    jLabel1.setFont(new java.awt.Font("Verdana", 0, 14));
    jLabel1.setText("Seleccione la Convolución que desee realizar:");
    
    jLabel2.setFont(new java.awt.Font("Verdana", 1, 12));
    jLabel2.setForeground(new java.awt.Color(204, 204, 204));
    jLabel2.setText("1.");
    
    jLabel3.setFont(new java.awt.Font("Verdana", 1, 12));
    jLabel3.setForeground(new java.awt.Color(204, 204, 204));
    jLabel3.setText("2.");
    
    jLabel4.setFont(new java.awt.Font("Verdana", 1, 12));
    jLabel4.setForeground(new java.awt.Color(204, 204, 204));
    jLabel4.setText("3.");
    
    jButton3.setBackground(new java.awt.Color(0, 0, 0));
    jButton3.setFont(new java.awt.Font("Monotype Corsiva", 1, 18));
    jButton3.setForeground(new java.awt.Color(255, 255, 255));
    jButton3.setText("Dos Secuencias Periódicas");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Menu.this.jButton3ActionPerformed(evt);
      }
      
    });
    jButton2.setBackground(new java.awt.Color(0, 0, 0));
    jButton2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18));
    jButton2.setForeground(new java.awt.Color(255, 255, 255));
    jButton2.setText("Secuencia Finita y Secuencia Periódica");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Menu.this.jButton2ActionPerformed(evt);
      }
      
    });
    jButton1.setBackground(new java.awt.Color(0, 0, 0));
    jButton1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18));
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Dos Secuencias Finitas");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Menu.this.jButton1ActionPerformed(evt);
      }
      
    });
    jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 18));
    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
    jLabel11.setText("TEORÍA DE COMUNICACIONES Y SEÑALES");
    
    jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 0, 18));
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("Jacqueline Arzate Gordillo");
    
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(40, 40, 40).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jLabel2, -2, 14, -2).addComponent(jLabel3, -2, 14, -2).addComponent(jLabel4, -2, 14, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jButton2, -1, -1, 32767).addComponent(jButton3, -1, -1, 32767).addComponent(jButton1, -1, -1, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(87, 87, 87).addComponent(jLabel12, -2, 179, -2)).addComponent(jLabel1).addComponent(jLabel11, -2, 373, -2)).addGap(0, 0, 32767))).addGap(27, 27, 27)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(jLabel5, -2, 368, -2))).addContainerGap()).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(96, 96, 96).addComponent(jLabel6, -2, 45, -2)).addComponent(jLabel9, -2, 243, -2).addGroup(jPanel1Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(jLabel8)).addGroup(jPanel1Layout.createSequentialGroup().addGap(42, 42, 42).addComponent(jLabel10)).addComponent(jLabel7, -2, 234, -2)).addGap(86, 86, 86)));
    












































    jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(5, 5, 5).addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel8).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel9).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel7, -2, 28, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel1).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton1).addComponent(jLabel2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton2).addComponent(jLabel3)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jButton3).addComponent(jLabel4)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel11).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel12)));
    

































    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, -1, -1, 32767));
    


    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1, -1, -1, 32767));
    



    pack();
  }
  
  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    SecuenciaPeriodica periodica = new SecuenciaPeriodica();
    periodica.setVisible(true);
    periodica.setLocation(150, 150);
    setVisible(false);
  }
  
  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    PeriodicaFinita periFin = new PeriodicaFinita();
    periFin.setVisible(true);
    periFin.setLocation(150, 150);
    setVisible(false);
  }
  
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    SecuenciaFinita Finitas = new SecuenciaFinita();
    Finitas.setVisible(true);
    Finitas.setLocation(150, 150);
    setVisible(false);
  }
  






  public static void main(String[] args)
  {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Menu().setVisible(true);
      }
    });
  }
}
