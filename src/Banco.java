import java.util.ArrayList;
import java.util.List;

public class Banco  {
	private String nome;
	
	List<Conta> contas = new ArrayList<>();	

	contas.forEach(System.out::println);

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}	
}