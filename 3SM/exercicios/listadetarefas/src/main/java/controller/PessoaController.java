/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PessoaRepositorio;
import exception.PessoaFormException;
import interfaces.InterfaceController;
import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author Zeke
 */
public class PessoaController implements InterfaceController {

    private PessoaRepositorio pessoaRepo = new PessoaRepositorio();

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
        Pessoa p = validate(args);
        pessoaRepo.add(p);
    }

    @Override
    public void update(Object[] args) throws Exception {
        Pessoa p = validate(args);
        pessoaRepo.add(p);
    }

    @Override
    public void remove(int id) {
        pessoaRepo.remove(id);
    }

    @Override
    public ArrayList<Pessoa> get() {
        return pessoaRepo.get();
    }

    @Override
    public ArrayList<Object> get(String text, String param) {
        return pessoaRepo.get(text, param);
    }

    public Pessoa validate(Object[] args) throws Exception {
        int id = (int) args[0];
        String nome = (String) args[1];
        int idade;
        String cpf = (String) args[3];
        String celular = (String) args[4];

        if (id < 0) {
            throw new PessoaFormException("Id inválido");
        }
        if (nome.isBlank()) {
            throw new PessoaFormException("É necessário preencher o nome.");
        }
        if (args[2].equals("")) {
            throw new PessoaFormException("É necessário preencher a idade");
        }
        idade = Integer.parseInt((String) args[2]);
        if (idade < 0) {
            throw new PessoaFormException("Idade inválida");
        }
        if (cpf.isBlank()) {
            throw new PessoaFormException("É necessário preencher o cpf.");
        }
        if (celular.isBlank()) {
            throw new PessoaFormException("É necessário preencher o celular.");
        }

        return new Pessoa(id, nome, idade, cpf, celular);
    }

    @Override
    public Object get(int id) {
        return pessoaRepo.get(id);
    }
}
