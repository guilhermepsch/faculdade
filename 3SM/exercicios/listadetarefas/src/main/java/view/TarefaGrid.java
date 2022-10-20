/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.TarefaController;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Tarefa;

/**
 *
 * @author Zeke
 */
public class TarefaGrid extends BaseGrid {

    private final TarefaController controller = new TarefaController();

    public TarefaGrid(JFrame main) {
        super(main);
        this.setTitle("Consulta de Tarefas");
    }

    @Override
    public void setColumns() {
        super.setColumns();
        tableModel.addColumn("Status");
        tableModel.addColumn("Lista Id");
        tableModel.addColumn("Lista Nome");
        tableModel.addColumn("Pessoa Id");
        tableModel.addColumn("Pessoa Nome");
        this.createTableSorting();
    }

    @Override
    public void createTableSorting() {
        jtContent.setModel(tableModel);
        jtContent.setRowSorter(new TableRowSorter(tableModel));
    }

    @Override
    public void incluir() {
        TarefaForm tela = new TarefaForm(this);
        tela.setVisible(true);
        this.setEnabled(false);
    }

    @Override
    public void alterar(int id) {
        Tarefa t = (Tarefa) controller.get(id);
        TarefaForm tela = new TarefaForm(this, t);
        tela.setVisible(true);
        this.setEnabled(false);
    }

    @Override
    public void excluir(int id) {
        controller.remove(id);
    }

    @Override
    public void updateTable() {
        super.clearTable();
        ArrayList<Tarefa> tarefas = (new TarefaController()).get();
        DefaultTableModel model = (DefaultTableModel) jtContent.getModel();
        for (Tarefa t : tarefas) {
            model.addRow(new Object[]{
                t.getId(), t.getNome(), t.getStatus(), t.getLista().getId(),
                t.getLista().getNome(), t.getLista().getPessoa().getId(),
                t.getLista().getPessoa().getNome()
            });
        }
    }

    @Override
    public void setComboBoxItems() {
        Tarefa.getHashAttributeIds().forEach(new Consumer<String>() {
            @Override
            public void accept(String att) {
                jcbSelectItemConsulta.addItem(att);
            }
        });
    }

    @Override
    public ArrayList<Object> handleConsulta() {
        return controller.get(jtfConsulta.getText(), String.valueOf(jcbSelectItemConsulta.getSelectedItem()));
    }

    @Override
    public void updateTable(ArrayList<Object> list) {
        super.clearTable();
        DefaultTableModel model = (DefaultTableModel) jtContent.getModel();
        for (Object o : list) {
            Tarefa t = (Tarefa) o;
            model.addRow(new Object[]{
                t.getId(), t.getNome(), t.getStatus(), t.getLista().getId(),
                t.getLista().getNome(), t.getLista().getPessoa().getId(),
                t.getLista().getPessoa().getNome()
            });
        }
    }

}
