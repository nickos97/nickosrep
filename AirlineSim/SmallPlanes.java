
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class SmallPlanes extends javax.swing.JFrame {
Connection conn;
ResultSet rs, rs2;
PreparedStatement pst;
   
    public SmallPlanes() {
        initComponents();
        conn=JavaConnect.ConnectDb();
       // setExtendedState(MAXIMIZED_BOTH); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 550));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Μικρά");

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("737-800");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 0));
        jButton5.setText("737-700");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 0));
        jButton6.setText("737-900");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Πίσω");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)))
                .addGap(228, 228, 228)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    ///////////////////737-800//////////////////////////////////////
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 try{
                int response = JOptionPane.showConfirmDialog(this, "Αεροπλάνο: 737-800. Κόστος: 6.000.000", "Επιβεβάιωση", JOptionPane.YES_NO_OPTION);
             
                if(response == JOptionPane.YES_OPTION){
             
                    String sql = "select Balance from finance";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    while(rs.next()){
                    int bal = rs.getInt(1);
                    System.out.println(bal);

                        if(bal>=500000){
                            System.out.println("ola kalaaaa");
                            String sql2 = "INSERT INTO `airlinesim`.`airplane`\n" +
                            "(`MODEL`,\n" +"`PRICE`,\n" +"`SELL_PRICE`,\n" +"`SEATS`,\n" +"`SIZE`,\n" +
                            "`CONDITION`,\n" + "`REPAIR_COST`,\n" + "`USE_COST`,\n" + "`OWNED`)\n" +
                            "VALUES\n" + "(\n" + "'737-800',\n" + "6000000,\n" + "3000000,\n" + "162,\n" +
                            "'small',\n" + "100,\n" + "80000,\n" + "50000,\n" + "'YES'); ";
                            pst=conn.prepareStatement(sql2);
                            pst.executeUpdate();

                            String sql3 = "update finance set Balance = Balance - 6000000 where keyword = 1;";
                            pst=conn.prepareStatement(sql3);
                            pst.executeUpdate();
                            
                            String str = "Αγορά Επιτυχής!";
                            JOptionPane.showMessageDialog(null, str);
                            setVisible(false);
                            Airplanes ob=new Airplanes(); //Eδω βάλε βασική Οθόνη όταν είναι έτοιμη.
                            ob.setVisible(true);
                            
                        }
                        else{
                            String str = "Ανεπαρκές Υπόλοιπο!";
                            JOptionPane.showMessageDialog(null, str);
                            setVisible(false);
                            BuyPlane ob=new BuyPlane();
                            ob.setVisible(true);
                            
                            
                        }
                    }                 
                }
                if(response == JOptionPane.NO_OPTION){
                    setVisible(false);
                    BuyPlane ob=new BuyPlane();
                    ob.setVisible(true);

                    
                }
            }catch(Exception e) {
        JOptionPane.showMessageDialog(null,e);
            }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    //////////////////////////////////////////737-700//////////////////////////////////////  
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      try{
                int response = JOptionPane.showConfirmDialog(this, "Αεροπλάνο: 737-700. Κόστος: 5.000.000", "Επιβεβάιωση", JOptionPane.YES_NO_OPTION);
             
                if(response == JOptionPane.YES_OPTION){
             
                    String sql = "select Balance from finance";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    while(rs.next()){
                    int bal = rs.getInt(1);
                    System.out.println(bal);

                        if(bal>=500000){
                            System.out.println("ola kalaaaa");
                            String sql2 = "INSERT INTO `airlinesim`.`airplane`\n" +
                            "(`MODEL`,\n" +"`PRICE`,\n" +"`SELL_PRICE`,\n" +"`SEATS`,\n" +"`SIZE`,\n" +
                            "`CONDITION`,\n" + "`REPAIR_COST`,\n" + "`USE_COST`,\n" + "`OWNED`)\n" +
                            "VALUES\n" + "(\n" + "'737-700',\n" + "5000000,\n" + "2500000,\n" + "126,\n" +
                            "'small',\n" + "100,\n" + "80000,\n" + "50000,\n" + "'YES'); ";
                            pst=conn.prepareStatement(sql2);
                            pst.executeUpdate();

                            String sql3 = "update finance set Balance = Balance - 5000000 where keyword = 1;";
                            pst=conn.prepareStatement(sql3);
                            pst.executeUpdate();
                            
                            String str = "Αγορά Επιτυχής!";
                            JOptionPane.showMessageDialog(null, str);
                            setVisible(false);
                            Airplanes ob=new Airplanes(); //Eδω βάλε βασική Οθόνη όταν είναι έτοιμη.
                            ob.setVisible(true);
                            
                        }
                        else{
                            String str = "Ανεπαρκές Υπόλοιπο!";
                            JOptionPane.showMessageDialog(null, str);
                            setVisible(false);
                            BuyPlane ob=new BuyPlane();
                            ob.setVisible(true);
                            
                            
                        }
                    }                 
                }
                if(response == JOptionPane.NO_OPTION){
                    setVisible(false);
                    BuyPlane ob=new BuyPlane();
                    ob.setVisible(true);

                    
                }
            }catch(Exception e) {
        JOptionPane.showMessageDialog(null,e);
            }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    
    /////////////////////////////737-900/////////////////////////////////
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
try{
                int response = JOptionPane.showConfirmDialog(this, "Αεροπλάνο: 737-900. Κόστος: 8.000.000", "Επιβεβάιωση", JOptionPane.YES_NO_OPTION);
             
                if(response == JOptionPane.YES_OPTION){
             
                    String sql = "select Balance from finance";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    while(rs.next()){
                    int bal = rs.getInt(1);
                    System.out.println(bal);

                        if(bal>=500000){
                            System.out.println("ola kalaaaa");
                            String sql2 = "INSERT INTO `airlinesim`.`airplane`\n" +
                            "(`MODEL`,\n" +"`PRICE`,\n" +"`SELL_PRICE`,\n" +"`SEATS`,\n" +"`SIZE`,\n" +
                            "`CONDITION`,\n" + "`REPAIR_COST`,\n" + "`USE_COST`,\n" + "`OWNED`)\n" +
                            "VALUES\n" + "(\n" + "'737-900',\n" + "8000000,\n" + "4000000,\n" + "184,\n" +
                            "'small',\n" + "100,\n" + "120000,\n" + "60000,\n" + "'YES'); ";
                            pst=conn.prepareStatement(sql2);
                            pst.executeUpdate();

                            String sql3 = "update finance set Balance = Balance - 8000000 where keyword = 1;";
                            pst=conn.prepareStatement(sql3);
                            pst.executeUpdate();
                            
                            String str = "Αγορά Επιτυχής!";
                            JOptionPane.showMessageDialog(null, str);
                            setVisible(false);
                            Airplanes ob=new Airplanes(); //Eδω βάλε βασική Οθόνη όταν είναι έτοιμη.
                            ob.setVisible(true);
                            
                        }
                        else{
                            String str = "Ανεπαρκές Υπόλοιπο!";
                            JOptionPane.showMessageDialog(null, str);
                            setVisible(false);
                            BuyPlane ob=new BuyPlane();
                            ob.setVisible(true);
                            
                            
                        }
                    }                 
                }
                if(response == JOptionPane.NO_OPTION){
                    setVisible(false);
                    BuyPlane ob=new BuyPlane();
                    ob.setVisible(true);

                    
                }
            }catch(Exception e) {
        JOptionPane.showMessageDialog(null,e);
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    setVisible(false);
                    BuyPlane ob=new BuyPlane();
                    ob.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SmallPlanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmallPlanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmallPlanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmallPlanes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmallPlanes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
