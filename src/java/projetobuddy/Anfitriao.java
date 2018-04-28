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
public class Anfitriao {

    private String nome, endereco, cidade;
    private static int quantidadeDiasMaximo;
    private String dataPermitida;
    private String dataFinalPermitida;
    private int quantidadeDias;
    int quantidadeMaxPessoas;
    private java.util.List<Visitante> visitantes = new ArrayList<>();

    public java.util.List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(java.util.List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    

    public int getQuantidadeMaxPessoas() {
        return quantidadeMaxPessoas;
    }

    public void setQuantidadeMaxPessoas() {
        this.quantidadeMaxPessoas = quantidadeMaxPessoas -1;
    }

    public Anfitriao(String nome, String endereco, String cidade, int quantidadeDias,int quantidadePessoas) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.dataPermitida = dataPermitida;
        this.dataFinalPermitida = dataFinalPermitida;
        this.quantidadeDias = quantidadeDias;
        this.quantidadeMaxPessoas = quantidadePessoas;
        this.quantidadeDiasMaximo = quantidadeDias;

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

    public void setDataPermitida(String dataPermitida) {
        this.dataPermitida = dataPermitida;
    }

    public void setDataFinalPermitida(String dataFinalPermitida) {
        this.dataFinalPermitida = dataFinalPermitida;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int decrecementa) {
        this.quantidadeDias = quantidadeDias - decrecementa;
    }
}
