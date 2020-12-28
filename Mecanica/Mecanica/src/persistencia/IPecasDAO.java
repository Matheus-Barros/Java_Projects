/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Pecas;

/**
 *
 * @author mathe
 */
public interface IPecasDAO {
    
    public void adiciona(Pecas pecas);
    public void altera(Pecas pecas);
    public void remove (int id);
    public List<Pecas> listarTodos();
    public Pecas getByID(int id);
    
}
