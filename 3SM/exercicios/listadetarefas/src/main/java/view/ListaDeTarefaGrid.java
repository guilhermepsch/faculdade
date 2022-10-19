/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ListaDeTarefaController;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.ListaDeTarefa;

/**
 *
 * @author Zeke
 */
public class ListaDeTarefaGrid extends BaseGrid {

    private final ListaDeTarefaController controller = new ListaDeTarefaController();

    public ListaDeTarefaGrid(JFrame main) {
        super(main);
        this.setTitle("Consulta de Lista de Tarefas");
    }

    @Override
    public void setColumns() {
        super.setColumns();
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
        ListaDeTarefaForm tela = new ListaDeTarefaForm(this);
        tela.setVisible(true);
        this.setEnabled(false);
    }

    @Override
    public void alterar(int id) {
        ListaDeTarefa ltarefa = (ListaDeTarefa) controller.get(id);
        ListaDeTarefaForm tela = new ListaDeTarefaForm(this, ltarefa);
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
        ArrayList<ListaDeTarefa> listas = (new ListaDeTarefaController()).get();
        DefaultTableModel model = (DefaultTableModel) jtContent.getModel();
        for (ListaDeTarefa ltarefa : listas) {
            model.addRow(new Object[]{ltarefa.getId(), ltarefa.getNome(), ltarefa.getPessoa().getId(), ltarefa.getPessoa().getNome()});
        }
    }

    @Override
    public void setComboBoxItems() {
        ListaDeTarefa.getHashAttributeIds().forEach(new Consumer<String>() {
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
            ListaDeTarefa ltarefa = (ListaDeTarefa) o;
            model.addRow(new Object[]{ltarefa.getId(), ltarefa.getNome(), ltarefa.getPessoa().getId(), ltarefa.getPessoa().getNome()});
        }
    }    
}
