/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Servico;

/**
 *
 * @author mathe
 */
public interface IServicoDAO {

    public void adiciona(Servico servico);
    public void altera(Servico servico);
    public void remove (int id);
    public List<Servico> listarTodos();
    public Servico getByID(int id);
    
}
