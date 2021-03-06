/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleFornecedor;
import controller.ControleFornecedorProduto;
import controller.ControleProduto;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.FornecedorProduto;
import model.Produto;
import util.FornecedorTableModel;
import util.ProdutoTableModel;

/**
 *
 * @author Mateus
 */
public class VincularFornecedoresEProdutos extends javax.swing.JFrame {

    private String produtoNome;
    private String fornecedorNome;
    private ControleFornecedor controlefor = new ControleFornecedor();
    private ControleProduto controleProd = new ControleProduto();
    private List<Produto> listaProduto = controleProd.listarProdutos("");
    private List<Fornecedor> listaFornecedor = controlefor.listarFornecedores("");
    private FornecedorTableModel modelFornecedor = new FornecedorTableModel(listaFornecedor);
    private ProdutoTableModel modelProduto = new ProdutoTableModel(listaProduto);
    private Produto produto;
    private Fornecedor fornecedor;
    private ControleFornecedorProduto cfp = new ControleFornecedorProduto();

    /**
     * Creates new form viewFornecedorProduto
     */
    public VincularFornecedoresEProdutos() {
        initComponents();
        tabelaProduto.setModel(modelProduto);
        tabelaFornecedor.setModel(modelFornecedor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        buscaFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buscaProduto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnVincular = new javax.swing.JButton();
        VOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("VINCULAR FORNECEDORES E PRODUTOS");

        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaFornecedor);

        jLabel2.setText("Pesquise um Fornecedor:");

        buscaFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaFornecedorKeyReleased(evt);
            }
        });

        jLabel3.setText("Pesquise um produto:");

        buscaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaProdutoKeyReleased(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaProduto);

        btnVincular.setText("VINCULAR");
        btnVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularActionPerformed(evt);
            }
        });

        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVincular, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(buscaProduto))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(buscaFornecedor)))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVincular, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscaFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaFornecedorKeyReleased

        this.fornecedorNome = buscaFornecedor.getText();
        this.listaFornecedor = controlefor.listarFornecedores(this.fornecedorNome);
        this.modelFornecedor = new FornecedorTableModel(this.listaFornecedor);
        tabelaFornecedor.setModel(this.modelFornecedor);


    }//GEN-LAST:event_buscaFornecedorKeyReleased

    private void buscaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaProdutoKeyReleased
        this.produtoNome = buscaProduto.getText();
        this.listaProduto = controleProd.listarProdutos(this.produtoNome);
        this.modelProduto = new ProdutoTableModel(this.listaProduto);
        tabelaProduto.setModel(this.modelProduto);
    }//GEN-LAST:event_buscaProdutoKeyReleased

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
        new FornecedoresEProdutos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VOLTARActionPerformed

    private void btnVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularActionPerformed
        int linhaSelecionada = tabelaFornecedor.getSelectedRow();
        int linhaSelecionada2 = tabelaProduto.getSelectedRow();

        if (linhaSelecionada >= 0 && linhaSelecionada2 >= 0) {
            try {
                this.fornecedor = this.modelFornecedor.get(linhaSelecionada);
                this.produto = this.modelProduto.get(linhaSelecionada2);

                float preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preco: "));
                if (preco > 0) {
                    FornecedorProduto fp = new FornecedorProduto();
                    fp.setFornecedor(this.fornecedor);
                    fp.setProduto(this.produto);
                    fp.setPreco(preco);
                    cfp.cadastrarFP(fp);
                    JOptionPane.showMessageDialog(this, "Vinculo realizado com sucesso", "Vinculo fornecedor e produto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "O Preco deve ser um numero positivo com ponto dividindo a parte decimal.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "O Preco deve ser um numero positivo com ponto dividindo a parte decimal.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Erro: É necessario selecionar um fornecedor e um produto.", "Selecione um fornecedor e um produto.", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnVincularActionPerformed

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
            java.util.logging.Logger.getLogger(VincularFornecedoresEProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VincularFornecedoresEProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VincularFornecedoresEProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VincularFornecedoresEProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VincularFornecedoresEProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VOLTAR;
    private javax.swing.JButton btnVincular;
    private javax.swing.JTextField buscaFornecedor;
    private javax.swing.JTextField buscaProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
