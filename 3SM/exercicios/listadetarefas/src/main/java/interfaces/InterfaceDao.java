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
public interface InterfaceDao {
        
    public void add(Object obj);
    public void remove(int id);
    public ArrayList<?> get();
    public Object get(int id);
}
