/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Cesar e Diego
 */
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ClientesDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClientesDTO> lista = new ArrayList<>();

    public void cadastrarCliente(ClientesDTO objClientesDTO) {
        String sql = "insert into clientes (nome, endereco, id_cidade_cliente) values (?,?,?)";

        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientesDTO.getNome_cliente());
            pstm.setString(2, objClientesDTO.getEndereco_cliente());
            pstm.setString(3, objClientesDTO.getCidade_cliente());

            pstm.execute();
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<ClientesDTO> ListarClientes() {
        String sql = "select * from clientes, cidades where id_cidade_cliente = id_cidade";
        conn = Conexao.getConexao();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ClientesDTO objClientesDTO = new ClientesDTO();
                objClientesDTO.setId_cliente(rs.getInt("id_cliente"));
                objClientesDTO.setNome_cliente(rs.getString("nome"));
                objClientesDTO.setEndereco_cliente(rs.getString("endereco"));
                objClientesDTO.setCidade_cliente(rs.getString("nome_cidade"));

                lista.add(objClientesDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public void alterarCliente(ClientesDTO objClientesDTO) {
        String sql = "update clientes set nome = ?, endereco = ?, id_cidade_cliente = ? where id_cliente = ?";

        conn = Conexao.getConexao();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientesDTO.getNome_cliente());
            pstm.setString(2, objClientesDTO.getEndereco_cliente());
            pstm.setInt(3, objClientesDTO.getid_cidade());
            pstm.setInt(4, objClientesDTO.getId_cliente());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void excluirCliente(ClientesDTO objClientesDTO) {
        String sql = "delete from clientes where id_cliente = ?";

        conn = Conexao.getConexao();
        try {
            //if(objClientesDTO.getId_cliente()!= "")
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objClientesDTO.getId_cliente());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ResultSet carregarCBX() {
        conn = Conexao.getConexao();
        String sql = "select * from cidades ORDER BY nome_cidade;";
        try {
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
            return null;
        }

    }
    
    public int RetornaCidade(int Id){
        conn = Conexao.getConexao();
        String sql = "select id_cidade_cliente from clientes where id_cliente = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, Id);

            ResultSet Cidade;
            Cidade = pstm.executeQuery();
            Cidade.first();
            return Cidade.getInt("id_cidade_cliente");
            

        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
            return 0;
        }
    }

}
