/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ListaDeTarefaController;
import controller.TarefaController;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.ListaDeTarefa;
import model.Tarefa;

/**
 *
 * @author Zeke
 */
public class TarefaForm extends BaseForm {

    private final TarefaController controller = new TarefaController();
    private JLabel jlListas;
    private JComboBox jcbListas;
    private JLabel jlStatus;
    private JComboBox jcbStatus;

    public TarefaForm(BaseGrid grid) {
        super(grid);
        this.setTitle("Cadastro de Tarefas");
        this.loadComboBox();
    }

    public TarefaForm(BaseGrid grid, Tarefa t) {
        super(grid);
        this.setTitle("Cadastro de Tarefas");
        this.loadComboBox();
        this.setCamposIniciais(t);
    }

    @Override
    public void initComponentsChild() {
        jlListas = new JLabel("Lista de Tarefa");
        jlListas.setBounds(177, 75, 400, 25);
        jcbListas = new JComboBox();
        jcbListas.setBounds(177, 100, 400, 25);

        jlStatus = new JLabel("Status");
        jlStatus.setBounds(14, 75, 152, 25);
        jcbStatus = new JComboBox();
        jcbStatus.setBounds(14, 100, 152, 25);
        jcbStatus.addItem("Completo");
        jcbStatus.addItem("Incompleto");

        jpnFormulario.add(jlListas);
        jpnFormulario.add(jcbListas);
        jpnFormulario.add(jcbStatus);
        jpnFormulario.add(jlStatus);
    }

    @Override
    public void salvar() {
        try {
            controller.save(jtfId.getText(), jtfNome.getText(), jcbStatus.getSelectedItem(), jcbListas.getSelectedItem());
            JOptionPane.showMessageDialog(this, "Operação realizada com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void setCamposIniciais(Tarefa t) {
        jtfId.setText(String.valueOf(t.getId()));
        jtfNome.setText(String.valueOf(t.getNome()));
        jcbListas.setSelectedItem((String) (t.getLista().getId() + " - " + t.getLista().getNome() + "(" + t.getLista().getPessoa().getId() + " - " + t.getLista().getPessoa().getNome() + ")"));
        jcbStatus.setSelectedItem(t.getStatus() == true ? "Completo" : "Incompleto");
    }

    private void loadComboBox() {
        (new ListaDeTarefaController()).get().forEach((ListaDeTarefa ltarefa) -> {
            jcbListas.addItem(ltarefa.getId() + " - " + ltarefa.getNome() + "(" + ltarefa.getPessoa().getId() + " - " + ltarefa.getPessoa().getNome() + ")");
        });
    }

}
