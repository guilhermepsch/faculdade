/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author guilh
 */
public class TarefaComPrazo extends Tarefa {

    private Date date;

    public TarefaComPrazo(int id, String nome, boolean status, Date data) {
        super(id, nome, status);
        this.date = data;
    }

    public Date getData() {
        return date;
    }

    public void setData(Date data) {
        this.date = data;
    }

    @Override
    public String toString() {
        return "TarefaComPrazo{" + "id=" + id + ", nome=" + nome + ", status=" + status + "data=" + date + '}';
    }

}
