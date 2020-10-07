
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class addflight extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;

    public addflight() {
       initComponents();
        conn=JavaConnect.ConnectDb();
        FillPlaneCombo();
        FillStartCombo();
        FillDestinationCombo();
       // setExtendedState(MAXIMIZED_BOTH);
    }

    private void FillPlaneCombo(){
    try{
        String sql1 = "select MODEL from airplane";
         pst=conn.prepareStatement(sql1);
         rs=pst.executeQuery();
         
         while(rs.next()){
             String planes = rs.getString(1);
                PlanesCombo.addItem(planes);
             
         }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }
}   
    
 
private void FillStartCombo(){
    try{
        String sql1 = "select airport_name from airport where acquired = 1";
         pst=conn.prepareStatement(sql1);
         rs=pst.executeQuery();
         
         while(rs.next()){
             String starts = rs.getString(1);
                StartCombo.addItem(starts);
             
         }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }
}   

private void FillDestinationCombo(){
    try{
        String sql1 = "select airport_name from airport where acquired = 1";
         pst=conn.prepareStatement(sql1);
         rs=pst.executeQuery();
         
         while(rs.next()){
             String destinations = rs.getString(1);
                DestinationCombo.addItem(destinations);
             
         }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}  

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartCombo = new javax.swing.JComboBox<>();
        DestinationCombo = new javax.swing.JComboBox<>();
        PlanesCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 550));

        StartCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Επιλέξτε Αφετηρία" }));
        StartCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartComboActionPerformed(evt);
            }
        });

        DestinationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Επιλέξτε Προορισμό" }));
        DestinationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationComboActionPerformed(evt);
            }
        });

        PlanesCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Επιλέξτε Αεροπλάνο" }));
        PlanesCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanesComboActionPerformed(evt);
            }
        });

        jButton1.setText("Ρυθμιση Εισιτηρίων");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Άκυρο");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Confirm.setText("Επιβεβαίωση");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Προσθήκη Πτήσης");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(StartCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(DestinationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(PlanesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlanesCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DestinationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(95, 95, 95)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        ticket ob=new ticket();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
        Flight ob=new Flight();
        ob.setVisible(true);    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
         String plane  = PlanesCombo.getSelectedItem().toString();
        String  start =  StartCombo.getSelectedItem().toString();
        String  destination  =  DestinationCombo.getSelectedItem().toString();
        
        try{
         String SQL = "INSERT INTO `airlinesim`.`flight`\n" +
                    "(`Startline`, `Destination`, `PLANE_ID`)" + 
                    "VALUES (?, ?, ?);";
            pst = conn.prepareStatement(SQL);
            pst.setString(3,plane);
            pst.setString(1,start);
            pst.setString(2,destination);
            pst.executeUpdate();
            pst.close();
        }catch(SQLException e) {
        JOptionPane.showMessageDialog(null,e);
        
    }
        
       setVisible(false);
        Flight ob=new Flight();
        ob.setVisible(true);    
    }//GEN-LAST:event_ConfirmActionPerformed

    private void PlanesComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlanesComboActionPerformed
     
    }//GEN-LAST:event_PlanesComboActionPerformed

    private void DestinationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinationComboActionPerformed

    private void StartComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartComboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addflight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addflight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addflight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addflight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addflight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm;
    private javax.swing.JComboBox<String> DestinationCombo;
    private javax.swing.JComboBox<String> PlanesCombo;
    private javax.swing.JComboBox<String> StartCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
