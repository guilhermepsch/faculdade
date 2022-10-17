/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.PessoaController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Pessoa;

/**
 *
 * @author Zeke
 */
public class PessoaGrid extends BaseGrid {
    
    private TableColumn jtcIdade;
    private TableColumn jtcCpf;
    private TableColumn jtcCelular;
    private PessoaController controller = new PessoaController();
    
    public PessoaGrid(JFrame main) {
        super(main);
        this.setTitle("Consulta de Pessoas");
    }
    
    @Override
    public void setColumns() {
        super.setColumns();
        tableModel.addColumn("Idade");
        tableModel.addColumn("CPF");
        tableModel.addColumn("Celular");
        jtContent.setModel(tableModel);
    }
    
    @Override
    public void incluir() {
        PessoaForm tela = new PessoaForm(this);
        tela.setVisible(true);
        this.setEnabled(false);
    }
    
    @Override
    public void alterar(int id) {
        Pessoa p = (Pessoa) controller.get(id);
        PessoaForm tela = new PessoaForm(this, p);
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
        ArrayList<Pessoa> pessoas = (new PessoaController()).get();
        DefaultTableModel model = (DefaultTableModel) jtContent.getModel();
        for (Pessoa p : pessoas) {
            model.addRow(new Object[]{p.getId(), p.getNome(), p.getIdade(), p.getCpf(), p.getCelular()});
        }
    }
}
