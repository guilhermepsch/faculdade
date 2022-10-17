/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Zeke
 */
public interface InterfaceController {

    public void add(Object[] args) throws Exception;
    
    public void update(Object[] args) throws Exception;
    
    public void save(Object... args) throws Exception;

    public void remove(int id);

    public ArrayList<?> get();

    public Object get(int id);

}
