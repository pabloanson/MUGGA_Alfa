package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;

import Controlador.Controlador;
import Modelo.Modelo;

public class MenuAdminMusica extends JFrame {
	private Controlador controlador;
	private Modelo modelo;

	private JButton btnGestinDeUsuarios;
	private JButton btnLogOut;
	private JButton btnGestinDeMsica;
	private JTextField txtBuscarMusica;
	private JButton btnBuscarMusica;
	private JLabel lblListaDeMusica;
	private JPanel panelListaMusica;
	private JSeparator separatorListaMusica;
	private JScrollPane scrollPaneListaMusica;
	private JPanel panelAddMusica;
	private JSeparator separadorAdd;
	private JLabel lblAdministrador;
	private JLabel lblAddMusica;
	private JPanel panel;
	private JLabel gif;
	private JButton btnGestinDeMusica;

	public MenuAdminMusica() {

		setType(Type.POPUP);
		setTitle("Mugga (Admin)");
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuAdminMusica.class.getResource("/imagen/JPEG_Color_Azul_redimensionada.jpg")));
		getContentPane().setForeground(UIManager.getColor("Menu.selectionBackground"));
		this.getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);

		btnLogOut = new JButton("Log Out");
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.LogOut();
			}
		});

		btnGestinDeUsuarios = new JButton("Gesti\u00F3n de Usuarios");
		btnGestinDeUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.GUsuarios();
			}
		});

		panel = new JPanel();
		panel.setBounds(43, 93, 258, 430);
		getContentPane().add(panel);
		panel.setLayout(null);

		btnLogOut.setBounds(78, 72, 104, 42);
		panel.add(btnLogOut);
		
		btnGestinDeMusica = new JButton("Gesti\u00F3n de Musica");
		btnGestinDeMusica.setBounds(10, 139, 238, 96);
		panel.add(btnGestinDeMusica);
		btnGestinDeMusica.setFont(new Font("Tahoma", Font.PLAIN, 22));

		lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAdministrador.setBounds(74, 10, 128, 52);
		panel.add(lblAdministrador);

		btnGestinDeUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnGestinDeUsuarios.setBounds(10, 284, 238, 96);
		panel.add(btnGestinDeUsuarios);

		btnGestinDeMsica.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnGestinDeMsica.setBounds(10, 283, 238, 96);
		panel.add(btnGestinDeMsica);

		gif = new JLabel("");
		gif.setBounds(-23, -5, 200, 99);
		getContentPane().add(gif);
		gif.setIcon(new ImageIcon(MenuAdminMusica.class.getResource("/imagen/gifRedimendionado.gif")));

		panelListaMusica = new JPanel();
		panelListaMusica.setBounds(343, 48, 657, 304);
		getContentPane().add(panelListaMusica);
		panelListaMusica.setLayout(null);

		lblListaDeMusica = new JLabel("Lista de M\u00FAsica");
		lblListaDeMusica.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblListaDeMusica.setBounds(10, 10, 289, 50);
		panelListaMusica.add(lblListaDeMusica);

		btnBuscarMusica = new JButton("Buscar");
		btnBuscarMusica.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBuscarMusica.setBounds(503, 18, 120, 35);
		panelListaMusica.add(btnBuscarMusica);

		txtBuscarMusica = new JTextField();
		txtBuscarMusica.setVisible(false);
		txtBuscarMusica.setBounds(354, 18, 150, 35);
		panelListaMusica.add(txtBuscarMusica);
		txtBuscarMusica.setColumns(10);

		separatorListaMusica = new JSeparator();
		separatorListaMusica.setBounds(-10, 55, 667, 2);
		panelListaMusica.add(separatorListaMusica);

		scrollPaneListaMusica = new JScrollPane();
		scrollPaneListaMusica.setBounds(0, 55, 657, 249);
		panelListaMusica.add(scrollPaneListaMusica);

		panelAddMusica = new JPanel();
		panelAddMusica.setBounds(343, 370, 657, 153);
		getContentPane().add(panelAddMusica);
		panelAddMusica.setLayout(null);

		lblAddMusica = new JLabel("A\u00F1adir M\u00FAsica");
		lblAddMusica.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAddMusica.setBounds(246, 10, 257, 36);
		panelAddMusica.add(lblAddMusica);

		separadorAdd = new JSeparator();
		separadorAdd.setBounds(0, 48, 657, 9);
		panelAddMusica.add(separadorAdd);

		setBounds(100, 100, 1036, 602);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

}
