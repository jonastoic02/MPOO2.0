package login;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Usuario> uTESTE = new ArrayList<Usuario>();
		
		Usuario usuarioTeste = new Usuario("eu", "Eu");
		BaseDados.adicionarUsuario(usuarioTeste);
		uTESTE.add(usuarioTeste);
		
		usuarioTeste.setLogin("maria");
		usuarioTeste.setSenha("mariaAIluminada");
		BaseDados.adicionarUsuario(usuarioTeste);
		uTESTE.add(usuarioTeste);
		
		usuarioTeste.setLogin("ze");
		usuarioTeste.setSenha("1234");
		BaseDados.adicionarUsuario(usuarioTeste);
		uTESTE.add(usuarioTeste);
		
		//BaseDados.adicionarUsuario(new Usuario("eu", "Eu"));
		
		// Assumindo dado da tela
		Usuario usuario = new Usuario("eu", "eu");
//		
//		System.out.println(BaseDados.getUsuarios().toString());
//		
//		System.out.println(BaseDados.getUsuarios().size());
//		System.out.println(uTESTE.size());
//		
//		System.out.println(BaseDados.buscarUsuario(usuarioTeste).toString());
//		System.out.println(BaseDados.buscarUsuario(usuarioTeste).toString());
//		System.out.println(BaseDados.buscarUsuario(usuarioTeste).get(0));
//		System.out.println(BaseDados.buscarUsuario(usuarioTeste).get(1));
//		
//		for (String dados : BaseDados.buscarUsuario(usuarioTeste)) {
//			System.out.println(dados);	
//		}
		
		System.out.println(BaseDados.getUsuarios().toString());
		BaseDados.removerUsuario("ze");
		System.out.println(BaseDados.getUsuarios().toString());
		BaseDados.removerUsuario("Mathias");
		
//		System.out.println(BaseDados.getUsuarios().toString());
//		System.out.println(uTESTE.toString());
		

//		if (Validadora.validarUsuario(usuario)) {
//			JOptionPane.showMessageDialog(null, "entre nessa porra", "lixo", JOptionPane.OK_CANCEL_OPTION);
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "digite certo", "lixo", JOptionPane.OK_CANCEL_OPTION);
//		}
		
		//System.out.println(BaseDados.getUsuarios().get(2));
		//System.out.println(BaseDados.getUsuarios().get(2).getLogin());
		//System.out.println(BaseDados.getUsuarios().get(2).getSenha());
		//System.out.println(BaseDados.getUsuarios().get(1));
		//BaseDados.getUsuarios().set(1, new Usuario("lixo", "eu"));
		//System.out.println(BaseDados.getUsuarios().get(1));
		
		
	}

}
