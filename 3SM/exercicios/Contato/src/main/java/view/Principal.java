
package view;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDesktop = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiContatos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmCadastro = new javax.swing.JMenu();
        jmiCidade = new javax.swing.JMenuItem();
        jmiBairro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiTipoContato = new javax.swing.JMenuItem();
        jmAbout = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGECON - Agenda de Contatos");
        setResizable(false);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jmFile.setMnemonic('F');
        jmFile.setText("File");

        jmiContatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiContatos.setText("Contatos");
        jmiContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContatosActionPerformed(evt);
            }
        });
        jmFile.add(jmiContatos);
        jmFile.add(jSeparator1);

        jmCadastro.setMnemonic('C');
        jmCadastro.setText("Cadastros");

        jmiCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCidade.setText("Cidade");
        jmiCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCidadeActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCidade);

        jmiBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiBairro.setText("Bairro");
        jmiBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBairroActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiBairro);
        jmCadastro.add(jSeparator2);

        jmiTipoContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiTipoContato.setText("Tipo de Contato");
        jmiTipoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTipoContatoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiTipoContato);

        jmFile.add(jmCadastro);

        jmbBarraMenu.add(jmFile);

        jmAbout.setMnemonic('A');
        jmAbout.setText("About");
        jmAbout.setToolTipText("");
        jmbBarraMenu.add(jmAbout);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContatosActionPerformed
        ContatoView tela = new ContatoView();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiContatosActionPerformed

    private void jmiCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCidadeActionPerformed
        CidadeView tela = new CidadeView();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCidadeActionPerformed

    private void jmiTipoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTipoContatoActionPerformed
        TipoContatoView tela = new TipoContatoView();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiTipoContatoActionPerformed

    private void jmiBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBairroActionPerformed
        BairroView tela = new BairroView();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiBairroActionPerformed

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jmAbout;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiBairro;
    private javax.swing.JMenuItem jmiCidade;
    private javax.swing.JMenuItem jmiContatos;
    private javax.swing.JMenuItem jmiTipoContato;
    // End of variables declaration//GEN-END:variables
}
