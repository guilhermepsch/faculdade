/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.TipoContatoController;

/**
 *
 * @author Zeke
 */
public class ContatoView extends FormPadrao {

    TipoContatoController tcc;

    public ContatoView() {
        tcc = new TipoContatoController();
        this.setTitle("Cadastro de Contatos");
    }

    @Override
    public void inicializarComponentes() {

    }

    @Override
    public void salvarView() {
        tcc.salvarController(jtfId.getText(), jtfDescricao.getText());
    }

}
