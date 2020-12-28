/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Mecanico;

/**
 *
 * @author mathe
 */
public interface IMecanicoDAO {
    public void adiciona(Mecanico mecanico);
    public void altera(Mecanico mecanico);
    public void remove (int id);
    public List<Mecanico> listarTodos();
    public Mecanico getByID(int id);
        
}
