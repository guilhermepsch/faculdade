/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import model.TipoContatoModel;

/**
 *
 * @author guilh
 */
public class TipoContatoDao implements InterfaceDao {
    
    private static int currentId = 0;
    private static ArrayList<TipoContatoModel> bd = new ArrayList<>();
    
    @Override
    public void salvarDao(Object model) {
        TipoContatoModel tcm = (TipoContatoModel) model;
        if (tcm.getId() == 0){
            currentId++;
            tcm.setId(currentId);
            bd.add(tcm);
        } else {
            bd.remove(tcm.getId());
            bd.set(tcm.getId(), tcm);
        }
    }

    @Override
    public void excluirDao(int id) {
        
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {
        
    }

    @Override
    public void carregarComboBox(JComboBox itens) throws SQLException {
    
    }

}
