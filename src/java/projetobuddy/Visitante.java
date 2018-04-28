/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobuddy;

import java.util.Date;

/**
 *
 * @author ice
 */
public class Visitante {
    String nome, pais;
    int quantidadeDias;


    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    

    public Visitante(String nome, String pais,int quantidadeDias) {
        this.nome = nome;
        this.pais = pais;
        this.quantidadeDias = quantidadeDias;
;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

 
    
}
