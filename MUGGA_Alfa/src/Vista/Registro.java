package Vista;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.UIManager;

import Controlador.Controlador;
import Modelo.Modelo;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {
	private Controlador controlador;
	private Modelo modelo;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField textField;
	private JTextField txtUsuario;
	private JPasswordField pswRepetir;
	private JPasswordField pswContraseña;
	private JButton btnRegistrarse;
	private JButton btnVolver;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblMail;
	private JLabel lblUsuario;
	private JLabel lblContraseña;
	private JLabel lblRepitaContraseña;
	private JLabel lblNewLabel;
	private JLabel lblRegistro;

	public Registro() {

		setType(Type.POPUP);
		setTitle("Mugga (Registro)");
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\programas\\java-2019-09\\eclipse\\pr\\imagen\\JPEG_Color_Azul_redimensionada.jpg"));
		getContentPane().setForeground(UIManager.getColor("Menu.selectionBackground"));
		this.getContentPane().setBackground(Color.BLACK);

		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().setLayout(null);

		lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblRegistro.setFont(new Font("Verdana", Font.PLAIN, 43));
		lblRegistro.setBounds(419, 71, 179, 111);
		getContentPane().add(lblRegistro);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(280, 254, 100, 25);
		getContentPane().add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNombre.setBounds(358, 254, 150, 25);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblApellidos.setBounds(280, 291, 100, 25);
		getContentPane().add(lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtApellidos.setBounds(358, 291, 150, 25);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);

		lblMail = new JLabel("Correo:");
		lblMail.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMail.setBounds(280, 328, 100, 25);
		getContentPane().add(lblMail);

		textField = new JTextField();
		textField.setBounds(358, 326, 150, 25);
		getContentPane().add(textField);
		textField.setColumns(10);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(555, 254, 100, 25);
		getContentPane().add(lblUsuario);

		JLabel gif = new JLabel("");
		gif.setBounds(-23, -5, 200, 112);
		getContentPane().add(gif);
		gif.setIcon(new ImageIcon(
				"D:\\programas\\java-2019-09\\eclipse\\pr\\imagen\\picasion.com_82021399a5189f84d53f55f8b86fa6a0.gif"));

		lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContraseña.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblContraseña.setBounds(555, 291, 100, 25);
		getContentPane().add(lblContraseña);

		lblRepitaContraseña = new JLabel("Repita \r");
		lblRepitaContraseña.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRepitaContraseña.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblRepitaContraseña.setBounds(555, 320, 100, 25);
		getContentPane().add(lblRepitaContraseña);

		lblNewLabel = new JLabel("Contrase\u00F1a:");
		lblNewLabel.setForeground(UIManager.getColor("Menu.selectionBackground"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(555, 335, 100, 25);
		getContentPane().add(lblNewLabel);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(645, 254, 150, 25);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		pswContraseña = new JPasswordField();
		pswContraseña.setBounds(645, 291, 150, 25);
		getContentPane().add(pswContraseña);

		pswRepetir = new JPasswordField();
		pswRepetir.setBounds(645, 326, 150, 25);
		getContentPane().add(pswRepetir);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRegistrarse.setBounds(448, 397, 150, 50);
		getContentPane().add(btnRegistrarse);

		btnVolver = new JButton("");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.volverLogin();

			}
		});
		btnVolver.setBounds(10, 499, 100, 56);
		btnVolver.setIcon(new ImageIcon("D:\\\\programas\\\\java-2019-09\\\\eclipse\\\\pr\\\\imagen\\\\volver.png"));
		getContentPane().add(btnVolver);

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
