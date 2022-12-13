package questao1;

import java.util.ArrayList;

public class App {
  
  public static void main(String[] args) {
    Estudante e1 = new Estudante("Maria", "987.654.321-00", "Rua 2", "8765-4321", 2, "Ciência da Computação", 2019);
    Professor pr1 = new Professor("José", "111.222.333-44", "Rua 3", "1111-2222", 3, "Ciência da Computação", "Doutor");
    
   
    ArrayList<Pessoa> lista = new ArrayList<>();
    
    lista.add(e1);
    lista.add(pr1);

    for (Pessoa p : lista) {
      System.out.println(p);
    }
  }

}
