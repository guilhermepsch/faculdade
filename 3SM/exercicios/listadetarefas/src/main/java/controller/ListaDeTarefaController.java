/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ListaDeTarefaRepositorio;
import dao.PessoaRepositorio;
import interfaces.InterfaceController;
import java.util.ArrayList;
import model.ListaDeTarefa;
import model.Pessoa;

/**
 *
 * @author Zeke
 */
public class ListaDeTarefaController implements InterfaceController {

    private ListaDeTarefaRepositorio listaTarefaRepo = new ListaDeTarefaRepositorio();

    @Override
    public void save(Object... args) throws Exception {
        if (args[0].equals("") || args[0] == null) {
            this.add(args);
        } else {
            args[0] = Integer.valueOf(String.valueOf(args[0]));
            this.update(args);
        }
    }

    @Override
    public void add(Object[] args) throws Exception {
        args[0] = 0;
        ListaDeTarefa ltarefa = validate(args);
        listaTarefaRepo.add(ltarefa);
    }

    @Override
    public void update(Object[] args) throws Exception {
        ListaDeTarefa ltarefa = validate(args);
        listaTarefaRepo.add(ltarefa);
    }

    @Override
    public void remove(int id) {
        listaTarefaRepo.remove(id);
    }

    @Override
    public ArrayList<ListaDeTarefa> get() {
        return listaTarefaRepo.get();
    }

    @Override
    public ArrayList<Object> get(String text, String param) {
        return listaTarefaRepo.get(text, param);
    }

    public ListaDeTarefa validate(Object[] args) throws Exception {
        int id = (int) args[0];
        String nome = (String) args[1];
        Pessoa pessoa = (Pessoa) (new PessoaRepositorio()).getByIndexNome((String) args[2]);

        if (id < 0) {
            throw new Exception("Id inválido");
        }
        if (nome.isBlank()) {
            throw new Exception("É necessário preencher o nome.");
        }
        return new ListaDeTarefa(id, nome, pessoa);
    }

    @Override
    public Object get(int id) {
        return listaTarefaRepo.get(id);
    }

}
