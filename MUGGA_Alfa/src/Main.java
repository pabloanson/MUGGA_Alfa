import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Login;
import Vista.MenuAdminMusica;
import Vista.MenuAdminUsuarios;
import Vista.MenuPlaylist;
import Vista.MenuPrincipal;
import Vista.Registro;

public class Main {
	private void Iniciar() {
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador();
		Login vistaLogin = new Login();
		Registro vistaRegistro = new Registro();
		MenuPrincipal vistaPrincipal = new MenuPrincipal();
		MenuAdminMusica vistaAdminMusica = new MenuAdminMusica();
		MenuAdminUsuarios vistaAdminUsuarios = new MenuAdminUsuarios();
		MenuPlaylist vistaPlaylist = new MenuPlaylist();

		modelo.setVistaAdminMusica(vistaAdminMusica);
		modelo.setVistaAdminUsuario(vistaAdminUsuarios);
		modelo.setVistaLogin(vistaLogin);
		modelo.setVistaPlaylist(vistaPlaylist);
		modelo.setVistaPrincipal(vistaPrincipal);
		modelo.setVistaRegistro(vistaRegistro);

		vistaLogin.setControlador(controlador);
		vistaRegistro.setControlador(controlador);
		vistaPrincipal.setControlador(controlador);
		vistaAdminMusica.setControlador(controlador);
		vistaAdminUsuarios.setControlador(controlador);
		vistaPlaylist.setControlador(controlador);

		controlador.setVistaAdminMusica(vistaAdminMusica);
		controlador.setVistaAdminUsuario(vistaAdminUsuarios);
		controlador.setVistaLogin(vistaLogin);
		controlador.setVistaPlaylist(vistaPlaylist);
		controlador.setVistaPrincipal(vistaPrincipal);
		controlador.setVistaRegistro(vistaRegistro);

		vistaLogin.setVisible(true);

	}

	public static void main(String[] args) {
		new Main().Iniciar();
	}
}
