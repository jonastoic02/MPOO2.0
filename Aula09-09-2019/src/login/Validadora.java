package login;

import javax.swing.JOptionPane;

public class Validadora {
	
	public static boolean validarUsuario(Usuario usuario) {
		
		// Maneira 1
		/*
		for (int i = 0; i < BaseDados.getUsuarios().size(); i++) {
			
			if (usuario.getLogin().equalsIgnoreCase(BaseDados.getUsuarios().get(i).getLogin())
					&&
				usuario.getSenha().equals(BaseDados.getUsuarios().get(i).getSenha())) {
				return true;
			}
		}
		return false;
		*/
		
		// Maneira 2
		/*
		for (Usuario usuario2 : BaseDados.getUsuarios()) {
			if (usuario.getLogin().equalsIgnoreCase(usuario2.getLogin())
					&&
				usuario.getSenha().equals(usuario2.getSenha())) 
			{
				return true;
			}
		}
		*/
		
		if (BaseDados.isUsuario(usuario)) {
			return true;
		}
		return false;
		
	}
	
}
