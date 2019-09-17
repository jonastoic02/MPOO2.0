package Heranca;

public class B extends A {
	private int c;
	
	
	//Se ouver um defaul, n�o h� obrigatoriedade do super, se n�o ouver default e existir um n�o default, deve-se haver o uso do super
	//Erro de sem�nica: Havendo construtores na superclasse, a subclasse deve prever todos os construtores definidos da superClasse
	//Sintaxe: apesar de existir v�rios n�o defaul se precisar definir pelo menos 1;
	public B(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}

	public B(int a,int c) {
		super(a);
		this.c = c;
	}

	public int getC() {
		return c;
	}
	
	//Uso de sobrescrita, n�o permite diminuir a visibilidade - private
	//Quem sobrescreve metodos abstratos � classe concreta
	//		Se deixar - B n�o � obrigado a implementar
	//		Se n�o deixar, B � obrigado a implementar
	public void metodoA(){
		System.out.println("Met�do B");
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	
	
}