/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Cesar e Diego
 */
public class ProdutosDTO {
    private String descProd, qnt, valor;
    private int codigo;
    
    
    /**
     * @return the descProd
     */
    public String getDescricao_Produto() {
        return descProd;
    }

    /**
     * @param descProd the descProd to set
     */
    public void setDescricao_Produto(String descProd) {
        this.descProd = descProd;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade_Produto() {
        return qnt;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade_Produto(String quantidade) {
        this.qnt = quantidade;
    }

    /**
     * @return the valor_unitario
     */
    public String getValor_Produto() {
        return valor;
    }

    /**
     * @param valor_unitario the cidade_cliente to set
     */
    public void setValor_Produto(String valor_unitario) {
        this.valor = valor_unitario;
    } 
    
    /**
     * @return the codigo_prod
     */
    public int getCodigo_Produto() {
        return codigo;
    }

    /**
     * @param Codigo_Produto the id_cliente to set
     */
    public void setCodigo_Produto(int codigo) {
        this.codigo = codigo;
    }
    
}
