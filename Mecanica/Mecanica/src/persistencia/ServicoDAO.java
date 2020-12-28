/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import negocio.Servico;

/**
 *
 * @author mathe
 */
public class ServicoDAO implements IServicoDAO{

    private Connection connection;
    
    public ServicoDAO(){
         this.connection = new ConFactory().getConnection();
    }

    public void adiciona(Servico servico){
    
        String sql = "insert into servico" +
                "(cliente, mecanico, situacao, automovel, pecas, data_entrega, servico)" +
                " values (?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, servico.getCliente());
            stmt.setString(2, servico.getMecanico());
            stmt.setString(3, servico.getSituacao());
            stmt.setString(4, servico.getAutomovel());
            stmt.setString(5, servico.getPecas());            

            stmt.setDate(6, new Date(servico.getEntrega().getTimeInMillis()));
            stmt.setString(7, servico.getServico());
            
            stmt.execute();
            stmt.close();
            
            
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }        
    }
    

    @Override
    public void altera(Servico servico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servico> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Servico getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
}
