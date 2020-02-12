package Modelo;

import Vista.Login;
import Vista.MenuAdminMusica;
import Vista.MenuAdminUsuarios;
import Vista.MenuPlaylist;
import Vista.MenuPrincipal;
import Vista.Registro;

public class Modelo {
	private Login vistaLogin;
	private Registro vistaRegistro;
	private MenuAdminUsuarios vistaAdminUsuario;
	private MenuAdminMusica vistaAdminMusica;
	private MenuPrincipal vistaPrincipal;
	private MenuPlaylist vistaPlaylist;

	public void setVistaLogin(Login vistaLogin) {
		this.vistaLogin = vistaLogin;
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

	public void setVistaPrincipal(MenuPrincipal vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
	}

	public void setVistaPlaylist(MenuPlaylist vistaPlaylist) {
		this.vistaPlaylist = vistaPlaylist;
	}

}
