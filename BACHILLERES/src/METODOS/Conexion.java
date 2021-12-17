/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METODOS;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Karen
 */

public class Conexion {
   Connection conectar=null;
   
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/cobaen_56","root","");
            
            JOptionPane.showMessageDialog(null, "Conexion existosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
    return conectar;
    
    }

    
    
    
}
