package questao3.dao;

import java.util.ArrayList;
import questao3.model.Funcionario;

public class Dao {
  
  private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();


  public static boolean add(Funcionario funcionario) {
    return funcionarios.add(funcionario);
  }

  public static ArrayList<Funcionario> getFuncionarios() {
    return funcionarios;
  }

  public static Funcionario getFuncionario(String matricula) {
    for (Funcionario funcionario : funcionarios) {
      if (funcionario.getMatricula().equals(matricula)) {
        return funcionario;
      }
    }
    return null;
  }
}
