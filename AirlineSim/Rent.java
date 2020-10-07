import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Rent extends javax.swing.JFrame {
Connection conn;
ResultSet rs,rs1,rs2,rs3;
PreparedStatement pst;
    
    
    
    public Rent() {
        initComponents();
      conn=JavaConnect.ConnectDb();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Heathrow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ιωάννης Δασκαλογιάννης");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ελευθέριος Βενιζέλος");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Πίσω");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 22)); // NOI18N
        jLabel1.setText("Ενοικίαση Αεροδρομίου");

        jButton5.setText("Changi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Dubai airport");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Newark");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(199, 199, 199)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(30, 30, 30)))
                .addComponent(jButton4)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
          
    private void display() {
         setVisible(false);
         Airport ob = new Airport();
         ob.setVisible(true);
     }
    
    private void receiveprice(int id){
        try {
         String sql0="select price from airport where airport_id="+id;
             pst=conn.prepareStatement(sql0);
            rs1=pst.executeQuery();
        } catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
    }
    
    private void receivebalance() {
        try {
        String sql1="select Balance from finance";
            pst=conn.prepareStatement(sql1);
            rs=pst.executeQuery();
        }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
        
    }
    
     private int validates()
    {
        int a=0;
        
        int response=JOptionPane.showConfirmDialog(null, "θέλετε να συνεχίσετε με την αγορά;","Παράθυρο επιβεβαίωσης",JOptionPane.YES_NO_OPTION);
      if (response==JOptionPane.YES_OPTION){
          a++;
      }
      else {
        display();
      }
        return a;
    }
     
     private void subtractAmount() {
         try {
          String sql3="update finance set Balance = Balance - (select price from airport where airport_id=2348 ) where keyword=1";
          pst=conn.prepareStatement(sql3);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
     
      private void subtractAmount2() {
         try {
          String sql3="update finance set Balance = Balance - (select price from airport where airport_id=2245 ) where keyword=1";
          pst=conn.prepareStatement(sql3);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
      
       private void subtractAmount3() {
         try {
          String sql3="update finance set Balance = Balance - (select price from airport where airport_id=2342 ) where keyword=1";
          pst=conn.prepareStatement(sql3);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
       
        private void subtractAmount4() {
         try {
          String sql3="update finance set Balance = Balance - (select price from airport where airport_id=2379 ) where keyword=1";
          pst=conn.prepareStatement(sql3);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
        
         private void subtractAmount5() {
         try {
          String sql3="update finance set Balance = Balance - (select price from airport where airport_id=2524 ) where keyword=1";
          pst=conn.prepareStatement(sql3);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
         
          private void subtractAmount6() {
         try {
          String sql3="update finance set Balance = Balance - (select price from airport where airport_id=2783 ) where keyword=1";
          pst=conn.prepareStatement(sql3);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
     
     private void addToInventory() {
         
         try {
         String sql2="Update airport set acquired=1 where airport_id=2348";
         pst=conn.prepareStatement(sql2);
         pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
     
      private void addToInventory2() {
         
         try {
          String sql2="Update airport set acquired=1 where airport_id=2245";
          pst=conn.prepareStatement(sql2);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
      
       private void addToInventory3() {
         
         try {
          String sql2="Update airport set acquired=1 where airport_id=2342";
          pst=conn.prepareStatement(sql2);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
       
        private void addToInventory4() {
         
         try {
         String sql2="Update airport set acquired=1 where airport_id=2379";
         pst=conn.prepareStatement(sql2);
         pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
        
         private void addToInventory5() {
         
         try {
          String sql2="Update airport set acquired=1 where airport_id=2524";
          pst=conn.prepareStatement(sql2);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
         
          private void addToInventory6() {
         
         try {
          String sql2="Update airport set acquired=1 where airport_id=2783";
          pst=conn.prepareStatement(sql2);
          pst.executeUpdate();
         }catch (Exception e) {JOptionPane.showMessageDialog(null, e);}
     }
         
     private void displayConfirmationMessage(String str) {
         JOptionPane.showMessageDialog(null, "Μόλις αγόρασες μια θέση στο αεροδρόμιο " + str);
     }
     
     private void displayErrorMessage(){
         JOptionPane.showMessageDialog(null, "το υπόλοιπο σου δεν είναι αρκετό");
     }
     
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        try{
            String str="Ελευθέριος Βενιζέλος";
            String sql="select airport_id from airport where airport_id=2348";
            pst=conn.prepareStatement(sql);
            rs2=pst.executeQuery();
            
            while(rs2.next()) {
            int id=rs2.getInt(1);
            receiveprice(id);
            receivebalance();
            }
            while(rs.next() && rs1.next()) {
                int bal=rs.getInt(1);
                int pr=rs1.getInt(1);
                if(bal>=pr){
                    int b = validates();
                    if (b>0) {
                         subtractAmount3();
                         addToInventory3();
                         displayConfirmationMessage(str);
                         display();
                    }
                    
                    else {
                        display();
                    }
                }
                else {
                displayErrorMessage();
                display();
                }
            }
            
         } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             }

    }//GEN-LAST:event_jButton3ActionPerformed
    
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String str="Heathrow";
            String sql="select airport_id from airport where airport_id=2342";
            pst=conn.prepareStatement(sql);
            rs2=pst.executeQuery();
            
            while(rs2.next()) {
            int id=rs2.getInt(1);
            receiveprice(id);
            receivebalance();
            }
            while(rs.next() && rs1.next()) {
                int bal=rs.getInt(1);
                int pr=rs1.getInt(1);
                if(bal>=pr){
                    int b = validates();
                    if (b>0) {
                         subtractAmount();
                         addToInventory();
                         displayConfirmationMessage(str);
                         display();
                    }
                    
                    else {
                        display();
                    }
                }
                else {
                displayErrorMessage();
                display();
                }
            }
            
         } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             }
                     
                     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              try{
            String str="Ιωάννης Δασκαλογιάννης";
            String sql="select airport_id from airport where airport_id=2524";
            pst=conn.prepareStatement(sql);
            rs2=pst.executeQuery();
            
            while(rs2.next()) {
            int id=rs2.getInt(1);
            receiveprice(id);
            receivebalance();
            }
            while(rs.next() && rs1.next()) {
                int bal=rs.getInt(1);
                int pr=rs1.getInt(1);
                if(bal>=pr){
                    int b = validates();
                    if (b>0) {
                         subtractAmount5();
                         addToInventory5();
                         displayConfirmationMessage(str);
                         display();
                    }
                    
                    else {
                        display();
                    }
                }
                else {
                displayErrorMessage();
                display();
                }
            }
            
         } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        Airport ob = new Airport();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          try{
            String str="Changi";
            String sql="select airport_id from airport where airport_id=2245";
            pst=conn.prepareStatement(sql);
            rs2=pst.executeQuery();
            
            while(rs2.next()) {
            int id=rs2.getInt(1);
            receiveprice(id);
            receivebalance();
            }
            while(rs.next() && rs1.next()) {
                int bal=rs.getInt(1);
                int pr=rs1.getInt(1);
                if(bal>=pr){
                    int b = validates();
                    if (b>0) {
                         subtractAmount2();
                         addToInventory2();
                         displayConfirmationMessage(str);
                         display();
                    }
                    
                    else {
                        display();
                    }
                }
                else {
                displayErrorMessage();
                display();
                }
            }
            
         } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            try{
            String str="Dubai";
            String sql="select airport_id from airport where airport_id=2379";
            pst=conn.prepareStatement(sql);
            rs2=pst.executeQuery();
            
            while(rs2.next()) {
            int id=rs2.getInt(1);
            receiveprice(id);
            receivebalance();
            }
            while(rs.next() && rs1.next()) {
                int bal=rs.getInt(1);
                int pr=rs1.getInt(1);
                if(bal>=pr){
                    int b = validates();
                    if (b>0) {
                         subtractAmount4();
                         addToInventory4();
                         displayConfirmationMessage(str);
                         display();
                    }
                    
                    else {
                        display();
                    }
                }
                else {
                displayErrorMessage();
                display();
                }
            }
            
         } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       try{
            String str="Newark";
            String sql="select airport_id from airport where airport_id=2783";
            pst=conn.prepareStatement(sql);
            rs2=pst.executeQuery();
            
            while(rs2.next()) {
            int id=rs2.getInt(1);
            receiveprice(id);
            receivebalance();
            }
            while(rs.next() && rs1.next()) {
                int bal=rs.getInt(1);
                int pr=rs1.getInt(1);
                if(bal>=pr){
                    int b = validates();
                    if (b>0) {
                         subtractAmount6();
                         addToInventory6();
                         displayConfirmationMessage(str);
                         display();
                    }
                    
                    else {
                        display();
                    }
                }
                else {
                displayErrorMessage();
                display();
                }
            }
            
         } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
             }
    }//GEN-LAST:event_jButton7ActionPerformed
    

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
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
