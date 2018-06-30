
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akatsuki Oshiro
 */
public class A31 extends javax.swing.JFrame {config db;ResultSet rs;

    /**
     * Creates new form A31
     */
    public A31() {
        initComponents();
        db=new config();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        del = new javax.swing.JButton();
        jlo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(255, 51, 0));
        jLayeredPane1.setOpaque(true);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial_No.", "Product_Name", "MRP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        del.setBackground(new java.awt.Color(0, 51, 51));
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jlo.setToolTipText("Name / Registration ID");
        jlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloActionPerformed(evt);
            }
        });
        jlo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jloKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search :");

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(del, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlo))
                    .addComponent(del, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(del)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        
    }//GEN-LAST:event_tabMouseClicked

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        String del=jlo.getText();String deli="";
        String u="DELETE FROM items WHERE `Product_Name`='"+del+"'";
        try{db.mix(u,"Done");/*setVisible(false);setVisible(true);*/jlo.setText("");
            {//to refresh form after deleting shizz
                DefaultTableModel model=(DefaultTableModel)tab.getModel();

                //        c.setVisible(true);        // TODO add your handling code here:
                while(model.getRowCount() > 0)
                {
                    model.removeRow(0);
                }

                String s1="items where Product_Name like '"+deli+"%'";
                String ids="";
                String na="";
                String phn="";
                try{

                    //db.sshow(s1);/*String nm=db.aq(a);*/
                    rs=db.show(s1);
                    while(rs.next())
                    {
                        ids=rs.getString("Serial_No.");
                    na=rs.getString("Product_Name");
                    phn=rs.getString("MRP");
                        model.addRow(new Object[]{ids,na,phn});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch(SQLException e){e.printStackTrace();}
        // TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void jloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jloActionPerformed

    private void jloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jloKeyReleased
        String stm=jlo.getText();
        DefaultTableModel model=(DefaultTableModel)tab.getModel();

        //        c.setVisible(true);        // TODO add your handling code here:
        while(model.getRowCount() > 0)
        {
            model.removeRow(0);
        }

        String s1="items where Product_Name like '"+stm+"%'";
        String ids="";
        String na="";
        String phn="";
        try{

            //db.sshow(s1);/*String nm=db.aq(a);*/
            rs=db.show(s1);
            while(rs.next())
            {
                ids=rs.getString("Serial_No.");
                    na=rs.getString("Product_Name");
                    phn=rs.getString("MRP");
                model.addRow(new Object[]{ids,na,phn});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jloKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
DefaultTableModel model=(DefaultTableModel)tab.getModel();

        //        c.setVisible(true);        // TODO add your handling code here:
        while(model.getRowCount() > 0)
        {
            model.removeRow(0);
        }

        String s1="items";
        String ids="";
        String na="";
        String phn="";
        try{

            //db.sshow(s1);/*String nm=db.aq(a);*/
            rs=db.show(s1);
            while(rs.next())
            {
                ids=rs.getString("Serial_No.");
                    na=rs.getString("Product_Name");
                    phn=rs.getString("MRP");
                model.addRow(new Object[]{ids,na,phn});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
            }

        }catch(Exception e){
            e.printStackTrace();
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(A31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                A31 cx=new A31();
                cx.setVisible(true);
                cx.setTitle("Remove Product");
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jlo;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}