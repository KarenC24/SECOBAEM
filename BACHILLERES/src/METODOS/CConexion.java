/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METODOS;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Karen
 */
public class CConexion {
    Connection con;
   
    public CConexion (){
        try {
              Class.forName("com.mysql.jdbc.Driver");
                   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/cobaen_56","root","");
                   JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
        }
    }
    
 public Connection getConnection(){
     return con;
 }
}
