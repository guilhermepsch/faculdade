/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Zeke
 */
public interface InterfaceDao {
        
    public void add(Object obj);
    public void remove(int id);
    public ArrayList<?> get();
    public ArrayList<Object> get(String text, String param);
    public Object get(int id);
    public Map<Integer, ?> getHashInicial();
}
