/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;
import java.sql.SQLException;

/**
 *
 * @author Cesar e Diego
 */
import java.sql.*; 
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProdutosDAO {
    Connection conn; 
    PreparedStatement pstm; 
    ResultSet rs; 
    ArrayList<ProdutosDTO> lista = new ArrayList<>();
 
    public void cadastrarProduto(ProdutosDTO objProdutosDTO){ 
        String sql = "insert into produtos (descricao_prod, qnt_prod, valor_unit) values (?,?,?)"; 

        conn = Conexao.getConexao(); 
        try { 
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objProdutosDTO.getDescricao_Produto()); 
            pstm.setString(2, objProdutosDTO.getQuantidade_Produto()); 
            pstm.setString(3, objProdutosDTO.getValor_Produto());  

            pstm.execute(); 
            pstm.close(); 

        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
     }

    public ArrayList<ProdutosDTO> ListarProdutos() {
        String sql="select * from produtos";
        conn = Conexao.getConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ProdutosDTO objProdutosDTO = new ProdutosDTO();
                objProdutosDTO.setCodigo_Produto(rs.getInt("codigo_prod"));
                objProdutosDTO.setDescricao_Produto(rs.getString("descricao_prod"));
                objProdutosDTO.setQuantidade_Produto(rs.getString("qnt_prod"));
                objProdutosDTO.setValor_Produto(rs.getString("valor_unit"));
                
                lista.add(objProdutosDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public void alterarprodutos(ProdutosDTO objProdutosDTO){
        String sql = "update produtos set descricao_prod = ?, qnt_prod = ?, valor_unit = ? where codigo_prod = ?";
        
        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutosDTO.getDescricao_Produto());
            pstm.setString(2, objProdutosDTO.getQuantidade_Produto());
            pstm.setString(3, objProdutosDTO.getValor_Produto());
            pstm.setInt(4, objProdutosDTO.getCodigo_Produto());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    public void excluirprodutos(ProdutosDTO objProdutosDTO){
        String sql = "delete from produtos where codigo_prod = ?";
        
        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objProdutosDTO.getCodigo_Produto());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}