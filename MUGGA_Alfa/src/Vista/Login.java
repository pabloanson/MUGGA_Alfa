package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.UIManager;

import Controlador.Controlador;
import Modelo.Modelo;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	private Controlador controlador;
	private Modelo modelo;
	private JTextField txtUsuario;
	private JTextField txtPassword;
	private JButton btnLogin;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JLabel lblLogin;
	private JLabel gif;
	private JButton btnNoTienesCuenta;
	private JButton btnAdmin;

	public Login() {

		setType(Type.POPUP);
		setTitle("Mugga (Login)");
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		getContentPane().setForeground(UIManager.getColor("Menu.selectionBackground"));
		this.getContentPane().setBackground(Color.BLACK);

		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().setLayout(null);

		lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblLogin.setFont(new Font("Verdana", Font.PLAIN, 43));
		lblLogin.setBounds(448, 21, 150, 80);
		getContentPane().add(lblLogin);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(357, 254, 60, 25);
		getContentPane().add(lblUsuario);

		lblPassword = new JLabel("Contraseña:");
		lblPassword.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(357, 291, 79, 25);
		getContentPane().add(lblPassword);

		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPassword.setBounds(448, 291, 150, 25);
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);

		gif = new JLabel("");
		gif.setBounds(448, 113, 155, 112);
		getContentPane().add(gif);
//		gif.setIcon(new ImageIcon(getClass().getResource("/imagen/picasion.com_82021399a5189f84d53f55f8b86fa6a0.gif")).getImage());

		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsuario.setBounds(448, 254, 150, 25);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.login();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(448, 328, 150, 50);
		getContentPane().add(btnLogin);

		btnNoTienesCuenta = new JButton("Registro");
		btnNoTienesCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.registro();
			}
		});
		btnNoTienesCuenta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNoTienesCuenta.setBounds(490, 390, 69, 35);
		getContentPane().add(btnNoTienesCuenta);

		btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.admin();
			}
		});
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAdmin.setBounds(931, 517, 69, 35);
		getContentPane().add(btnAdmin);

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
