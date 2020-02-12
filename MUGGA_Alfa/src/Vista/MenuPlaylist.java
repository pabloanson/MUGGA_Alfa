package Vista;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.UIManager;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPlaylist extends JFrame {
	private Controlador controlador;
	private Modelo modelo;

	private JLabel lblPlaylist;
	private JList list;
	private JScrollPane scrollPlaylist;
	private JLabel lblIconoUser;
	private JButton btnLogOut;
	private JButton btnCrearPlaylist;
	private JPanel panelUsrPlaylist;
	private JPanel panelPrincipal;
	private JSeparator separadorMusica;
	private JPanel panelReproductor;
	private JPanel panelMusicAct;
	private JLabel imgMActu;
	private JLabel lblTtuloActual;
	private JLabel lblArtistaActual;
	private JPanel panelPublicidad;
	private JLabel lblPublicidad;
	private JLabel lblRecomendados;
	private JLabel lblArtistaTtulo;
	private JLabel icn1;
	private JLabel icn2;
	private JLabel lblArtistaTitulo2;
	private JLabel icn3;
	private JLabel lblArtistaTitulo3;
	private JLabel icn4;
	private JLabel lblArtistaTitulo4;
	private JLabel icn5;
	private JLabel lblArtistaTitulo5;
	private JSeparator separatorRecomendados;
	private JPanel panelRecomendados;
	private JTextField buscador;
	private JButton btnBuscar;
	private JButton btnPlay;
	private JButton btnPrev;
	private JButton btnRand;
	private JButton btnNext;
	private JButton btnRepeat;
	private JButton btnLike;
	private JLabel lblDescripcion;
	private JButton btnCrear;
	private TextArea textArea;
	private JTextField txtNombre;
	private JLabel lblNombre;
	private JButton btnVolver;
	private final JLabel gif = new JLabel("");

	public MenuPlaylist() {

		setType(Type.POPUP);
		setTitle("Menu Principal (Playlist)");
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPlaylist.class.getResource("/imagen/JPEG_Color_Azul_redimensionada.jpg")));
		getContentPane().setForeground(UIManager.getColor("Menu.selectionBackground"));
		this.getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
//		this.setIconImage(new ImageIcon(getClass().getResource("/imagen/...")).getImage());

		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		getContentPane().setLayout(null);

		panelUsrPlaylist = new JPanel();
		panelUsrPlaylist.setBounds(10, 182, 140, 337);
		getContentPane().add(panelUsrPlaylist);
		panelUsrPlaylist.setLayout(null);

		btnCrearPlaylist = new JButton("Crear");
		btnCrearPlaylist.setBounds(26, 398, 77, 29);
		panelUsrPlaylist.add(btnCrearPlaylist);

		btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.LogOutPlaylist();
			}
		});
		btnLogOut.setBounds(30, 89, 83, 29);
		panelUsrPlaylist.add(btnLogOut);

		lblIconoUser = new JLabel("");
		lblIconoUser.setIcon(new ImageIcon(MenuPlaylist.class.getResource("/imagen/man-icon.jpg")));
		lblIconoUser.setBounds(34, 10, 69, 69);
		panelUsrPlaylist.add(lblIconoUser);
		
				list = new JList();
				list.setBounds(8, 128, 120, 161);
				panelUsrPlaylist.add(list);
				list.setModel(new AbstractListModel() {
					String[] values = new String[] { "Playlist1", "Playlist2", "Playlist3", "Playlist4", "Playlist5",
							"Playlist6", "Playlist7", "Playlist8", "Playlist9", "Playlist10" };

					public int getSize() {
						return values.length;
					}

					public Object getElementAt(int index) {
						return values[index];
					}
				});

		scrollPlaylist = new JScrollPane();
		scrollPlaylist.setBounds(6, 128, 122, 163);
		panelUsrPlaylist.add(scrollPlaylist);

		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(162, 86, 688, 433);
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);

		separadorMusica = new JSeparator();
		separadorMusica.setBounds(0, 40, 688, 12);
		panelPrincipal.add(separadorMusica);

		lblPlaylist = new JLabel("Crear Playlist");
		lblPlaylist.setBounds(16, 6, 183, 28);
		panelPrincipal.add(lblPlaylist);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(20, 78, 61, 16);
		panelPrincipal.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(16, 97, 130, 26);
		panelPrincipal.add(txtNombre);
		txtNombre.setColumns(10);

		lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(20, 130, 89, 16);
		panelPrincipal.add(lblDescripcion);

		btnCrear = new JButton("Crear");
		btnCrear.setBounds(319, 334, 70, 29);
		panelPrincipal.add(btnCrear);

		textArea = new TextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(20, 155, 165, 124);
		panelPrincipal.add(textArea);

		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.volverPrincipal();
			}
		});
		btnVolver.setBounds(612, 398, 70, 29);
		panelPrincipal.add(btnVolver);

		panelRecomendados = new JPanel();
		panelRecomendados.setBounds(860, 227, 143, 292);
		getContentPane().add(panelRecomendados);
		panelRecomendados.setLayout(null);

		lblRecomendados = new JLabel("Recomendados");
		lblRecomendados.setBounds(23, 6, 95, 16);
		panelRecomendados.add(lblRecomendados);

		separatorRecomendados = new JSeparator();
		separatorRecomendados.setBounds(0, 25, 143, 12);
		panelRecomendados.add(separatorRecomendados);

		icn1 = new JLabel("");
		icn1.setIcon(new ImageIcon("/Users/ruben/Downloads/pngocean.com.png"));
		icn1.setBounds(10, 41, 20, 20);
		panelRecomendados.add(icn1);

		icn2 = new JLabel("");
		icn2.setIcon(new ImageIcon("/Users/ruben/Downloads/pngocean.com.png"));
		icn2.setBounds(11, 70, 20, 20);
		panelRecomendados.add(icn2);

		icn3 = new JLabel("");
		icn3.setIcon(new ImageIcon("/Users/ruben/Downloads/pngocean.com.png"));
		icn3.setBounds(10, 102, 20, 20);
		panelRecomendados.add(icn3);

		icn4 = new JLabel("");
		icn4.setIcon(new ImageIcon("/Users/ruben/Downloads/pngocean.com.png"));
		icn4.setBounds(10, 134, 20, 20);
		panelRecomendados.add(icn4);

		icn5 = new JLabel("");
		icn5.setIcon(new ImageIcon("/Users/ruben/Downloads/pngocean.com.png"));
		icn5.setBounds(10, 166, 20, 20);
		panelRecomendados.add(icn5);

		lblArtistaTtulo = new JLabel("Artista - Título");
		lblArtistaTtulo.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblArtistaTtulo.setBounds(39, 45, 79, 16);
		panelRecomendados.add(lblArtistaTtulo);

		lblArtistaTitulo2 = new JLabel("Artista - Título");
		lblArtistaTitulo2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblArtistaTitulo2.setBounds(39, 74, 79, 16);
		panelRecomendados.add(lblArtistaTitulo2);

		lblArtistaTitulo3 = new JLabel("Artista - Título");
		lblArtistaTitulo3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblArtistaTitulo3.setBounds(39, 106, 79, 16);
		panelRecomendados.add(lblArtistaTitulo3);

		lblArtistaTitulo4 = new JLabel("Artista - Título");
		lblArtistaTitulo4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblArtistaTitulo4.setBounds(39, 138, 79, 16);
		panelRecomendados.add(lblArtistaTitulo4);

		lblArtistaTitulo5 = new JLabel("Artista - Título");
		lblArtistaTitulo5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblArtistaTitulo5.setBounds(39, 170, 79, 16);
		panelRecomendados.add(lblArtistaTitulo5);

		panelPublicidad = new JPanel();
		panelPublicidad.setBounds(876, 86, 143, 122);
		getContentPane().add(panelPublicidad);
		panelPublicidad.setLayout(null);

		lblPublicidad = new JLabel("Publicidad");
		lblPublicidad.setBounds(39, 51, 65, 16);
		panelPublicidad.add(lblPublicidad);

		buscador = new JTextField();
		buscador.setToolTipText("");
		buscador.setBounds(874, 19, 149, 32);
		getContentPane().add(buscador);
		buscador.setColumns(10);

		panelReproductor = new JPanel();
		panelReproductor.setBounds(162, 531, 688, 32);
		getContentPane().add(panelReproductor);
		panelReproductor.setLayout(null);

		btnPlay = new JButton(new ImageIcon("/imagen/playbtn.jpg"));
		btnPlay.setBounds(300, 5, 20, 20);
		panelReproductor.add(btnPlay);

		btnRepeat = new JButton((Icon) null);
		btnRepeat.setBounds(420, 5, 20, 20);
		panelReproductor.add(btnRepeat);

		btnPrev = new JButton((Icon) null);
		btnPrev.setBounds(240, 5, 20, 20);
		panelReproductor.add(btnPrev);

		btnRand = new JButton((Icon) null);
		btnRand.setBounds(180, 5, 20, 20);
		panelReproductor.add(btnRand);

		btnLike = new JButton((Icon) null);
		btnLike.setBounds(480, 5, 20, 20);
		panelReproductor.add(btnLike);

		btnNext = new JButton((Icon) null);
		btnNext.setBounds(360, 5, 20, 20);
		panelReproductor.add(btnNext);

		panelMusicAct = new JPanel();
		panelMusicAct.setBounds(68, 531, 64, 32);
		getContentPane().add(panelMusicAct);
		panelMusicAct.setLayout(null);

		lblTtuloActual = new JLabel("Título");
		lblTtuloActual.setFont(new Font("Lucida Grande", Font.BOLD, 8));
		lblTtuloActual.setBounds(34, 0, 31, 16);
		panelMusicAct.add(lblTtuloActual);

		lblArtistaActual = new JLabel("Artista");
		lblArtistaActual.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		lblArtistaActual.setBounds(34, 10, 31, 16);
		panelMusicAct.add(lblArtistaActual);

		imgMActu = new JLabel("");
		imgMActu.setIcon(new ImageIcon("/Users/ruben/Downloads/icono-img.png"));
		imgMActu.setBounds(6, 2, 24, 24);
		panelMusicAct.add(imgMActu);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(793, 21, 78, 29);
		getContentPane().add(btnBuscar);
		gif.setBounds(-23, -5, 200, 112);
		getContentPane().add(gif);
		gif.setIcon(new ImageIcon(MenuPlaylist.class.getResource("/imagen/gifRedimendionado.gif")));

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