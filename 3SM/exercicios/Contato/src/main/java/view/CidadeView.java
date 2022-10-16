/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Zeke
 */
public class CidadeView extends FormPadrao {

    JLabel jlUf;
    JLabel jlCep;

    JComboBox jcbUf;
    JTextField jtfCep;

    public CidadeView() {
        this.setTitle("Cadastro de Cidade");
    }

    @Override
    public void inicializarComponentes() {
        jlUf = new JLabel("UF");
        jlUf.setBounds(14, 65, 45, 25);
        jpnFormulario.add(jlUf);

        jcbUf = new JComboBox();
        jcbUf.setBounds(14, 85, 45, 25);
        jpnFormulario.add(jcbUf);

        jlCep = new JLabel("CEP");
        jlCep.setBounds(95, 65, 100, 25);
        jpnFormulario.add(jlCep);

        jtfCep = new JTextField();
        jtfCep.setBounds(95, 85, 150, 25);
        jpnFormulario.add(jtfCep);
    }

    @Override
    public void salvarView() {

    }

}
