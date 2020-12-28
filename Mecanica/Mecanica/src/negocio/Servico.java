/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Calendar;

/**
 *
 * @author mathe
 */
public class Servico {
 
    private int idServico;
    private String cliente;
    private String mecanico;
    private String situacao;
    private String automovel;
    private Calendar entrega;
    private String pecas;
    private String servico;

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getAutomovel() {
        return automovel;
    }

    public void setAutomovel(String automovel) {
        this.automovel = automovel;
    }

    public Calendar getEntrega() {
        return entrega;
    }

    public void setEntrega(Calendar entrega) {
        this.entrega = entrega;
    }

    public String getPecas() {
        return pecas;
    }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
    
}
