/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author guilh
 */
class ListaDeTarefa {

    private int id;
    private String nome;
    private Pessoa pessoa;
    private List<Tarefa> tarefas;
    private boolean status;

    public ListaDeTarefa(int id, String nome, Pessoa pessoa) {
        this.id = id;
        this.nome = nome;
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void addTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    @Override
    public String toString() {
        return "ListaDeTarefa{" + "id=" + id + ", nome=" + nome + ", tarefas=" + tarefas + '}';
    }
}
