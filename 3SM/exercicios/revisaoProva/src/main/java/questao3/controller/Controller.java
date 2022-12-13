package questao3.controller;

import java.util.ArrayList;

import questao3.dao.Dao;
import questao3.exception.CampoVazioException;
import questao3.model.Funcionario;

public class Controller {
  
  public boolean add (String nome, String cargo, String dataDeAdmissao) {
    try {
      if (nome.isEmpty() || cargo.isEmpty() || dataDeAdmissao.isEmpty()) {
        throw new CampoVazioException("Todos os campos devem ser preenchidos");
      }
      return Dao.add(new Funcionario(nome, cargo, dataDeAdmissao));
    } catch (CampoVazioException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  public ArrayList<Funcionario> getFuncionarios() {
    return Dao.getFuncionarios();
  }
}
