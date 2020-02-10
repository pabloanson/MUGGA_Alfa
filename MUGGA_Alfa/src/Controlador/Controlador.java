package Controlador;

import Vista.MenuAdminMusica;
import Vista.MenuAdminUsuarios;
import Vista.Registro;

public class Controlador {
private Registro vistaRegistro;
private MenuAdminUsuarios vistaAdminUsuario;
private MenuAdminMusica vistaAdminMusica;

public void setVistaRegistro(Registro vistaRegistro) {
	this.vistaRegistro = vistaRegistro;
}


public void setVistaAdminUsuario(MenuAdminUsuarios vistaAdminUsuario) {
	this.vistaAdminUsuario = vistaAdminUsuario;
}


public void setVistaAdminMusica(MenuAdminMusica vistaAdminMusica) {
	this.vistaAdminMusica = vistaAdminMusica;
}


public void gestionUsuarios() {
	vistaAdminMusica.setVisible(false);
	vistaAdminUsuario.setVisible(true);
	
}
public void gestionMusica() {
	vistaAdminUsuario.setVisible(false);
	vistaAdminMusica.setVisible(true);
}
}
