/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.PessoaController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Pessoa;

/**
 *
 * @author Zeke
 */
public class PessoaForm extends BaseForm {

    private PessoaController controller = new PessoaController();
    private JLabel jlCpf;
    private JTextField jtfCpf;
    private JLabel jlCelular;
    private JTextField jtfCelular;
    private JLabel jlIdade;
    private JTextField jtfIdade;

    public PessoaForm(BaseGrid grid) {
        super(grid);
        this.setTitle("Cadastro de Pessoa");
    }

    public PessoaForm(BaseGrid grid, Pessoa p) {
        super(grid);
        this.setTitle("Cadastro de Pessoa");
        this.setCamposIniciais(p);
    }

    @Override
    public void initComponentsChild() {
        jlIdade = new JLabel("Idade");
        jlIdade.setBounds(14, 75, 50, 25);
        jtfIdade = new JTextField();
        jtfIdade.setBounds(14, 100, 50, 25);

        jlCpf = new JLabel("CPF");
        jlCpf.setBounds(75, 75, 243, 25);
        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 100, 243, 25);

        jlCelular = new JLabel("Celular");
        jlCelular.setBounds(329, 75, 243, 25);
        jtfCelular = new JTextField();
        jtfCelular.setBounds(329, 100, 243, 25);

        jpnFormulario.add(jlIdade);
        jpnFormulario.add(jtfIdade);
        jpnFormulario.add(jlCpf);
        jpnFormulario.add(jtfCpf);
        jpnFormulario.add(jlCelular);
        jpnFormulario.add(jtfCelular);
    }

    @Override
    public void salvar() {
        try {
            controller.save(jtfId.getText(), jtfNome.getText(), jtfIdade.getText(), jtfCpf.getText(), jtfCelular.getText());
            JOptionPane.showMessageDialog(this, "Operação realizada com sucesso");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void setCamposIniciais(Pessoa p) {
        jtfId.setText(String.valueOf(p.getId()));
        jtfNome.setText(String.valueOf(p.getNome()));
        jtfIdade.setText(String.valueOf(p.getIdade()));
        jtfCelular.setText(String.valueOf(p.getCelular()));
        jtfCpf.setText(String.valueOf(p.getCpf()));
    }

}
