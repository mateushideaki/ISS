/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleCompra;
import controller.ControleCompraProduto;
import controller.ControleProduto;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import model.Compra;
import model.CompraProduto;
import model.Fornecedor;
import model.Produto;
import util.CompraProdutoTableModel;

/**
 *
 * @author lucas
 */
public class ConfirmarCompra extends javax.swing.JFrame {

    private Compra compra = new Compra();
    private Compra compraConfirmada = new Compra();
    
    private ControleCompra controleCompra = new ControleCompra();
    
    private ControleCompraProduto controleCp = new ControleCompraProduto();
    private List<CompraProduto> listaCompraP;
    private CompraProdutoTableModel modelCompraP;
    
    private ControleProduto controleProd = new ControleProduto();
    
    private ControleCompraProduto controleConfirmado = new ControleCompraProduto();
    private ArrayList<CompraProduto> listaConfirmado = new ArrayList<CompraProduto>();
    private CompraProdutoTableModel modelConfirmado;
    
    /**
     * Creates new form ConfirmarCompra
     */
    public ConfirmarCompra(Compra comp) {
        initComponents();
        this.compra = comp;
        this.compra.setId(comp.getId());
        this.listaCompraP = controleCp.listarCP(this.compra);
        this.modelCompraP = new CompraProdutoTableModel(this.listaCompraP);
        TabelaCompraProduto.setModel(modelCompraP);
        LabelFornecedor.setText(comp.getFornecedorNome());
        totalPedido.setText("" + comp.getTotal());
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
        jLabel5 = new javax.swing.JLabel();
        ConfirmarCompraB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCompraProduto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        totalConfirmado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelFornecedor = new javax.swing.JLabel();
        btnAddProduto = new javax.swing.JButton();
        qtdProduto = new javax.swing.JSpinner();
        qtdRemover = new javax.swing.JSpinner();
        btnRemoverProd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaCompraProdutoConferidos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalPedido = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CONFIRMAR COMPRA");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("LISTA DE PRODUTOS DA COMPRA:");

        ConfirmarCompraB.setText("CONFIRMAR COMPRA");
        ConfirmarCompraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarCompraBActionPerformed(evt);
            }
        });

        TabelaCompraProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TabelaCompraProduto);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("TOTAL RECEBIDO:");

        totalConfirmado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalConfirmado.setText("R$ 0,00");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("FORNECEDOR:");

        LabelFornecedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelFornecedor.setText(" ");

        btnAddProduto.setText("ADD PRODUTO");
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        btnRemoverProd.setText("REMOVER PRODUTO");
        btnRemoverProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("LISTA DE PRODUTOS CONFERIDOS DA COMPRA:");

        TabelaCompraProdutoConferidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TabelaCompraProdutoConferidos);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("TOTAL PEDIDO:");

        totalPedido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalPedido.setText("R$ 0,00");

        Cancelar.setText("CANCELAR");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(LabelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(totalPedido))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalConfirmado)))
                                        .addGap(155, 155, 155))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2)
                                        .addGap(18, 18, 18)
                                        .addComponent(qtdRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addComponent(btnRemoverProd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ConfirmarCompraB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LabelFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(totalPedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(totalConfirmado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(177, 177, 177)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qtdRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemoverProd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmarCompraB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        int linhaSelecionada = TabelaCompraProduto.getSelectedRow();
        CompraProduto cp = new CompraProduto();
        CompraProduto produto = new CompraProduto();
        ListIterator listIt = this.listaConfirmado.listIterator();
        ListIterator listProdIt = this.listaCompraP.listIterator();
        
        int posicao = 0;
        int posicao2 = 0;
        if (linhaSelecionada >= 0) {                                            //verifica se algum produto foi selecionado
            if ((int) qtdProduto.getValue() > 0) {                              //verifica se a quantidade e positiva
                produto = this.modelCompraP.get(linhaSelecionada);

                if ((int) qtdProduto.getValue() <= produto.getQuantidade()) {     //verifica se tem no estoque

                    cp.setProduto(produto.getProduto());
                    cp.setCompra(this.compraConfirmada);
                    cp.setQuantidade((int) qtdProduto.getValue());
                    cp.setCusto((int) qtdProduto.getValue() * produto.getCusto()/produto.getQuantidade());

                    while (listProdIt.hasNext()) {                      //remove o produto da lista
                        posicao2++;
                        CompraProduto cprodIt = (CompraProduto) listProdIt.next();
                        if (cprodIt.getProduto().getId() == cp.getProduto().getId()) {
                            posicao2--;
                            listProdIt.remove();
                            break;
                        }
                    } 
                    
                    while (listIt.hasNext()) {
                        posicao++;
                        CompraProduto cpIt = (CompraProduto) listIt.next();
                        if (cpIt.getProduto().getId() == produto.getProduto().getId()) {
                            posicao--;
                            cp.setQuantidade(cp.getQuantidade() + cpIt.getQuantidade());
                            cp.setCusto(cp.getCusto() + cpIt.getCusto());
                            compraConfirmada.setTotal(compraConfirmada.getTotal() - cpIt.getCusto());
                            listIt.remove();
                            break;
                        }
                    }
                    if(produto.getQuantidade() == (int)qtdProduto.getValue()){
                        produto.setCusto(0);
                        produto.setQuantidade(produto.getQuantidade() - (int) qtdProduto.getValue());
                    }else{
                        produto.setCusto(produto.getCusto() - (int)qtdProduto.getValue()*produto.getCusto()/produto.getQuantidade());
                        produto.setQuantidade(produto.getQuantidade() - (int) qtdProduto.getValue());
                    }
                    
                    controleCp.alterarCP(produto);
                    this.listaCompraP.add(posicao2, produto);                                //add na lista
                    
                    this.modelCompraP = new CompraProdutoTableModel(controleCp.listarCP(compra));
                    TabelaCompraProduto.setModel(this.modelCompraP);

                    this.listaConfirmado.add(posicao, cp);                                //add na lista

                    this.modelConfirmado = new CompraProdutoTableModel(this.listaConfirmado);  //atualiza a tabela
                    TabelaCompraProdutoConferidos.setModel(this.modelConfirmado);
                    this.compraConfirmada.setTotal(this.compraConfirmada.getTotal() + cp.getCusto());  //atualiza o total
                    totalConfirmado.setText("" + this.compraConfirmada.getTotal());

                } else {
                    JOptionPane.showMessageDialog(this, "So existem " + produto.getQuantidade() + " unidades disponiveis na compra.", "Erro.", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "A quantidade do produto deve ser superior a zero.", "Erro.", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Produto.", "Erro: Nenhum Produto selecionado.", JOptionPane.ERROR_MESSAGE);
        }
        
        qtdProduto.setValue(0);
        
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void btnRemoverProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdActionPerformed
        int linhaSelecionada = TabelaCompraProdutoConferidos.getSelectedRow();
        CompraProduto cp = new CompraProduto();
        CompraProduto produto = new CompraProduto();
        ListIterator listIt = this.listaConfirmado.listIterator();
        ListIterator listProdIt = this.listaCompraP.listIterator();
        int posicao = 0;
        int posicao2 = 0;

        if (linhaSelecionada >= 0) {                                            //verifica se algum produto foi selecionado
            if ((int) qtdRemover.getValue() > 0) {                              //verifica se a quantidade e positiva
                cp = this.modelConfirmado.get(linhaSelecionada);
                
                while (listProdIt.hasNext()) {                      //remove o produto da lista
                    posicao2++;
                    CompraProduto cprodIt = (CompraProduto) listProdIt.next();
                    if (cprodIt.getProduto().getId() == cp.getProduto().getId()) {
                        posicao2--;
                        break;
                    }
                }                
                
                produto = listaCompraP.get(posicao2);
                
                while (listIt.hasNext()) {                      //remove o produto da lista
                    posicao++;
                    CompraProduto cpIt = (CompraProduto) listIt.next();
                    if (cpIt.getProduto().getId() == cp.getProduto().getId()) {
                        posicao--;
                        listIt.remove();
                        break;
                    }
                }
                
                if ((int) qtdRemover.getValue() < cp.getQuantidade()) {     
                    
                    produto.setCusto(produto.getCusto() + (int) qtdRemover.getValue() * cp.getCusto()/cp.getQuantidade());
                    this.compraConfirmada.setTotal(this.compraConfirmada.getTotal() - (int) qtdRemover.getValue() * cp.getCusto()/cp.getQuantidade());
                    cp.setCusto(cp.getCusto() - (int) qtdRemover.getValue() * cp.getCusto()/cp.getQuantidade());
                    cp.setQuantidade(cp.getQuantidade() - (int) qtdRemover.getValue());
                    produto.setQuantidade(produto.getQuantidade() + (int)qtdRemover.getValue());
                    listaConfirmado.add(posicao, cp);
                }else {
                    produto.setCusto(produto.getCusto() + cp.getCusto());
                    this.compraConfirmada.setTotal(this.compraConfirmada.getTotal() - cp.getCusto());
                    
                    cp.setCusto(0);
                    produto.setQuantidade(produto.getQuantidade() + cp.getQuantidade());
                    cp.setQuantidade(0);
                }
                this.controleCp.alterarCP(produto);

                this.modelCompraP = new CompraProdutoTableModel(this.controleCp.listarCP(this.compra));
                TabelaCompraProduto.setModel(this.modelCompraP);
                
                this.modelConfirmado = new CompraProdutoTableModel(this.listaConfirmado);  //atualiza a tabela
                TabelaCompraProdutoConferidos.setModel(this.modelConfirmado);

                totalConfirmado.setText("" + this.compraConfirmada.getTotal());

            } else {
                JOptionPane.showMessageDialog(this, "A quantidade a ser removida deve ser superior a zero.", "Erro.", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Produto.", "Erro: Nenhum Produto selecionado.", JOptionPane.ERROR_MESSAGE);
        }
        qtdRemover.setValue(0);
    }//GEN-LAST:event_btnRemoverProdActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        ListIterator listIt = listaCompraP.listIterator();
        CompraProduto prod;
        
        while (listIt.hasNext()) {                              
            CompraProduto cpIt = (CompraProduto) listIt.next();
            prod = cpIt;
            
            ListIterator listProdIt = listaConfirmado.listIterator();
            while(listProdIt.hasNext()){

                CompraProduto cprodIt = (CompraProduto) listProdIt.next();
                if (cprodIt.getProduto().getId() == prod.getProduto().getId()) {
                    prod.setQuantidade(prod.getQuantidade()+cprodIt.getQuantidade());
                    prod.setCusto(prod.getCusto() + cprodIt.getCusto());
                    listProdIt.remove();
                    this.controleCp.alterarCP(prod);
                    break;
                }
            }
        }
        
        new Compras().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ConfirmarCompraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarCompraBActionPerformed

        if (this.compraConfirmada.getTotal() <= 0){
            JOptionPane.showMessageDialog(this, "Compra " + this.compra.getId() + " não possui valor. Por isso não será confirmado.", "Compra não confirmada.", JOptionPane.INFORMATION_MESSAGE);
            new Compras().setVisible(true);
            this.dispose();
        }else{
            
            Date d = new Date();
            Calendar cal = new GregorianCalendar();
            cal.setTime(d);
            Compra confirmada = new Compra();
            
            confirmada.setDataCompra(this.compra.getDataCompra());
            confirmada.setId(this.compra.getId());
            confirmada.setFlag("2");
            confirmada.setDataRecebimento(d);
            confirmada.setFornecedor(this.compra.getFornecedor());
            confirmada.setFornecedorNome(this.compra.getFornecedorNome());
            confirmada.setTotal(this.compraConfirmada.getTotal());
            
            this.controleCompra.alterarCompra(confirmada);
            
            int id = this.compra.getId();
            Date dataCompra = this.compra.getDataCompra();
            Date dataRecebimento = d;
            String nome = this.compra.getFornecedorNome();
            Fornecedor forn = this.compra.getFornecedor();
            Float total = this.compraConfirmada.getTotal();
            ListIterator listIt = listaCompraP.listIterator();
            this.controleCompra.confirmarCompra(id, nome, total, forn, dataCompra, dataRecebimento);
            CompraProduto prod;
            while (listIt.hasNext()) {                              
                CompraProduto cpIt = (CompraProduto) listIt.next();
                prod = cpIt;
            
                ListIterator listProdIt = listaConfirmado.listIterator();
                while(listProdIt.hasNext()){

                    CompraProduto cprodIt = (CompraProduto) listProdIt.next();
                    if (cprodIt.getProduto().getId() == prod.getProduto().getId()) {
                        prod.setQuantidade(cprodIt.getQuantidade());
                        prod.setCusto(cprodIt.getCusto());
                        listProdIt.remove();
                        Produto produto = new Produto();
                        produto = prod.getProduto();
                        produto.setQntAtual(produto.getQntAtual()+prod.getQuantidade());
                        this.controleProd.alterarProduto(produto);
                        this.controleCp.alterarCP(prod);
                        break;
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Compra: " + id + "\nFornecedor: "+nome+ "\nValor: " + total + "\n\nFoi efetuada.", "Compra confirmada.", JOptionPane.INFORMATION_MESSAGE);
            
            new JanelaEscolhePagamentoCompra(confirmada).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ConfirmarCompraBActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton ConfirmarCompraB;
    private javax.swing.JLabel LabelFornecedor;
    private javax.swing.JTable TabelaCompraProduto;
    private javax.swing.JTable TabelaCompraProdutoConferidos;
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnRemoverProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner qtdProduto;
    private javax.swing.JSpinner qtdRemover;
    private javax.swing.JLabel totalConfirmado;
    private javax.swing.JLabel totalPedido;
    // End of variables declaration//GEN-END:variables
}
