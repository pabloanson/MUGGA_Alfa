package Vista;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import Controlador.Controlador;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class MenuAdminUsuarios extends JFrame {
	private Controlador controlador;
	private JButton btnGestinDeUsuarios;
	private JButton btnLogOut;
	private JButton btnGestinDeMsica;
	private JTextField txtUsuario;
	private JButton btnBuscarUsuario;
	private JPanel panelUsuarios;
	private JLabel lblListaDeUsuarios;
	private JSeparator separadorUsuario;
	private JScrollPane scrollPaneUsuario;


	public MenuAdminUsuarios() {
		
		setType(Type.POPUP);
		setTitle("Mugga (Admin)");
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\programas\\java-2019-09\\eclipse\\pr\\imagen\\JPEG_Color_Azul_redimensionada.jpg"));
		getContentPane().setForeground(UIManager.getColor("Menu.selectionBackground"));
		this.getContentPane().setBackground(Color.BLACK);	
		getContentPane().setLayout(null);
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnGestinDeMsica = new JButton("Gesti\u00F3n de M\u00FAsica");
		btnGestinDeMsica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.gestionMusica();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 93, 258, 430);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		btnLogOut.setBounds(78, 72, 104, 42);
		panel.add(btnLogOut);
		
		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAdministrador.setBounds(74, 10, 128, 52);
		panel.add(lblAdministrador);
		
		btnGestinDeUsuarios = new JButton("Gesti\u00F3n de Usuarios");
		btnGestinDeUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnGestinDeUsuarios.setBounds(10, 145, 238, 96);
		panel.add(btnGestinDeUsuarios);
		
		
		btnGestinDeMsica.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnGestinDeMsica.setBounds(10, 283, 238, 96);
		panel.add(btnGestinDeMsica);
		
		JLabel gif = new JLabel("");
		gif.setBounds(-23, -5, 200, 99);
		getContentPane().add(gif);
		gif.setIcon(new ImageIcon("D:\\programas\\java-2019-09\\eclipse\\pr\\imagen\\picasion.com_82021399a5189f84d53f55f8b86fa6a0.gif"));
		
		panelUsuarios = new JPanel();
		panelUsuarios.setBounds(340, 48, 660, 487);
		getContentPane().add(panelUsuarios);
		panelUsuarios.setLayout(null);
		
		lblListaDeUsuarios = new JLabel("Lista de Usuarios");
		lblListaDeUsuarios.setBounds(10, 10, 210, 31);
		lblListaDeUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelUsuarios.add(lblListaDeUsuarios);
		
		separadorUsuario = new JSeparator();
		separadorUsuario.setBounds(0, 42, 660, 10);
		panelUsuarios.add(separadorUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(400, 10, 125, 31);
		panelUsuarios.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnBuscarUsuario = new JButton("Buscar");
		btnBuscarUsuario.setRequestFocusEnabled(false);
		btnBuscarUsuario.setRolloverEnabled(false);
		btnBuscarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBuscarUsuario.setBounds(524, 10, 100, 31);
		panelUsuarios.add(btnBuscarUsuario);
		
		scrollPaneUsuario = new JScrollPane();
		scrollPaneUsuario.setBounds(0, 62, 660, 425);
		panelUsuarios.add(scrollPaneUsuario);
		
		
		
		setBounds(100, 100, 1036, 602);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public Controlador getControlador() {
		return controlador;
	}


	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	
}
