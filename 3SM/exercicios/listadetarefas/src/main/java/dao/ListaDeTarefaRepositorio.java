/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.util.ArrayList;
import model.ListaDeTarefa;

/**
 *
 * @author Zeke
 */
public class ListaDeTarefaRepositorio implements InterfaceDao {

private static int currentId = 1;
    private static ArrayList<ListaDeTarefa> listadetarefas = new ArrayList<>();

    @Override
    public void add(Object obj) {
        ListaDeTarefa ltafefa = (ListaDeTarefa) obj;
        if (ltafefa.getId() == 0) {
            ltafefa.setId(currentId);
            currentId++;
            listadetarefas.add(ltafefa);
        } else {
            for (ListaDeTarefa ltarefabd : listadetarefas) {
                if (ltarefabd.getId() == ltafefa.getId()) {
                    listadetarefas.remove(ltarefabd);
                    listadetarefas.add(ltafefa);
                }
            }
        }
    }

    @Override
    public void remove(int id) {
        ListaDeTarefa seraRemovido = null;
        for (ListaDeTarefa ltarefa : listadetarefas) {
            if (ltarefa.getId() == id) {
                seraRemovido = ltarefa;
            }
        }
        if (seraRemovido != null) {
            listadetarefas.remove(seraRemovido);
        }
    }

    @Override
    public ArrayList<Object> get(String text, String param) {
        ArrayList<Object> newList = new ArrayList<Object>();
        for (ListaDeTarefa ltarefa : listadetarefas) {
            switch (param) {
                case "Nome":
                    if (ltarefa.getNome().contains(text)) {
                        newList.add(ltarefa);
                    }
                    break;
                case "Pessoa Nome":
                    if (ltarefa.getPessoa().getNome().contains(text)) {
                        newList.add(ltarefa);
                    }
                    break;
                case "Pessoa Id":
                    if (ltarefa.getPessoa().getId() == Integer.parseInt(text)){
                        newList.add(ltarefa);
                    }
                default:
                    if (ltarefa.getId() == Integer.parseInt(text)) {
                        newList.add(ltarefa);
                    }
                    break;
            }
        }
        return newList;
    }

    @Override
    public ArrayList<ListaDeTarefa> get() {
        return listadetarefas;
    }

    @Override
    public Object get(int id) {
        for (ListaDeTarefa ltarefa : listadetarefas) {
            if (ltarefa.getId() == id) {
                return ltarefa;
            }
        }
        return null;
    }
    
}
