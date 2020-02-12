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

		modelo.setVistaLogin(vistaLogin);

		vistaLogin.setControlador(controlador);
		controlador.setVistaLogin(vistaLogin);

		vistaLogin.setVisible(true);

	}

	public static void main(String[] args) {
		new Main().Iniciar();
	}
}
