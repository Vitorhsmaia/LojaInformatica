package views;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Computador;
import sqlcomputadorDAO.ComputadorDAO;

public class JanelaDeConsulta extends javax.swing.JFrame {

    public JanelaDeConsulta() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarPorProcessador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar / Inserir Computador"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtro:");

        txtBuscarPorProcessador.setToolTipText("");
        txtBuscarPorProcessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPorProcessadorActionPerformed(evt);
            }
        });

        btnBuscar.setText("buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(64, 31));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "HD (GB)", "Processador"
            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        btnAdicionar.setBackground(new java.awt.Color(51, 255, 51));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(153, 153, 153));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarPorProcessador)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarPorProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
  
        if (txtBuscarPorProcessador.getText().trim().equals("")) {
            recarregarTabela();

        } else {
            String processador = txtBuscarPorProcessador.getText();

            //Chamar um método na DAO que busque por processador
            ArrayList<Computador> listaRetorno = ComputadorDAO.buscarPorProcessador(processador);

            DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
            modelo.setRowCount(0);

            for (Computador item : listaRetorno) {
                //Atualizar a tabela
                modelo.addRow(new String[]{
                    //Pegar dados do objeto e passar a tabela
                    String.valueOf(item.getIdComputador()),
                    String.valueOf(Computador.getMarca()),
                    String.valueOf(item.getHd()),
                    String.valueOf(item.getProcessador())

                });
            }

        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    public void recarregarTabela() {

        ArrayList<Computador> lista = ComputadorDAO.listar();

        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
        modelo.setRowCount(0);

        // Tabela do java
        for (Computador item : lista) {
            modelo.addRow(new String[]{
                String.valueOf(item.getIdComputador()),
                String.valueOf(item.getMarca()),
                String.valueOf(item.getHd()),
                String.valueOf(item.getProcessador())});
        }

    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        CadastrarComputador novaCadastrarComputador = new CadastrarComputador();
        novaCadastrarComputador.setVisible(true);

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        //1º Passo:  Resgatar a linha e mandar para um objeto
        int linhaSelecionada = tblProdutos.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para atualizar!", "Nenhuma Linha Selecionada", JOptionPane.WARNING_MESSAGE);
            return; // Sai do método se nenhuma linha foi selecionada
        }

        //2º Passo: acessar a camada Model da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();

        //3º resgatar valores da linha selecionada
        int idSelecionado = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());
        int hdSelecionado = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 2).toString());
        String processadorSelecionado = modelo.getValueAt(linhaSelecionada, 3).toString();

        //4º Passar dados para o objeto
        Computador alterarObj = new Computador(idSelecionado, hdSelecionado, processadorSelecionado);

        //5° Passar dados para a tela de alteracao
        CadastrarComputador novaTela = new CadastrarComputador(alterarObj);
        novaTela.setVisible(true);
        novaTela.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        //1: Resgatar a linha e mandar para um objeto
        int linhaSelecionada = tblProdutos.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha para excluir!", "Nenhuma Linha Selecionada", JOptionPane.WARNING_MESSAGE);
            return; // Sai do método se nenhuma linha foi selecionada
        }

        //2: Acessar a camada Model da tabela
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();

        //3: Resgatar valores da linha selecionada
        int idSelecionado = Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString());

        //4: Mandar o ID para a DAO excluior
        boolean retorno = ComputadorDAO.excluir(idSelecionado);

        if (retorno == true) {
            JOptionPane.showMessageDialog(null, "Computador Excluido");
        } else {
            JOptionPane.showMessageDialog(null, "Nao foi possivel excluir esse computador");
        }

        atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtBuscarPorProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPorProcessadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPorProcessadorActionPerformed

    public void atualizarTabela() {

        //Chamar a DAO para consultar notas do banco
        ArrayList<Computador> listaRetorno = ComputadorDAO.listar();

        //Para cada item na lista, vou adicionar à tabela
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
        modelo.setRowCount(0);

        for (Computador item : listaRetorno) {
            modelo.addRow(new String[]{
                String.valueOf(item.getIdComputador()),
                String.valueOf(item.getMarca()),
                String.valueOf(item.getHd()),
                String.valueOf(item.getProcessador())});

        }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaDeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaDeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaDeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaDeConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaDeConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtBuscarPorProcessador;
    // End of variables declaration//GEN-END:variables
}
