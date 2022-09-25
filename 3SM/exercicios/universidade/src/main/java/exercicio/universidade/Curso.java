package exercicio.universidade;

public class Curso {

  private String codigo;
  private String nome;
  private String dataCriacao;
  private String descricao;

  public Curso(String codigo, String nome, String dataCriacao, String descricao) {
    this.codigo = codigo;
    this.nome = nome;
    this.dataCriacao = dataCriacao;
    this.descricao = descricao;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public String getNome() {
    return this.nome;
  }

  public String getDataCriacao() {
    return this.dataCriacao;
  }

  public String getDescricao() {
    return this.descricao;
  }
}
