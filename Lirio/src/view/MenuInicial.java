/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author lucas
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicial
     */
    public MenuInicial() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Pagamento = new javax.swing.JButton();
        Reserva = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Venda = new javax.swing.JButton();
        Compra = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        CadFornecedor = new javax.swing.JMenuItem();
        CadProduto = new javax.swing.JMenuItem();
        Relatorios = new javax.swing.JMenu();
        RelatorioVenda = new javax.swing.JMenuItem();
        RelatorioCompra = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jButton10.setText("COMPRA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("LOJA LÍRIO");

        Pagamento.setText("PAGAMENTO");
        Pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagamentoActionPerformed(evt);
            }
        });

        Reserva.setText("RESERVA");
        Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservaActionPerformed(evt);
            }
        });

        Cliente.setText("CLIENTE");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        Venda.setText("VENDA");
        Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendaActionPerformed(evt);
            }
        });

        Compra.setText("COMPRA");
        Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraActionPerformed(evt);
            }
        });

        Estoque.setText("ESTOQUE");
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });

        Cadastros.setText("Cadastros");

        CadCliente.setText("Cliente");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        Cadastros.add(CadCliente);

        CadFornecedor.setText("Fornecedor");
        CadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFornecedorActionPerformed(evt);
            }
        });
        Cadastros.add(CadFornecedor);

        CadProduto.setText("Produto");
        CadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutoActionPerformed(evt);
            }
        });
        Cadastros.add(CadProduto);

        jMenuBar1.add(Cadastros);

        Relatorios.setText("Relatório");

        RelatorioVenda.setText("Relatório Venda");
        RelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioVendaActionPerformed(evt);
            }
        });
        Relatorios.add(RelatorioVenda);

        RelatorioCompra.setText("Relatório Compra");
        RelatorioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioCompraActionPerformed(evt);
            }
        });
        Relatorios.add(RelatorioCompra);

        jMenuBar1.add(Relatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservaActionPerformed
        new ReservaDeProduto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReservaActionPerformed

    private void VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendaActionPerformed
        new Venda().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VendaActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        new Clientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClienteActionPerformed

    private void PagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagamentoActionPerformed
        new Pagamento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PagamentoActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        new Estoque().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EstoqueActionPerformed

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_CadClienteActionPerformed

    private void CadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFornecedorActionPerformed
        new CadastroFornecedor().setVisible(true);
    }//GEN-LAST:event_CadFornecedorActionPerformed

    private void CadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadProdutoActionPerformed
        new CadastroProduto().setVisible(true);
    }//GEN-LAST:event_CadProdutoActionPerformed

    private void RelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioVendaActionPerformed
        new RelatorioVenda().setVisible(true);
    }//GEN-LAST:event_RelatorioVendaActionPerformed

    private void RelatorioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioCompraActionPerformed
        new RelatorioCompra().setVisible(true);
    }//GEN-LAST:event_RelatorioCompraActionPerformed

    private void CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraActionPerformed
        new Compra().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CompraActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenuItem CadFornecedor;
    private javax.swing.JMenuItem CadProduto;
    private javax.swing.JMenu Cadastros;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Compra;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Pagamento;
    private javax.swing.JMenuItem RelatorioCompra;
    private javax.swing.JMenuItem RelatorioVenda;
    private javax.swing.JMenu Relatorios;
    private javax.swing.JButton Reserva;
    private javax.swing.JButton Venda;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
