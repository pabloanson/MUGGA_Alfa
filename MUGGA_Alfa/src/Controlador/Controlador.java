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
		if (vistaLogin != null) {
			this.vistaLogin.setVisible(true);
		} else {
			this.vistaLogin = new Login();
			this.vistaLogin.setControlador(this);
			this.vistaLogin.setModelo(modelo);
			this.vistaLogin.setVisible(true);
		}
	}

	public void LogOutAdmin() {
		this.vistaAdminUsuario.dispose();
		if (vistaLogin != null) {
			this.vistaLogin.setVisible(true);
		} else {
			this.vistaLogin = new Login();
			this.vistaLogin.setControlador(this);
			this.vistaLogin.setModelo(modelo);
			this.vistaLogin.setVisible(true);
		}
	}

	public void GMusica() {
		this.vistaAdminMusica.dispose();
		if (vistaAdminUsuario != null) {
			this.vistaAdminUsuario.setVisible(true);
		} else {
			this.vistaAdminUsuario = new MenuAdminUsuarios();
			this.vistaAdminUsuario.setControlador(this);
			this.vistaAdminUsuario.setModelo(modelo);
			this.vistaAdminUsuario.setVisible(true);
		}
	}

	public void GUsuarios() {
		this.vistaAdminUsuario.dispose();
		if (vistaAdminMusica != null) {
			this.vistaAdminMusica.setVisible(true);
		} else {
			this.vistaAdminMusica = new MenuAdminMusica();
			this.vistaAdminMusica.setControlador(this);
			this.vistaAdminMusica.setModelo(modelo);
			this.vistaAdminMusica.setVisible(true);
		}
	}

	// Login - Principal
	public void login() {
		this.vistaLogin.dispose();
		if (vistaPrincipal != null) {
			this.vistaPrincipal.setVisible(true);
		} else {
			this.vistaPrincipal = new MenuPrincipal();
			this.vistaPrincipal.setControlador(this);
			this.vistaPrincipal.setModelo(modelo);
			this.vistaPrincipal.setVisible(true);
		}
	}

	// Login - Registro
	public void registro() {
		this.vistaLogin.dispose();
		if (vistaRegistro != null) {
			this.vistaRegistro.setVisible(true);
		} else {
			this.vistaRegistro = new Registro();
			this.vistaRegistro.setControlador(this);
			this.vistaRegistro.setModelo(modelo);
			this.vistaRegistro.setVisible(true);
		}
	}

	// Login - Admin
	public void admin() {
		this.vistaLogin.dispose();
		if (vistaAdminUsuario != null) {
			this.vistaAdminUsuario.setVisible(true);
		} else {
			this.vistaAdminUsuario = new MenuAdminUsuarios();
			this.vistaAdminUsuario.setControlador(this);
			this.vistaAdminUsuario.setModelo(modelo);
			this.vistaAdminUsuario.setVisible(true);
		}
	}

	// Registro - Vuelta al login
	public void volverLogin() {
		this.vistaRegistro.dispose();
		if (vistaLogin != null) {
			this.vistaLogin.setVisible(true);
		} else {
			this.vistaLogin = new Login();
			this.vistaLogin.setControlador(this);
			this.vistaLogin.setModelo(modelo);
			this.vistaLogin.setVisible(true);
		}
	}

	// Principal - Playlist
	public void crearPlaylist() {
		this.vistaPrincipal.dispose();
		if (vistaPlaylist != null) {
			this.vistaPlaylist.setVisible(true);
		} else {
			this.vistaPlaylist = new MenuPlaylist();
			this.vistaPlaylist.setControlador(this);
			this.vistaPlaylist.setModelo(modelo);
			this.vistaPlaylist.setVisible(true);
		}
	}

	// Principal - Login
	public void LogOutUsuario() {
		this.vistaPrincipal.dispose();
		if (vistaLogin != null) {
			this.vistaLogin.setVisible(true);
		} else {
			this.vistaLogin = new Login();
			this.vistaLogin.setControlador(this);
			this.vistaLogin.setModelo(modelo);
			this.vistaLogin.setVisible(true);
		}
	}

	// Playlist - Principal
	public void volverPrincipal() {
		this.vistaPlaylist.dispose();
		if (vistaPrincipal != null) {
			this.vistaPrincipal.setVisible(true);
		} else {
			this.vistaPrincipal = new MenuPrincipal();
			this.vistaPrincipal.setControlador(this);
			this.vistaPrincipal.setModelo(modelo);
			this.vistaPrincipal.setVisible(true);
		}
	}

	// Playlist - Login
	public void LogOutPlaylist() {
		this.vistaPlaylist.dispose();
		if (vistaLogin != null) {
			this.vistaLogin.setVisible(true);
		} else {
			this.vistaLogin = new Login();
			this.vistaLogin.setControlador(this);
			this.vistaLogin.setModelo(modelo);
			this.vistaLogin.setVisible(true);
		}
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public void setVistaLogin(Login vistaLogin) {
		this.vistaLogin = vistaLogin;
	}

}
