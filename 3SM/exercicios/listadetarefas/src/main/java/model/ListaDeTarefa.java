/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author guilh
 */
public class ListaDeTarefa {

    private int id;
    private String nome;
    private Pessoa pessoa;

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

    @Override
    public String toString() {
        return "ListaDeTarefa{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    public static Set<String> getHashAttributeIds(){
        Set<String> atts = new HashSet<>();
        atts.add("Id");
        atts.add("Nome");
        atts.add("Pessoa Id");
        atts.add("Pessoa Nome");
        return atts;
    } 
}
