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
import negocio.Pecas;

/**
 *
 * @author mathe
 */
public class PecasDAO implements IPecasDAO {
    
    private Connection connection;
    
    public PecasDAO(){
         this.connection = new ConFactory().getConnection();
    }

    public void adiciona(Pecas pecas){
    
        String sql = "insert into pecas" +
                "(nome, codigo, preco, setor, foto)" +
                " values (?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pecas.getNome());
            stmt.setString(2, pecas.getCodigo());
            stmt.setString(3, pecas.getPreco());
            stmt.setString(4, pecas.getSetor());
            stmt.setString(5, pecas.getFoto());            

            
            stmt.execute();
            stmt.close();
            
            
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }    
  
    }

    @Override
    public void altera(Pecas pecas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pecas> listarTodos() {
        try{
        List<Pecas> pecas = new ArrayList<Pecas>();
        PreparedStatement stmt = this.connection.prepareStatement("select * from pecas");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            Pecas peca = new Pecas();
            
            peca.setIdPeca(rs.getInt("idPecas"));
            peca.setNome(rs.getString("nome"));

            peca.setCodigo(rs.getString("codigo"));
            peca.setPreco(rs.getString("preco"));
            peca.setSetor(rs.getString("setor"));

            
            pecas.add(peca);
           }  
        rs.close();
        stmt.close();
        return pecas;
        
        }catch (SQLException e){
            throw new RuntimeException(e);    
        }
        
    }

    @Override
    public Pecas getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
