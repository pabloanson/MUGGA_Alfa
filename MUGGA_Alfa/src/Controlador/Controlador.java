package Controlador;

import Modelo.Modelo;
import Vista.Login;
import Vista.MenuAdminMusica;
import Vista.MenuAdminUsuarios;
import Vista.MenuPlaylist;
import Vista.MenuPrincipal;
import Vista.Registro;

public class Controlador {
	private Modelo modelo;
	private Login vistaLogin;
	private Registro vistaRegistro;
	private MenuAdminUsuarios vistaAdminUsuario;
	private MenuAdminMusica vistaAdminMusica;
	private MenuPrincipal vistaPrincipal;
	private MenuPlaylist vistaPlaylist;
	
	public Controlador() {
		
	}

	public void LogOut() {
		this.vistaAdminMusica.dispose();
		;
		this.vistaLogin.setVisible(true);
	}

	public void LogOutAdmin() {
		this.vistaAdminUsuario.dispose();
		;
		this.vistaLogin.setVisible(true);
	}

	public void gestionUsuarios() {
		this.vistaAdminMusica.dispose();
		;
		this.vistaAdminUsuario.setVisible(true);

	}

	public void gestionMusica() {
		this.vistaAdminUsuario.dispose();
		;
		this.vistaAdminMusica.setVisible(true);
	}

	// Login - Principal
	public void login() {
		this.vistaLogin.dispose();
		;
		this.vistaPrincipal.setVisible(true);
	}

	// Login - Registro
	public void registro() {
		this.vistaLogin.dispose();
		;
		this.vistaRegistro.setVisible(true);
	}

	// Login - Admin
	public void admin() {
		this.vistaLogin.dispose();
		;
		this.vistaAdminMusica.setVisible(true);
	}

	// Registro - Vuelta al login
	public void volverLogin() {
		this.vistaRegistro.dispose();
		;
		this.vistaLogin.setVisible(true);
	}

	// Principal - Playlist
	public void crearPlaylist() {
		this.vistaPrincipal.dispose();
		;
		this.vistaPlaylist.setVisible(true);
	}

	// Playlist - Principal
	public void volverPrincipal() {
		this.vistaPlaylist.dispose();
		;
		this.vistaPrincipal.setVisible(true);
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public void setVistaRegistro(Registro vistaRegistro) {
		this.vistaRegistro = vistaRegistro;
	}

	public void setVistaAdminUsuario(MenuAdminUsuarios vistaAdminUsuario) {
		this.vistaAdminUsuario = vistaAdminUsuario;
	}

	public void setVistaAdminMusica(MenuAdminMusica vistaAdminMusica) {
		this.vistaAdminMusica = vistaAdminMusica;
	}

	public void setVistaLogin(Login vistaLogin) {
		this.vistaLogin = vistaLogin;
	}

	public void setVistaPrincipal(MenuPrincipal vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
	}

	public void setVistaPlaylist(MenuPlaylist vistaPlaylist) {
		this.vistaPlaylist = vistaPlaylist;
	}

}
