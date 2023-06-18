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

public class CidadesDAO {
    Connection conn; 
    PreparedStatement pstm; 
    ResultSet rs; 
    ArrayList<CidadesDTO> lista = new ArrayList<>();
 
    public void cadastrarCidade(CidadesDTO objCidadesDTO){ 
        String sql = "insert into cidades (nome_cidade, estado_cidade) values (?,?)"; 

        conn = Conexao.getConexao(); 
        try { 
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objCidadesDTO.getNome_Cidade()); 
            pstm.setString(2, objCidadesDTO.getEstado_Cidade()); 

            pstm.execute(); 
            pstm.close(); 

        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 
     }

    public ArrayList<CidadesDTO> ListarCidades() {
        String sql="select * from cidades";
        conn = Conexao.getConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                CidadesDTO objCidadesDTO = new CidadesDTO();
                objCidadesDTO.setCodigo_Cidade(rs.getInt("id_cidade"));
                objCidadesDTO.setNome_Cidade(rs.getString("nome_cidade"));
                objCidadesDTO.setEstado_Cidade(rs.getString("estado_cidade"));
                
                lista.add(objCidadesDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public void alterarcidades(CidadesDTO objCidadesDTO){
        String sql = "update cidades set nome_cidade = ?, estado_cidade = ? where id_cidade = ?";
        
        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCidadesDTO.getNome_Cidade());
            pstm.setString(2, objCidadesDTO.getEstado_Cidade());
            pstm.setInt(3, objCidadesDTO.getCodigo_Cidade());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    public void excluircidades(CidadesDTO objCidadesDTO){
        String sql = "delete from cidades where id_cidade = ?";
        
        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objCidadesDTO.getCodigo_Cidade());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}