/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Cliente;

/**
 *
 * @author mathe
 */
public interface IClienteDAO {
    public void adiciona(Cliente cliente);
    public void altera(Cliente cliente);
    public void remove (int id);
    public List<Cliente> listarTodos();
    public Cliente getByID(int id);
    
}
