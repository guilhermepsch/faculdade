/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ListaDeTarefaRepositorio;
import dao.TarefaRepositorio;
import interfaces.InterfaceController;
import java.util.ArrayList;
import model.ListaDeTarefa;
import model.Tarefa;

/**
 *
 * @author Zeke
 */
public class TarefaController implements InterfaceController {

    private TarefaRepositorio tarefaRepo = new TarefaRepositorio();

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
        Tarefa t = validate(args);
        tarefaRepo.add(t);
    }

    @Override
    public void update(Object[] args) throws Exception {
        Tarefa t = validate(args);
        tarefaRepo.add(t);
    }

    @Override
    public void remove(int id) {
        tarefaRepo.remove(id);
    }

    @Override
    public ArrayList<Tarefa> get() {
        return tarefaRepo.get();
    }

    @Override
    public ArrayList<Object> get(String text, String param) {
        return tarefaRepo.get(text, param);
    }

    public Tarefa validate(Object[] args) throws Exception {
        int id = (int) args[0];
        String nome = (String) args[1];
        boolean status = (((String) args[3]).equals("Completo"));
        if (((String) args[3]).equals("")) {
            throw new Exception("É necessário informar uma lista");
        }
        ListaDeTarefa ltarefa = (ListaDeTarefa) (new ListaDeTarefaRepositorio()).getByIndexNome((String) args[3]);

        if (id < 0) {
            throw new Exception("Id inválido");
        }
        if (nome.isBlank()) {
            throw new Exception("É necessário preencher o nome.");
        }

        return new Tarefa(id, nome, status, ltarefa);
    }

    @Override
    public Object get(int id) {
        return tarefaRepo.get(id);
    }

}
