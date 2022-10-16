/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author guilh
 */
public interface InterfaceDao {
    
    public void salvarDao(Object model);
    public void excluirDao(int id);
    public void consultarDao(Object... valor) throws SQLException;
    public void carregarComboBox(JComboBox itens) throws SQLException;
    
}
