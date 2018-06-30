
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
public class config {
    Connection con;
    Statement st,st1;
    int i=0;

    public config()
    {
        try
        {           
       
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3309/BIGBAZAAR","root","1234");
		st=con.createStatement();
		}
		catch(Exception e){e.printStackTrace();}
    }
    
    public void mix(String s,String ms) throws SQLException
    {
        i=st.executeUpdate(s);
        if(i>0)
        {
 
          String infoMessage="<html><font color=blue>"+ms+"</font></html>";
           
           String titleBar=ms;


            JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
        
        
        }
    }public void fix(String s,String ms) throws SQLException
    {
        i=st.executeUpdate(s);
        if(i>0)
        {
 
          String infoMessage="<html><font color=blue>"+ms+"</font></html>";
           
           String titleBar=ms;


            JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
        
        
        }
    }
    public ResultSet show(String s) throws SQLException
    {    

        ResultSet rs1=st.executeQuery("Select * from "+s);
      return rs1;       
    }
    public ResultSet goshow(String s) throws SQLException
    {    

        ResultSet rs1=st.executeQuery("Select `Serial_No.`,`Product_Name`,`Product_ID`,`Quantity`,`Price` from "+s);
      return rs1;       
    }
    public ResultSet payshow(String s) throws SQLException
    {    

        ResultSet rs1=st.executeQuery(s);
      return rs1;       
    }
    

    public void sshow(String s) throws SQLException
    {
        
        String[] schoolbag = new String[100];
        /*ResultSet rs2=st.executeQuery("SELECT `Serial_No.` FROM "+s);
        ResultSetMetaData metadata2 = rs2.getMetaData();
        int count=metadata2.getColumnCount();*/

        ResultSet rs1=st.executeQuery("Select * FROM "+s);
        ResultSetMetaData metadata = rs1.getMetaData();
        int columnCount = metadata.getColumnCount();
        String [][] test = new String[100][100];
        int x=0,y=0;
        //int srn=5;String yuy;
        /* while(rs2.next())
        {
        /*for (int j=1; j<=columnCount; j++)
        {
        try
        {
        yuy=metadata2.getColumnName(1);
        String srm=rs2.getString(yuy);
        System.out.print(srm);
        //srn=Integer.parseInt(srm);
        /*}catch(Exception e){e.printStackTrace();}
        //srn=(String) yuy;
        }
    }*/String ids;
    A1 rx=new A1();    
    while(rs1.next())
             {
                 /*ids=rs1.getString("Serial_No.");
                 rx.reg(ids);
                 */test[1][0]=rs1.getString("Name");
                 test[2][0]=rs1.getString("Contact_1");
                 test[3][0]=rs1.getString("Address");
                 test[4][0]=rs1.getString("Serial_No.");
             /*for (int i=2; i<=columnCount; i++)
             {  //System.out.print(i);
             String columnName = metadata.getColumnName(i);
             schoolbag[i]=rs1.getString(columnName);
             test[x][y]=schoolbag[i]+" ";
             x++;
             } y++;*/
              }
            
        A3 xx = new A3();
        xx.setVisible(false);
        rx.setVisible(true);
        xx.setVisible(true);
        rx.setVisible(true);
        /*rx.name(test[0][0],test[1][0],test[2][0]);
        rx.reg(srn);*/
        rx.name(test[1][0],test[2][0],test[3][0]);
        rx.reg(test[4][0]);

        
    }
    

    ResultSet executeQuery(String payy) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
