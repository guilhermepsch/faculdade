/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author guilh
 */
public class Tarefa {

    protected int id;
    protected String nome;
    protected boolean status;
    protected ListaDeTarefa lista;

    public Tarefa(int id, String nome, boolean status, ListaDeTarefa lista) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.lista = lista;
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

    public boolean getStatus() {
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

    public static Set<String> getHashAttributeIds() {
        Set<String> atts = new HashSet<>();
        atts.add("Id");
        atts.add("Nome");
        atts.add("Status");
        atts.add("Lista Id");
        atts.add("Lista Nome");
        atts.add("Pessoa Id");
        atts.add("Pessoa Nome");
        return atts;
    }
}
