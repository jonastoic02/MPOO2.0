package login;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BaseDados {

	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static boolean adicionarUsuario(Usuario usuario) {
		
		if (isUsuario(usuario)) {
			//JOptionPane.showMessageDialog(null, "Já se cadastrou");
			return false;
		}
		return usuarios.add(usuario);
		
		// Questionamento: Como fazer para saber qual o tipo de erro ocasionado e como tratar
	}
	
	public static boolean isUsuario(Usuario usuario) {
		for (Usuario usuario2 : usuarios) {
			if (usuario.getLogin().equalsIgnoreCase(usuario2.getLogin())
					&&
				usuario.getSenha().equals(usuario2.getSenha())) 
			{
				return true;
			}
		}
		return false;
	}
	
	public static String buscarrUsuario(String login){
		for(Usuario user: usuarios){
			if (user.getLogin().equalsIgnoreCase(login)) {	
				return user.getSenha();
			}			
		}	
		return null;
		
	}
	
	public static Usuario buscarUsuario(String login){
		for(Usuario user: usuarios){
			if (user.getLogin().equalsIgnoreCase(login)) {
				return user;
			}			
		}	
		return null;
	}
	
	public static ArrayList<String> buscarUsuario(Usuario usuario){
		ArrayList<String> dados = new ArrayList<>();
		for (Usuario user : usuarios) {
			if(user.getLogin().equalsIgnoreCase(usuario.getLogin())){
				dados.add(user.getLogin());
				dados.add(user.getSenha());
				break;				
			}
		}
		return dados;
	}
	
	public static void removerUsuario(String login){
		Usuario usuario = buscarUsuario(login);
		if(usuario != null){
			usuarios.remove(usuario);
			JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
		}
	}
	
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	// Quais o collections para lista?
	// Quais as diferenças entres tais
	
}
