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
public class Mecanico {
    private int idmecanico;
    private String nome;
    private String setor;
    private String especialidade1;
    private String especialidade2;
    private String especialidade3;
    private String especialidade4;
    private String salario;
    private String sexo;
    private String cpf;
    private Calendar data_nascimento;
    private String endereco;
    private String telefone;

    public int getIdmecanico() {
        return idmecanico;
    }

    public void setIdmecanico(int idmecanico) {
        this.idmecanico = idmecanico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEspecialidade1() {
        return especialidade1;
    }

    public void setEspecialidade1(String especialidade1) {
        this.especialidade1 = especialidade1;
    }

    public String getEspecialidade2() {
        return especialidade2;
    }

    public void setEspecialidade2(String especialidade2) {
        this.especialidade2 = especialidade2;
    }

    public String getEspecialidade3() {
        return especialidade3;
    }

    public void setEspecialidade3(String especialidade3) {
        this.especialidade3 = especialidade3;
    }

    public String getEspecialidade4() {
        return especialidade4;
    }

    public void setEspecialidade4(String especialidade4) {
        this.especialidade4 = especialidade4;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
