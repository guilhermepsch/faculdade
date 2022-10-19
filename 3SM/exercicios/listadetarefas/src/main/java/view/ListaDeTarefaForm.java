/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ListaDeTarefaController;
import controller.PessoaController;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.ListaDeTarefa;
import model.Pessoa;

/**
 *
 * @author Zeke
 */
public class ListaDeTarefaForm extends BaseForm {

    private final ListaDeTarefaController controller = new ListaDeTarefaController();
    private JLabel jlPessoas;
    private JComboBox jcbPessoas;

    public ListaDeTarefaForm(BaseGrid grid) {
        super(grid);
        this.setTitle("Cadastro de Pessoa");
        this.loadComboBox();
    }

    public ListaDeTarefaForm(BaseGrid grid, ListaDeTarefa ltarefa) {
        super(grid);
        this.setTitle("Cadastro de Pessoa");
        this.loadComboBox();
        this.setCamposIniciais(ltarefa);
    }

    @Override
    public void initComponentsChild() {
        jlPessoas = new JLabel("Pessoa");
        jlPessoas.setBounds(14, 75, 243, 25);
        jcbPessoas = new JComboBox();
        jcbPessoas.setBounds(14, 100, 568, 25);

        jpnFormulario.add(jlPessoas);
        jpnFormulario.add(jcbPessoas);
    }

    @Override
    public void salvar() {
        try {
            controller.save(jtfId.getText(), jtfNome.getText(), jcbPessoas.getSelectedItem());
            JOptionPane.showMessageDialog(this, "Operação realizada com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void setCamposIniciais(ListaDeTarefa ltarefa) {
        jtfId.setText(String.valueOf(ltarefa.getId()));
        jtfNome.setText(String.valueOf(ltarefa.getNome()));
        jcbPessoas.setSelectedItem((String) (ltarefa.getPessoa().getId() + " - " + ltarefa.getPessoa().getNome()));
    }

    private void loadComboBox() {
        (new PessoaController()).get().forEach((Pessoa p) -> {
            jcbPessoas.addItem((String) (p.getId() + " - " + p.getNome()));
        });
    }

}
