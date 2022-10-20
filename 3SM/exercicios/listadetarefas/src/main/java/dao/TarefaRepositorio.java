/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.ListaDeTarefa;
import model.Tarefa;

/**
 *
 * @author Zeke
 */
public class TarefaRepositorio implements InterfaceDao {

    private static int currentId = 1;
    private static ArrayList<Tarefa> tarefas = new ArrayList<>();
    private static HashMap<Integer, Tarefa> hashinicial = new HashMap<>();

    @Override
    public void add(Object obj) {
        Tarefa t = (Tarefa) obj;
        if (t.getId() == 0) {
            t.setId(currentId);
            hashinicial.put(currentId, t);
            currentId++;
            tarefas.add(t);
        } else {
            for (Tarefa tbd : tarefas) {
                if (tbd.getId() == t.getId()) {
                    tarefas.remove(tbd);
                    tarefas.add(t);
                }
            }
        }
    }

    @Override
    public void remove(int id) {
        Tarefa seraRemovido = null;
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                seraRemovido = t;
            }
        }
        if (seraRemovido != null) {
            tarefas.remove(seraRemovido);
        }
    }

    public void remove(ListaDeTarefa ltarefa) {
        ArrayList<Tarefa> seraRemovido = new ArrayList();
        for (Tarefa t : tarefas) {
            if (t.getLista().getId() == ltarefa.getId()) {
                seraRemovido.add(t);
            }
        }
        if (seraRemovido.isEmpty()) {
            return;
        }
        for (Tarefa t : seraRemovido) {
            tarefas.remove(t);
        }
    }

    @Override
    public ArrayList<Object> get(String text, String param) {
        ArrayList<Object> newList = new ArrayList<Object>();
        for (Tarefa t : tarefas) {
            switch (param) {
                case "Nome" -> {
                    if (t.getNome().contains(text)) {
                        newList.add(t);
                    }
                }
                case "Status" -> {
                    if (text.equalsIgnoreCase("Completo") && t.getStatus() == true) {
                        newList.add(t);
                    } else if (text.equalsIgnoreCase("Incompleto") && t.getStatus() == false) {
                        newList.add(t);
                    }
                }
                case "Lista Id" -> {
                    if (t.getLista().getId() == Integer.parseInt(text)) {
                        newList.add(t);
                    }
                }
                case "Lista Nome" -> {
                    if (t.getLista().getNome().equalsIgnoreCase(text)) {
                        newList.add(t);
                    }
                }
                case "Pessoa Id" -> {
                    if (t.getLista().getPessoa().getId() == Integer.parseInt(text)) {
                        newList.add(t);
                    }
                }
                case "Pessoa Nome" -> {
                    if (t.getLista().getPessoa().getNome().equalsIgnoreCase(text)) {
                        newList.add(t);
                    }
                }
                default -> {
                    if (t.getId() == Integer.parseInt(text)) {
                        newList.add(t);
                    }
                }
            }
        }
        return newList;
    }

    @Override
    public ArrayList<Tarefa> get() {
        return tarefas;
    }

    @Override
    public Object get(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Tarefa> getHashInicial() {
        return hashinicial;
    }

}
