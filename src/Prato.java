
public class Prato {
	
	private String nome;
	private double preco;
	private String descricao;
	
	
	public Prato(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Prato [nome=" + nome + ", preco=" + preco + ", descricao=" + descricao + "]";
	}
	
	
	
	
	

}
