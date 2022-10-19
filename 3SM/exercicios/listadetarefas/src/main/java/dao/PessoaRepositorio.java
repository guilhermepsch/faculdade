/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Pessoa;

/**
 *
 * @author Zeke
 */
public class PessoaRepositorio implements InterfaceDao {

    private static int currentId = 1;
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void add(Object obj) {
        Pessoa p = (Pessoa) obj;
        if (p.getId() == 0) {
            p.setId(currentId);
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
            pessoas.remove(seraRemovido);
        }
    }

    @Override
    public ArrayList<Object> get(String text, String param) {
        ArrayList<Object> newList = new ArrayList<Object>();
        for (Pessoa p : pessoas) {
            switch (param) {
                case "Nome":
                    if (p.getNome().contains(text)) {
                        newList.add(p);
                    }
                    break;
                case "Idade":
                    if (p.getIdade() == Integer.valueOf(text)) {
                        newList.add(p);
                    }
                    break;
                case "Cpf":
                    if (p.getCpf().contains(text)) {
                        newList.add(p);
                    }
                    break;
                case "Celular":
                    if (p.getCelular().contains(text)) {
                        newList.add(p);
                    }
                    break;
                default:
                    if (p.getId() == Integer.valueOf(text)) {
                        newList.add(p);
                    }
                    break;
            }
        }
        return newList;
    }

    @Override
    public ArrayList<Pessoa> get() {
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

}
