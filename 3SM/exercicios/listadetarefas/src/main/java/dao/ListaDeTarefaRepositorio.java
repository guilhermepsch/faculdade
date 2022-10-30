/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import model.ListaDeTarefa;
import model.Pessoa;

/**
 *
 * @author Zeke
 */
public class ListaDeTarefaRepositorio implements InterfaceDao {

    private static int currentId = 1;
    private static ArrayList<ListaDeTarefa> listadetarefas = new ArrayList<>();
    private static HashMap<Integer, ListaDeTarefa> hashinicial = new HashMap<>();

    @Override
    public void add(Object obj) {
        ListaDeTarefa ltafefa = (ListaDeTarefa) obj;
        if (ltafefa.getId() == 0) {
            ltafefa.setId(currentId);
            hashinicial.put(currentId, ltafefa);
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
            (new TarefaRepositorio()).remove(seraRemovido);
        }
    }

    public void remove(Pessoa p) {
        ArrayList<ListaDeTarefa> seraRemovido = new ArrayList();
        for (ListaDeTarefa ltarefa : listadetarefas) {
            if (ltarefa.getPessoa().getId() == p.getId()) {
                seraRemovido.add(ltarefa);
            }
        }
        if (seraRemovido.isEmpty()) {
            return;
        }
        for (ListaDeTarefa ltarefa : seraRemovido) {
            listadetarefas.remove(ltarefa);
            (new TarefaRepositorio()).remove(ltarefa);
        }
    }

    @Override
    public ArrayList<Object> get(String text, String param) {
        ArrayList<Object> newList = new ArrayList<>();
        if (text.isBlank()) {
            Object[] objectArray = listadetarefas.toArray();
            for (int i = 0; i < objectArray.length; i++) {
                newList.add(objectArray[i]);
            }
            return newList;
        }
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
                    if (ltarefa.getPessoa().getId() == Integer.parseInt(text)) {
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
        listadetarefas.sort(new Comparator<ListaDeTarefa>() {
            @Override
            public int compare(ListaDeTarefa tl1, ListaDeTarefa tl2) {
                return Integer.compare(tl1.getId(), tl2.getId());
            }
        });
        return listadetarefas;
    }

    @Override
    public Object get(int id
    ) {
        for (ListaDeTarefa ltarefa : listadetarefas) {
            if (ltarefa.getId() == id) {
                return ltarefa;
            }
        }
        return null;
    }

    public ListaDeTarefa getByIndexNome(String check) {
        for (ListaDeTarefa ltarefa : listadetarefas) {
            if (check.equals(ltarefa.getId() + " - " + ltarefa.getNome() + "(" + ltarefa.getPessoa().getId() + " - " + ltarefa.getPessoa().getNome() + ")")) {
                return ltarefa;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, ListaDeTarefa> getHashInicial() {
        return hashinicial;
    }
}
