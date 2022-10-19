/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author guilh
 */
public class Pessoa implements Comparable<Pessoa>{

    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String celular;
    private List<ListaDeTarefa> listas;

    public Pessoa(int id, String nome, int idade, String cpf, String celular) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.celular = celular;
        this.listas = new ArrayList<>();
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<ListaDeTarefa> getListas() {
        return listas;
    }

    public void addLista(ListaDeTarefa lista){
        this.listas.add(lista);
    }
    
    @Override
    public int compareTo(Pessoa p) {
            return p.getNome().compareTo(this.getNome());
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", celular=" + celular + ", listas=" + listas + '}';
    }
    
    public static Set<String> getHashAttributeIds(){
        Set<String> atts = new HashSet<String>();
        atts.add("Id");
        atts.add("Nome");
        atts.add("Idade");
        atts.add("Cpf");
        atts.add("Celular");
        return atts;
    } 
}
