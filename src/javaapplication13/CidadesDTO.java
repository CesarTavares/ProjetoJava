/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Cesar e Diego
 */
public class CidadesDTO {
    private int id_cidade;
    private String nome_cidade;
    private String estado_cidade;

    /**
     * @return the id_cidade
     */
    public int getCodigo_Cidade() {
        return id_cidade;
    }

    /**
     * @param id_cidade the id_cidade to set
     */
    public void setCodigo_Cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    /**
     * @return the nome_cidade
     */
    public String getNome_Cidade() {
        return nome_cidade;
    }

    /**
     * @param nome_cidade the nome_cidade to set
     */
    public void setNome_Cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    } 
    
    /**
     * @return the estado_cidade
     */
    public String getEstado_Cidade() {
        return estado_cidade;
    }

    /**
     * @param estado_cidade the nome_cidade to set
     */
    public void setEstado_Cidade(String estado_cidade) {
        this.estado_cidade = estado_cidade;
    }
}
