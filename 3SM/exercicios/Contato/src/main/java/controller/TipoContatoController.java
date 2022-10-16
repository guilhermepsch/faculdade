/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.TipoContatoDao;
import interfaces.InterfaceController;
import model.TipoContatoModel;

/**
 *
 * @author guilh
 */
public class TipoContatoController implements InterfaceController {

    private TipoContatoModel tcm;
    private TipoContatoDao tcd;

    public TipoContatoController() {
        tcm = new TipoContatoModel();
        tcd = new TipoContatoDao();
    }

    @Override
    public void salvarController(Object... valor) {
        if ("".equals(valor[0])) {
            tcm.setId(0);
        } else {
            tcm.setId((int) valor[0]);
        }
        
        tcm.setDescricao((String) valor[1]);
        tcd.salvarDao(tcm);
    }

    @Override
    public void excluirController(int id) {

    }

    @Override
    public void carregarComboBox() {

    }

}
