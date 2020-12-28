/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author mathe
 */
//adicionar icone 
public class Utilitarios {
        public void InserirIcone(JFrame fmPrincipal) {
        try{
        fmPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage("src/recursos/carro.png"));
        }
        catch(Exception ex){
            System.out.println(ex.toString());
    } 
    }
    
}
