/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Zeke
 */
public class BairroView extends FormPadrao {

    JLabel jlBairro;
    JComboBox jcbBairro;

    public BairroView() {
        this.setTitle("Cadastro de Bairros");
        this.inicializarComponentes();
    }

    @Override
    public void inicializarComponentes() {
        jlBairro = new JLabel("Cidade");
        jlBairro.setBounds(14, 65, 50, 25);
        jpnFormulario.add(jlBairro);

        jcbBairro = new JComboBox();
        jcbBairro.setBounds(14, 85, 250, 25);
        jpnFormulario.add(jcbBairro);
    }

    @Override
    public void salvarView() {

    }

}
