/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication13;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Cesar e Diego
 */
public class Form_Produtos extends javax.swing.JFrame {

    /**
     * Creates new form Form_Produtos
     */
    public Form_Produtos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQnt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorUnt = new javax.swing.JTextField();
        jButtonInserir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaProdutos.setPreferredSize(new java.awt.Dimension(280, 80));
        TabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaProdutos);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Código");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descrição");

        txtDescProd.setName(""); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Quantidade");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Valor Unitário");

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDescProd))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonInserir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorUnt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonExcluir))))
                .addGap(45, 45, 45))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButtonInserir)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButtonAlterar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorUnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        // TODO add your handling code here:
        inserirprodutos();
        listarprodutos();
        limparcampos();
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        alterarprodutos();
        listarprodutos();
        limparcampos();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        excluirprodutos();
        listarprodutos();
        limparcampos();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        listarprodutos(); 
    }//GEN-LAST:event_formWindowOpened

    private void TabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutosMouseClicked
        // TODO add your handling code here:
         if (evt.getClickCount() == 2) {
            int setar = TabelaProdutos.getSelectedRow();
            
            txtCodigoProd.setText(TabelaProdutos.getModel().getValueAt(setar,0).toString());
            txtDescProd.setText(TabelaProdutos.getModel().getValueAt(setar, 1).toString());            
            txtQnt.setText(TabelaProdutos.getModel().getValueAt(setar, 2).toString());
            txtValorUnt.setText(TabelaProdutos.getModel().getValueAt(setar, 3).toString());
            txtDescProd.requestFocus();
        }
    }//GEN-LAST:event_TabelaProdutosMouseClicked

     

private void listarprodutos(){
        try {
            ProdutosDAO objProdutosDAO = new ProdutosDAO();
            
            DefaultTableModel model = (DefaultTableModel) TabelaProdutos.getModel();
            model.setNumRows(0);
            ArrayList<ProdutosDTO> lista = objProdutosDAO.ListarProdutos();
            
            for(int num=0; num < lista.size(); num++){
                model.addRow(new Object[]{
                    lista.get(num).getCodigo_Produto(),
                    lista.get(num).getDescricao_Produto(),
                    lista.get(num).getQuantidade_Produto(),
                    lista.get(num).getValor_Produto(),
                });
            }
        } catch (Exception e) {
        }
    }
private void inserirprodutos(){
        String descricao, quantidade, valor;
        
        descricao = txtDescProd.getText();
        quantidade = txtQnt.getText();
        valor = txtValorUnt.getText();

        ProdutosDTO objprodutosdto = new ProdutosDTO();
        objprodutosdto.setDescricao_Produto(descricao);
        objprodutosdto.setQuantidade_Produto(quantidade);
        objprodutosdto.setValor_Produto(valor);
        ProdutosDAO objprodutosdao = new ProdutosDAO();
        objprodutosdao.cadastrarProduto(objprodutosdto);
    }

private void alterarprodutos(){
        int codigo;
        String descricao, quantidade, valor;
    
        codigo = Integer.parseInt(txtCodigoProd.getText());
        descricao = txtDescProd.getText();
        quantidade = txtQnt.getText();
        valor = txtValorUnt.getText();
        
        ProdutosDTO objProdutosDTO = new ProdutosDTO();
        objProdutosDTO.setCodigo_Produto(codigo);
        objProdutosDTO.setDescricao_Produto(descricao);
        objProdutosDTO.setQuantidade_Produto(quantidade);
        objProdutosDTO.setValor_Produto(valor);
        
        ProdutosDAO objProdutosDAO = new ProdutosDAO();
        objProdutosDAO.alterarprodutos(objProdutosDTO);
    }

    private void excluirprodutos(){
        if(JOptionPane.showConfirmDialog(null, "Deseja excluir este registro?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0){
            int codigo = 0;
        
            codigo = Integer.parseInt(txtCodigoProd.getText());

            ProdutosDTO objProdutosDTO = new ProdutosDTO();
            objProdutosDTO.setCodigo_Produto(codigo);

            ProdutosDAO objProdutosDAO = new ProdutosDAO();
            objProdutosDAO.excluirprodutos(objProdutosDTO);
        }
    }

    private void limparcampos(){
        txtCodigoProd.setText(""); // Limpa o valor o JTextField
        txtDescProd.setText("");
        txtQnt.setText("");
        txtValorUnt.setText("");
        txtDescProd.requestFocus(); // Seta o foco para 
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoProd;
    private javax.swing.JTextField txtDescProd;
    private javax.swing.JTextField txtQnt;
    private javax.swing.JTextField txtValorUnt;
    // End of variables declaration//GEN-END:variables
}
