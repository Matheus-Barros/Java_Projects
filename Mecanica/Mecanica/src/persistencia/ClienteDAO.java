/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import negocio.Cliente;

/**
 *
 * @author mathe
 */
public class ClienteDAO implements IClienteDAO{
 
    private Connection connection;
    
    public ClienteDAO(){
         this.connection = new ConFactory().getConnection();
    }
    
    public void adiciona(Cliente cliente){
    
        String sql = "insert into cliente" +
                "(nome, cpf, data_nascimento, sexo, endereco, telefone)" +
                " values (?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setDate(3, new Date(cliente.getData_nascimento().getTimeInMillis()));
            stmt.setString(4, cliente.getSexo());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getTelefone());
            
            stmt.execute();
            stmt.close();
            
            
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }    
  
    }    
     @Override
    public void altera(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listarTodos() {
        try{
        List<Cliente> clientes = new ArrayList<Cliente>();
        PreparedStatement stmt = this.connection.prepareStatement("select * from cliente");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            Cliente cliente = new Cliente();
            
            cliente.setIdCliente(rs.getInt("idcliente"));
            cliente.setNome(rs.getString("nome"));
            
            Calendar data = Calendar.getInstance();
            data.setTime(rs.getDate("data_nascimento"));
            cliente.setData_nascimento(data);
            
            cliente.setCpf(rs.getString("cpf"));
            cliente.setSexo(rs.getString("sexo"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setEndereco(rs.getString("endereco"));
            
            clientes.add(cliente);
           }  
        rs.close();
        stmt.close();
        return clientes;
        
        }catch (SQLException e){
            throw new RuntimeException(e);    
        }
    }

    @Override
    public Cliente getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
