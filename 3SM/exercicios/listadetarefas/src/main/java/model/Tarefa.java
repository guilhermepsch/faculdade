/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author guilh
 */
public class Tarefa {
    
    protected int id;
    protected String nome;
    protected boolean status;
    protected ListaDeTarefa lista;

    public Tarefa(int id, String nome, boolean status) {
        this.id = id;
        this.nome = nome;
        this.status = status;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ListaDeTarefa getLista() {
        return lista;
    }

    public void setLista(ListaDeTarefa lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", nome=" + nome + ", status=" + status + '}';
    }
    
    
}
