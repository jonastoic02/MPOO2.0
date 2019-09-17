package Extend;

public class Caixa extends Usuario {
	
	
	public Caixa(String nome, String cpf, Endereco endereco) {
		super(nome, cpf, endereco);
		// TODO Auto-generated constructor stub
	}

	public void realizarVenda(){
		System.out.println("Vender");
	}

	@Override
	public void calcularSalario() {
		this.setSalario(Informacao.getSalarioMinimo());	
		
	}
	

}