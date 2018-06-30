import java.awt.Color;
import static java.lang.Float.parseFloat;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getString;
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
public class A7 extends javax.swing.JFrame {
config db;
ResultSet rs;
    /**
     * Creates new form A7
     */
    public A7() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costy = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblet2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblet = new javax.swing.JTable();
        checkker = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        totalpay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer ID :");

        jo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joActionPerformed(evt);
            }
        });
        jo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                joKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity :");

        jButton1.setText("Validate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblet2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial_No.", "Product_Name", "Product_ID", "Quantity", "Price", "Payment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblet2);
        if (tblet2.getColumnModel().getColumnCount() > 0) {
            tblet2.getColumnModel().getColumn(0).setResizable(false);
            tblet2.getColumnModel().getColumn(1).setResizable(false);
            tblet2.getColumnModel().getColumn(2).setResizable(false);
            tblet2.getColumnModel().getColumn(3).setResizable(false);
            tblet2.getColumnModel().getColumn(4).setResizable(false);
            tblet2.getColumnModel().getColumn(5).setResizable(false);
        }

        tblet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial_No.", "Product_Name", "Quantity", "MRP", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbletMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblet);
        if (tblet.getColumnModel().getColumnCount() > 0) {
            tblet.getColumnModel().getColumn(0).setResizable(false);
            tblet.getColumnModel().getColumn(1).setResizable(false);
            tblet.getColumnModel().getColumn(2).setResizable(false);
            tblet.getColumnModel().getColumn(3).setResizable(false);
            tblet.getColumnModel().getColumn(4).setResizable(false);
        }

        checkker.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkker.setForeground(new java.awt.Color(204, 204, 204));
        checkker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkker.setText("Unchecked");

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Pay");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        totalpay.setEditable(false);
        totalpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpayActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total :");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(costy, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(checkker, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(totalpay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(costy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jo)
                            .addComponent(jTextField2))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalpay, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jo)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkker, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(costy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(totalpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jButton3))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        setSize(new java.awt.Dimension(677, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void joActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joActionPerformed
                                             
// TODO add your handling code here:
    }//GEN-LAST:event_joActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String re="customer WHERE (`Serial_No.`='"+jo.getText()+"')";
try{
      
      //db.sshow(s1);/*String nm=db.aq(a);*/
      rs=db.show(re);
      int i=0;
      while(rs.next())
      {i=1;}
      System.out.println(i);
          /*sn1=rs.getString("Serial_No.");     */ 
          /*pnm1=rs.getString("Product_Name");
          qnty1=rs.getString("Quantity"); */    
          /* mrp1=rs.getString("MRP");*/
      /*dte=rs.getString("date");
      System.out.println(sn1);
      System.out.println(pnm1);
      System.out.println(qnty1);
      System.out.println(mrp1);
      System.out.println(dte);*/
//model.addRow(new Object[]{sn1,pnm1,qnty1,mrp1,dte});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
      //}
      if(i==1)
      {
          checkker.setText("Online");
          checkker.setForeground(Color.green);
      }
      else if(i==0)
      {
          checkker.setText("NULL");
          checkker.setForeground(Color.red);
      }
      else{;}
      
  }catch(Exception e){ 
              e.printStackTrace();
              }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   String yu="DELETE FROM orders WHERE `Payment`='Pending'";
try{db.mix(yu,"Welcome");}catch(SQLException t){t.printStackTrace();}
        DefaultTableModel model=(DefaultTableModel)tblet.getModel();
   
        String sn1="";
   String pnm1="";
   String qnty1="";
   String mrp1="";
   String dte="";
   
   String s2="items";
        
   try{
      
      //db.sshow(s1);/*String nm=db.aq(a);*/
      rs=db.show(s2);
      while(rs.next())
      {
      sn1=rs.getString("Serial_No.");      
      pnm1=rs.getString("Product_Name");
       qnty1=rs.getString("Quantity");     
      mrp1=rs.getString("MRP");
      /*dte=rs.getString("date");
      System.out.println(sn1);
      System.out.println(pnm1);
      System.out.println(qnty1);
      System.out.println(mrp1);
      System.out.println(dte);*/
model.addRow(new Object[]{sn1,pnm1,qnty1,mrp1,dte});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
      }
      
  }catch(Exception e){ 
              e.printStackTrace();
              }
   
    }//GEN-LAST:event_formWindowOpened

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
String stm=jTextField2.getText();
        DefaultTableModel model=(DefaultTableModel)tblet.getModel();

//        c.setVisible(true);        // TODO add your handling code here:
   while(model.getRowCount() > 0)
{
    model.removeRow(0);
}
   
  String s1="items where Product_Name like '"+stm+"%'";
  String sn1="";
   String pnm1="";
   String qnty1="";
   String mrp1="";
   String dte="";
  try{
      
      //db.sshow(s1);/*String nm=db.aq(a);*/
      rs=db.show(s1);
      while(rs.next())
      {
      sn1=rs.getString("Serial_No.");      
      pnm1=rs.getString("Product_Name");
       qnty1=rs.getString("Quantity");     
      mrp1=rs.getString("MRP");
       dte=rs.getString("date");
model.addRow(new Object[]{sn1,pnm1,qnty1,mrp1,dte});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
      }
      
  }catch(Exception e){ 
              e.printStackTrace();
              }


    }//GEN-LAST:event_jTextField2KeyReleased

    private void tbletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbletMouseClicked
        
        String find=checkker.getText();
        if(find.equals("Online"))
        {//latest brackket top - bottom exists search to find the end
            int check=tblet.getSelectedRow();
    
  String cid=(String) tblet.getValueAt(check, 0);
  int v=Integer.parseInt(cid);//int
  String cname=(String) tblet.getValueAt(check, 1);
  String pric=(String) tblet.getValueAt(check, 3);
   int sod=Integer.parseInt(pric);//int
    System.out.println(cid+" - "+cname+" - "+pric);
    {//start
    String d=jo.getText();
    int sd=Integer.parseInt(d);//int
    String xz=costy.getText();//int b=1;
    if(costy.getText().equals("")) {xz="1";
    //set true or false
}
    int ssd=Integer.parseInt(xz);//int
//int v=(int) qnty.getValue();
    
    //float re=parseFloat(costy);
//java.util.Date date=new java.util.Date();
//date=(java.util.Date) dt.getValue();
String s1="insert into orders values('"+d+"','"+cname+"','"+cid+"','"+xz+"','"+pric+"','Pending')";

//setVisible(false);
try{db.mix(s1,"Thank You");}
catch(Exception ex){ex.printStackTrace();};
    }//end
    setVisible(false);
    setVisible(true);
    
    {//start
   DefaultTableModel model2=(DefaultTableModel)tblet2.getModel();
   while(model2.getRowCount() > 0)
{
    model2.removeRow(0);
}
   
        //String sn2="";
   String sn="";
  String pna="";
  String pid="";
  String qnty="";
  String pryc="";
  String pyment="";
       String rt=jo.getText();
       int v1=Integer.parseInt(rt);
   //WHERE (`Serial_No.`='1')
   String s3="orders WHERE (`Serial_No.`='"+rt+"' AND `Payment`='Pending')";
     //String s3="";   
   try{
      
      //db.sshow(s1);/*String nm=db.aq(a);*/
      rs=db.show(s3);
      while(rs.next())
      {
      sn=rs.getString("Serial_No.");
      pna=rs.getString("Product_Name");
      pid=rs.getString("Product_ID");
      qnty=rs.getString("Quantity");
      pryc=rs.getString("Price");
      pyment=rs.getString("Payment");
       
        model2.addRow(new Object[]{sn,pna,pid,qnty,pryc,pyment});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
      }
      
  }catch(Exception e){ 
              e.printStackTrace();
              }
   }//end
        }//latest brackket
        {//totalpayupdate
            String payy="SELECT SUM(CAST(Price AS UNSIGNED)) FROM orders WHERE `Payment`='Pending'";
            try {
                rs=db.payshow(payy);
                while(rs.next())
                {
                    int uiu=rs.getInt(1);
                    String uiui=Integer.toString(uiu);
                totalpay.setText(uiui);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(A7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//totalpayupdate
        // TODO add your handling code here:
    }//GEN-LAST:event_tbletMouseClicked

    private void joKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_joKeyReleased
        checkker.setText("Unchecked");
        Color grey = new Color(204,204,204);
        checkker.setForeground(grey);


        // TODO add your handling code here:
    }//GEN-LAST:event_joKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
A2 w=new A2();
                w.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String u="DELETE FROM orders WHERE `Payment`='Pending'";
try{db.mix(u,"Order Cancelled");
{//tblet2 refresher
{//start
   DefaultTableModel model2=(DefaultTableModel)tblet2.getModel();
   while(model2.getRowCount() > 0)
{
    model2.removeRow(0);
}
   
        //String sn2="";
   String sn="";
  String pna="";
  String pid="";
  String qnty="";
  String pryc="";
  String pyment="";
       String rt=jo.getText();
       int v1=Integer.parseInt(rt);
   //WHERE (`Serial_No.`='1')
   String s3="orders WHERE (`Serial_No.`='"+rt+"' AND `Payment`='Pending')";
     //String s3="";   
   try{
      
      //db.sshow(s1);/*String nm=db.aq(a);*/
      rs=db.show(s3);
      while(rs.next())
      {
      sn=rs.getString("Serial_No.");
      pna=rs.getString("Product_Name");
      pid=rs.getString("Product_ID");
      qnty=rs.getString("Quantity");
      pryc=rs.getString("Price");
      pyment=rs.getString("Payment");
       
        model2.addRow(new Object[]{sn,pna,pid,qnty,pryc,pyment});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
      }
      
  }catch(Exception e){ 
              e.printStackTrace();
              }
   }//end
jo.setText("");
Color grey = new Color(204,204,204);
checkker.setForeground(grey);
checkker.setText("Unchecked");
}
}catch(SQLException e){e.printStackTrace();}
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String pay="UPDATE orders SET `Payment`='Successful' WHERE `Payment`='Pending'";
{//try
try{db.mix(pay,"Payment Succesful");
{//tblet2 refresher
{//start
   DefaultTableModel model2=(DefaultTableModel)tblet2.getModel();
   while(model2.getRowCount() > 0)
{
    model2.removeRow(0);
}
   
        //String sn2="";
   String sn="";
  String pna="";
  String pid="";
  String qnty="";
  String pryc="";
  String pyment="";
       String rt=jo.getText();
       int v1=Integer.parseInt(rt);
   //WHERE (`Serial_No.`='1')
   String s3="orders WHERE (`Serial_No.`='"+rt+"' AND `Payment`='Pending')";
     //String s3="";   
   try{
      
      //db.sshow(s1);/*String nm=db.aq(a);*/
      rs=db.show(s3);
      while(rs.next())
      {
      sn=rs.getString("Serial_No.");
      pna=rs.getString("Product_Name");
      pid=rs.getString("Product_ID");
      qnty=rs.getString("Quantity");
      pryc=rs.getString("Price");
      pyment=rs.getString("Payment");
       
        model2.addRow(new Object[]{sn,pna,pid,qnty,pryc,pyment});//make this wrk as this prints stuff in that table//wrx in !!!while loop!!!
      }
      
  }catch(Exception e){ 
              e.printStackTrace();
              }
   }//end
jo.setText("");
Color grey = new Color(204,204,204);
checkker.setForeground(grey);
checkker.setText("Unchecked");
}
}catch(SQLException e){e.printStackTrace();}
}//try
setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void totalpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalpayActionPerformed

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
            java.util.logging.Logger.getLogger(A7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkker;
    private javax.swing.JTextField costy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jo;
    private javax.swing.JTable tblet;
    private javax.swing.JTable tblet2;
    private javax.swing.JTextField totalpay;
    // End of variables declaration//GEN-END:variables
}