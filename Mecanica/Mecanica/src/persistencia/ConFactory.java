/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class ConFactory {
    public Connection getConnection(){
    
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/dboficina","root","");
        }
        catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
}

