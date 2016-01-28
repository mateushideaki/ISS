/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleProduto;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
import util.ProdutoTableModel;
/**
 *
 * @author Danilo
 */
public class Estoque extends javax.swing.JFrame {

    private String produtoNome;
    private ControleProduto controleProd = new ControleProduto();
    private List<Produto> lista = controleProd.listarProdutos("");
    private ProdutoTableModel modelProduto = new ProdutoTableModel(lista);
    private Produto p = new Produto();
    /**
     * Creates new form Estoque
     */
    public Estoque() {
        initComponents();
        tabelaProduto.setModel(modelProduto);
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
        CadastrarProd = new javax.swing.JButton();
        Incdec = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscaProduto = new javax.swing.JTextField();
        MenuPrincipal = new javax.swing.JButton();
        AjustarPreco = new javax.swing.JButton();
        ExcluirProd = new javax.swing.JButton();
        AlterarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PRODUTO");

        CadastrarProd.setText("CADASTRAR PRODUTO");
        CadastrarProd.setMaximumSize(new java.awt.Dimension(195, 23));
        CadastrarProd.setMinimumSize(new java.awt.Dimension(195, 23));
        CadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdActionPerformed(evt);
            }
        });

        Incdec.setText("INCREMENTAR | DRECREMENTAR");
        Incdec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncdecActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquise um produto:");

        buscaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaProdutoKeyReleased(evt);
            }
        });

        MenuPrincipal.setText("MENU PRINCIPAL");
        MenuPrincipal.setMaximumSize(new java.awt.Dimension(195, 23));
        MenuPrincipal.setMinimumSize(new java.awt.Dimension(195, 23));
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        AjustarPreco.setText("AJUSTAR PREÇOS");
        AjustarPreco.setMaximumSize(new java.awt.Dimension(195, 23));
        AjustarPreco.setMinimumSize(new java.awt.Dimension(195, 23));
        AjustarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjustarPrecoActionPerformed(evt);
            }
        });

        ExcluirProd.setText("EXCLUIR PRODUTO");
        ExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirProdActionPerformed(evt);
            }
        });

        AlterarProd.setText("ALTERAR PRODUTO");
        AlterarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarProdActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CadastrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AjustarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 127, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Incdec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExcluirProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AlterarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AjustarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(buscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(Incdec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(AlterarProd)
                        .addGap(45, 45, 45)
                        .addComponent(ExcluirProd)))
                .addGap(29, 29, 29))
        );

        Incdec.getAccessibleContext().setAccessibleName("INCREMENTAR | DECREMENTAR");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IncdecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncdecActionPerformed
        int linhaSelecionada = tabelaProduto.getSelectedRow();

        if (linhaSelecionada >= 0) {
            this.p = this.modelProduto.get(linhaSelecionada);
            new IncrementaDecrementa(this.p).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto.", "Erro: Nenhum produto selecionado.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IncdecActionPerformed

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        new MenuInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void ExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirProdActionPerformed
        int linhaSelecionada = tabelaProduto.getSelectedRow();

        if (linhaSelecionada >= 0) {
            this.p = this.modelProduto.get(linhaSelecionada);
            controleProd.excluirProduto(this.p);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Produto.", "Erro: Nenhum Produto selecionado.", JOptionPane.ERROR_MESSAGE);
        }

        this.lista = controleProd.listarProdutos("");
        this.modelProduto = new ProdutoTableModel(this.lista);
        tabelaProduto.setModel(this.modelProduto);
    }//GEN-LAST:event_ExcluirProdActionPerformed

    private void CadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdActionPerformed
        new CadastroProduto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarProdActionPerformed

    private void AlterarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarProdActionPerformed
        int linhaSelecionada = tabelaProduto.getSelectedRow();

        if (linhaSelecionada >= 0) {
            this.p = this.modelProduto.get(linhaSelecionada);
            new AlterarProduto(this.p).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto.", "Erro: Nenhum produto selecionado.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AlterarProdActionPerformed

    private void AjustarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjustarPrecoActionPerformed
        new AjustarPreco(this.lista).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AjustarPrecoActionPerformed

    private void buscaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaProdutoKeyReleased
        this.produtoNome = buscaProduto.getText();
        this.lista = controleProd.listarProdutos(this.produtoNome);
        this.modelProduto = new ProdutoTableModel(this.lista);
        tabelaProduto.setModel(this.modelProduto);
    }//GEN-LAST:event_buscaProdutoKeyReleased

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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjustarPreco;
    private javax.swing.JButton AlterarProd;
    private javax.swing.JButton CadastrarProd;
    private javax.swing.JButton ExcluirProd;
    private javax.swing.JButton Incdec;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JTextField buscaProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
