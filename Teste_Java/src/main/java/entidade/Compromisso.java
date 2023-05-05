
package entidade;

public class Compromisso {
    
  private String nome;
  private String data;
  private String Hora;
  private String local;
  private String descricao;

  public Compromisso(String nome,String data, String Hora, String local, String descricao) {
    this.nome = nome;
    this.data = data;
    this.Hora = Hora;
    this.local = local;
    this.descricao = descricao;
  }

  public String getNome() {
    return nome;
  }
  
  public String getData() {
    return data;
  }

  public String getHora() {
    return Hora;
  }

  public String getLocal() {
    return local;
  }

  public String getDescricao() {
    return descricao;
  }

  public String toString() {

    return "Nome: " + nome + "\nData: " + data + "\nHora" + Hora + "\nLocal: " + local + "\nDescrição: " + descricao + "\n";
  }
   
}
