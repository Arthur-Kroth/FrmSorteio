package visao;

import javax.swing.JOptionPane;
import model.Roleta;


public class FrmSorteio extends javax.swing.JFrame {
    Roleta roleta = new Roleta();
    
    public FrmSorteio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTFQuantidadeNumerosSorteados = new javax.swing.JTextField();
        JBNovo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JLNumerosorteado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JASaida = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        JBSortear = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JBFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio");

        jLabel1.setText("Quantidades de números a serem sorteados:");

        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista de números sorteados:");

        JLNumerosorteado.setBackground(new java.awt.Color(242, 242, 242));
        JLNumerosorteado.setFont(new java.awt.Font("Segoe UI", 1, 144)); // NOI18N
        JLNumerosorteado.setText("0");

        JASaida.setColumns(20);
        JASaida.setRows(5);
        jScrollPane1.setViewportView(JASaida);

        jLabel4.setText("Número sorteado:");

        JBSortear.setText("Sortear");
        JBSortear.setEnabled(false);
        JBSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSortearActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.setEnabled(false);
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(JLNumerosorteado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFQuantidadeNumerosSorteados, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBNovo))
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JBFechar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBSortear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBCancelar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFQuantidadeNumerosSorteados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLNumerosorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBSortear)
                        .addComponent(JBCancelar)))
                .addGap(18, 18, 18)
                .addComponent(JBFechar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        try {
            int quantidadeNumeroSorteados = Integer.parseInt(this.JTFQuantidadeNumerosSorteados.getText());
            if (roleta.iniciar(quantidadeNumeroSorteados)) {
                JASaida.setText("");
                JLNumerosorteado.setText("0");
                this.JBNovo.setEnabled(false);
                this.JBSortear.setEnabled(true);
                this.JBCancelar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Valor deve ser maior que 0!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido.");
        }
    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSortearActionPerformed
        if (roleta.temNumeros()) {
            int numero = roleta.sortear();
            int ordem = roleta.getOrdem();
            JASaida.append(ordem + "º sorteado: " + numero + "\n");
            JLNumerosorteado.setText(String.valueOf(numero));
        } else {
            JOptionPane.showMessageDialog(null, "Não há números a serem sorteados.\nInicie um novo sorteio.");
            this.JBNovo.setEnabled(true);
            this.JBSortear.setEnabled(false);
            this.JBCancelar.setEnabled(false);
        }
    }//GEN-LAST:event_JBSortearActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // Habilita o botão novo
        this.JBNovo.setEnabled(true);
        // Desabilita o botão sortear
        this.JBSortear.setEnabled(false);
        // Desabilita o botão cancelar
        this.JBCancelar.setEnabled(false);
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        // Encerra o programa
        System.exit(0);
    }//GEN-LAST:event_JBFecharActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSorteio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JASaida;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBSortear;
    private javax.swing.JLabel JLNumerosorteado;
    private javax.swing.JTextField JTFQuantidadeNumerosSorteados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
