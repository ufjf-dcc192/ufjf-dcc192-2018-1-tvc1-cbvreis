/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobuddy;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ice
 */
public class Pessoa {
    
    String nome, endereco, cidade;
    Date dataPermitida;
    Date dataFinalPermitida;
    int quantidadeDias;
    int quantidadeMaxPessoas;

    public int getQuantidadeMaxPessoas() {
        return quantidadeMaxPessoas;
    }

    public void setQuantidadeMaxPessoas(int quantidadeMaxPessoas) {
        this.quantidadeMaxPessoas = quantidadeMaxPessoas;
    }
    

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    


    public Pessoa(String nome, String endereco, String cidade, Date dataPermitida, Date dataFinalPermitida) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.dataPermitida = dataPermitida;
        this.dataFinalPermitida = dataFinalPermitida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataPermitida() {
        return dataPermitida;
    }

    public void setDataPermitida(Date dataPermitida) {
        this.dataPermitida = dataPermitida;
    }

    public Date getDataFinalPermitida() {
        return dataFinalPermitida;
    }

    public void setDataFinalPermitida(Date dataFinalPermitida) {
        this.dataFinalPermitida = dataFinalPermitida;
    }
    
    
    
    
}
