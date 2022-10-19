/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.script.Bindings;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
abstract public class BaseGrid extends javax.swing.JFrame {

    abstract public void incluir();

    abstract public void alterar(int id);

    abstract public void excluir(int id);

    abstract public ArrayList<Object> handleConsulta();

    abstract public void updateTable();

    abstract public void updateTable(ArrayList<Object> list);

    abstract public void createTableSorting();

    abstract public void setComboBoxItems();

    DefaultTableModel tableModel;

    protected void setColumns() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Id");
        tableModel.addColumn("Nome");
        jtContent.setCellSelectionEnabled(false);
        jtContent.setRowSelectionAllowed(true);
        jtContent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * Creates new form BaseGrid
     *
     * @param main
     */
    public BaseGrid(JFrame main) {
        initComponents();
        setColumns();
        enableMainFrameOnClose(main);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setComboBoxItems();
        updateTable();
    }

    private void enableMainFrameOnClose(JFrame main) {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                main.setEnabled(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtConteudo1 = new javax.swing.JTable();
        jpMain = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        jlConsulta = new javax.swing.JLabel();
        jtfConsulta = new javax.swing.JTextField();
        jcbSelectItemConsulta = new javax.swing.JComboBox<>();
        jbConsultar = new javax.swing.JButton();
        jpActions = new javax.swing.JPanel();
        jbIncluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jpContent = new javax.swing.JPanel();
        jspContent = new javax.swing.JScrollPane();
        jtContent = new javax.swing.JTable();

        jtConteudo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ));
        jtConteudo1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtConteudo1);
        if (jtConteudo1.getColumnModel().getColumnCount() > 0) {
            jtConteudo1.getColumnModel().getColumn(0).setResizable(false);
            jtConteudo1.getColumnModel().getColumn(1).setResizable(false);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jlConsulta.setText("Consulta");

        jbConsultar.setText("Pesquisar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbSelectItemConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHeaderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlConsulta)
                    .addComponent(jtfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSelectItemConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpActionsLayout = new javax.swing.GroupLayout(jpActions);
        jpActions.setLayout(jpActionsLayout);
        jpActionsLayout.setHorizontalGroup(
            jpActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExcluir)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jpActionsLayout.setVerticalGroup(
            jpActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbIncluir)
                    .addComponent(jbExcluir))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jtContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtContent.setCellSelectionEnabled(true);
        jtContent.getTableHeader().setReorderingAllowed(false);
        jspContent.setViewportView(jtContent);

        javax.swing.GroupLayout jpContentLayout = new javax.swing.GroupLayout(jpContent);
        jpContent.setLayout(jpContentLayout);
        jpContentLayout.setHorizontalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspContent)
        );
        jpContentLayout.setVerticalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspContent, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addComponent(jpHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (jtContent.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "É necessário selecionar um registro para realizar esta operação.");
            return;
        }
        int id = Integer.parseInt(String.valueOf(jtContent.getValueAt(jtContent.getSelectedRow(), 0)));
        this.excluir(id);
        JOptionPane.showMessageDialog(this, "Operação realizada com sucesso");
        this.updateTable();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed
        incluir();
    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        if (jtContent.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "É necessário selecionar um registro para realizar esta operação.");
            return;
        }
        int id = Integer.parseInt(String.valueOf(jtContent.getValueAt(jtContent.getSelectedRow(), 0)));
        this.alterar(id);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        if (jtfConsulta.equals("")){
            this.updateTable();
            return;
        }
        updateTable(handleConsulta());
    }//GEN-LAST:event_jbConsultarActionPerformed

    public void clearTable() {
        DefaultTableModel dm = (DefaultTableModel) jtContent.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConsultar;
    protected javax.swing.JButton jbExcluir;
    protected javax.swing.JButton jbIncluir;
    protected javax.swing.JComboBox<String> jcbSelectItemConsulta;
    private javax.swing.JLabel jlConsulta;
    private javax.swing.JPanel jpActions;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMain;
    private javax.swing.JScrollPane jspContent;
    protected javax.swing.JTable jtContent;
    private javax.swing.JTable jtConteudo1;
    protected javax.swing.JTextField jtfConsulta;
    // End of variables declaration//GEN-END:variables

}
