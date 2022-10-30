/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import model.Pessoa;

/**
 *
 * @author Zeke
 */
public class PessoaRepositorio implements InterfaceDao {

    private static int currentId = 1;
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static HashMap<Integer, Pessoa> hashinicial = new HashMap<>();

    @Override
    public void add(Object obj) {
        Pessoa p = (Pessoa) obj;
        if (p.getId() == 0) {
            p.setId(currentId);
            hashinicial.put(currentId, p);
            currentId++;
            pessoas.add(p);
        } else {
            for (Pessoa pbd : pessoas) {
                if (pbd.getId() == p.getId()) {
                    pessoas.remove(pbd);
                    pessoas.add(p);
                }
            }
        }
    }

    @Override
    public void remove(int id) {
        Pessoa seraRemovido = null;
        for (Pessoa p : pessoas) {
            if (p.getId() == id) {
                seraRemovido = p;
            }
        }
        if (seraRemovido != null) {
            (new ListaDeTarefaRepositorio()).remove(seraRemovido);
            pessoas.remove(seraRemovido);
        }
    }

    @Override
    public ArrayList<Object> get(String text, String param) {
        ArrayList<Object> newList = new ArrayList<>();
        if (text.isBlank()) {
            Object[] objectArray = pessoas.toArray();
            for (int i = 0; i < objectArray.length; i++) {
                newList.add(objectArray[i]);
            }
            return newList;
        }
        for (Pessoa p : pessoas) {
            switch (param) {
                case "Nome" -> {
                    if (p.getNome().contains(text)) {
                        newList.add(p);
                    }
                }
                case "Idade" -> {
                    if (p.getIdade() == Integer.parseInt(text)) {
                        newList.add(p);
                    }
                }
                case "Cpf" -> {
                    if (p.getCpf().contains(text)) {
                        newList.add(p);
                    }
                }
                case "Celular" -> {
                    if (p.getCelular().contains(text)) {
                        newList.add(p);
                    }
                }
                default -> {
                    if (p.getId() == Integer.parseInt(text)) {
                        newList.add(p);
                    }
                    break;
                }
            }
        }
        return newList;
    }

    @Override
    public ArrayList<Pessoa> get() {
        Collections.sort(pessoas);
        return pessoas;
    }

    @Override
    public Object get(int id) {
        for (Pessoa p : pessoas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Pessoa getByIndexNome(String check) {
        for (Pessoa p : pessoas) {
            if (check.equals(p.getId() + " - " + p.getNome())) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Pessoa> getHashInicial() {
        return hashinicial;
    }

}
