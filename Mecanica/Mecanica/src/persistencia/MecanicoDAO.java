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
import negocio.Mecanico;
/**
 *
 * @author mathe
 */
public class MecanicoDAO implements IMecanicoDAO {

    private Connection connection;
    
    public MecanicoDAO(){
         this.connection = new ConFactory().getConnection();
    }
    
    public void adiciona(Mecanico mecanico){
    
        String sql = "insert into mecanico" +
                "(nome, cpf, salario, data_nascimento, sexo, endereco, telefone, setor, especialidade1, especialidade2, especialidade3, especialidade4)" +
                " values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, mecanico.getNome());
            stmt.setString(2, mecanico.getCpf());
            stmt.setString(3, mecanico.getSalario());
            stmt.setDate(4, new Date(mecanico.getData_nascimento().getTimeInMillis()));
            stmt.setString(5, mecanico.getSexo());
            stmt.setString(6, mecanico.getEndereco());
            stmt.setString(7, mecanico.getTelefone());
            stmt.setString(8, mecanico.getSetor());
            stmt.setString(9, mecanico.getEspecialidade1());
            stmt.setString(10, mecanico.getEspecialidade2());
            stmt.setString(11, mecanico.getEspecialidade3());
            stmt.setString(12, mecanico.getEspecialidade4());
            
            stmt.execute();
            stmt.close();
            
            
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }    
  
    }    
     @Override
    public void altera(Mecanico cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mecanico> listarTodos() {
        try{
        List<Mecanico> mecanicos = new ArrayList<Mecanico>();
        PreparedStatement stmt = this.connection.prepareStatement("select * from mecanico");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            Mecanico mecanico = new Mecanico();
            
            mecanico.setIdmecanico(rs.getInt("idmecanico"));
            mecanico.setNome(rs.getString("nome"));
            
            Calendar data = Calendar.getInstance();
            data.setTime(rs.getDate("data_nascimento"));
            mecanico.setData_nascimento(data);
            
            mecanico.setCpf(rs.getString("cpf"));
            mecanico.setSexo(rs.getString("sexo"));
            mecanico.setTelefone(rs.getString("telefone"));
            mecanico.setEndereco(rs.getString("endereco"));
            mecanico.setSetor("setor");
            mecanico.setSalario("salario");
            
            mecanico.setEspecialidade1("especialidade1");
            mecanico.setEspecialidade2("especialidade2");
            mecanico.setEspecialidade3("especialidade3");
            mecanico.setEspecialidade4("especialidade4");
            
            mecanicos.add(mecanico);
           }  
        rs.close();
        stmt.close();
        return mecanicos;
        
        }catch (SQLException e){
            throw new RuntimeException(e);    
        }
        
        
    }

    @Override
    public Mecanico getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
