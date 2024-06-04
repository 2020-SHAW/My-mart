import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args){
    try{
    String username="root";
    String pass="0000";
    String sql="jdbc:mysql://localhost:3306/inventory";
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection(sql,username,pass);
    
    JOptionPane.showMessageDialog(null, "connected");
    
    String query="SELECT * FROM packages";
    PreparedStatement ps=conn.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    if(rs.next()){
        JOptionPane.showMessageDialog(null, "Uploaded");
    }
}catch(HeadlessException | ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
}
}
